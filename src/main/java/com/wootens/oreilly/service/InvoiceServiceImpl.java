/**
 * 
 */
package com.wootens.oreilly.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.wootens.oreilly.dao.InvoiceDAO;
import com.wootens.oreilly.model.Invoice;

import jakarta.inject.Inject;

/**
 * 
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Inject
	InvoiceDAO dao;

	/**
	 * 
	 */
	public InvoiceServiceImpl() {
		super();
	}

	@Override
	public Collection<Invoice> retrieveCustomerInvoices(int customerId) {
		return dao.retrieveCustomerInvoices(customerId);
	}

}
