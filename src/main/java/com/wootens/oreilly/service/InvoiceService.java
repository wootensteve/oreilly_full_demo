package com.wootens.oreilly.service;

import java.util.Collection;

import com.wootens.oreilly.model.Invoice;

public interface InvoiceService {

	Collection<Invoice> retrieveCustomerInvoices(int customerId);
}
