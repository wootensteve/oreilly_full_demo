package com.wootens.oreilly.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Invoice implements Serializable {
	@JsonProperty("customerId")
	private int customerId;

	@JsonProperty("invoiceId")
	private int invoiceId;

	@JsonProperty("invoiceDetails")
	private InvoiceDetails invoiceDetails;

	public Invoice(int customerId, int invoiceId) {
		super();
		this.customerId = customerId;
		this.invoiceId = invoiceId;
	}

	public Invoice(int customerId, int invoiceId, InvoiceDetails invoiceDetails) {
		super();
		this.customerId = customerId;
		this.invoiceId = invoiceId;
		this.invoiceDetails = invoiceDetails;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public InvoiceDetails getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

}
