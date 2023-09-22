

DROP TABLE IF EXISTS invoice;
CREATE TABLE invoice(customer_id int NOT NULL,
invoice_id INT NOT NULL,
invoice_data json,
PRIMARY KEY(customer_id, invoice_id));

INSERT INTO invoice VALUES(1, 54,JSON_OBJECT('time': '19:53', 'storeNumber':'999','tenderDetails':(JSON_OBJECT('amount':23.43,'type':'cash')) FORMAT JSON));
INSERT INTO invoice VALUES(2, 55,JSON_OBJECT('time': '12:00', 'storeNumber':'999','tenderDetails':(JSON_OBJECT('amount':4.95,'type':'cash')) FORMAT JSON));
INSERT INTO invoice VALUES(2, 56,JSON_OBJECT('time': '08:49', 'storeNumber':'999','tenderDetails':(JSON_OBJECT('amount':100.12,'type':'credit')) FORMAT JSON));

 -- INSERT INTO invoice VALUES(1, 54,'{"time": "19:53", "storeNumber":"999", "tenderDetails": {"amount": 23.43, "type": "cash"}}');
 -- INSERT INTO invoice VALUES(2, 55,'{"time": "12:00", "storeNumber":"999", "tenderDetails": {"amount": 4.95, "type": "cash"}}');
 -- INSERT INTO invoice VALUES(2, 56,'{"time": "08:49", "storeNumber":"999", "tenderDetails": {"amount": 100.12, "type": "credit"}}');
