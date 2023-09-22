/**
 * 
 */
package com.wootens.oreilly.dao;

import java.util.Collection;

import com.wootens.oreilly.model.Invoice;

/**
 * 
 */
public interface InvoiceDAO {
	Collection<Invoice> retrieveCustomerInvoices(int customerId);

}
