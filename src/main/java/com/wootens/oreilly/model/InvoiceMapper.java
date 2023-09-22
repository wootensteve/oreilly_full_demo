package com.wootens.oreilly.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class InvoiceMapper implements RowMapper<Invoice> {

	private final static ObjectMapper objectMapper = new ObjectMapper();

	public Invoice mapRow(ResultSet rs, int i) throws SQLException {
		Invoice invoice = new Invoice(rs.getInt("customer_id"), rs.getInt("invoice_id"));
		InvoiceDetails details;
		try {
			details = objectMapper.readValue(rs.getString("invoice_data"), InvoiceDetails.class);
			invoice.setInvoiceDetails(details);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoice;
	}
}
