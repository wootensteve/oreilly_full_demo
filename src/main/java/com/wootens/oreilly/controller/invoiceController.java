package com.wootens.oreilly.controller;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.wootens.oreilly.model.Invoice;
import com.wootens.oreilly.service.InvoiceService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Component
@Path("/")
public class invoiceController {

	@Inject
	private InvoiceService service;

	public invoiceController() {
		super();
	}

	@GET
	@Path("{hello}")
	@Produces("application/json")
	public String helloWorld() {
		return String.format("Hello World");
	}

	@GET
	@Path("invoice/{id}")
	@Produces("application/json")
	public Collection<Invoice> findInvoice(@PathParam("id") int id) {
		return service.retrieveCustomerInvoices(id);
	}
}
