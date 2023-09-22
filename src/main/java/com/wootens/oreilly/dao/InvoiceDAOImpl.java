/**
 * 
 */
package com.wootens.oreilly.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.wootens.oreilly.model.Invoice;
import com.wootens.oreilly.model.InvoiceMapper;

/**
 * 
 */
@Component
public class InvoiceDAOImpl implements InvoiceDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 
	 */
	public InvoiceDAOImpl() {
		super();
	}

	@Override
	public Collection<Invoice> retrieveCustomerInvoices(int customerId) {
		return jdbcTemplate.query("select * from invoice where customer_id=?", new InvoiceMapper(), customerId);
	}

}
