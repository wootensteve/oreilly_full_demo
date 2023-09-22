package com.wootens.oreilly.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InvoiceDetailsMapper  implements RowMapper<InvoiceDetails> {

	@Override
	public InvoiceDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
