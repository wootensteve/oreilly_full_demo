/**
 * 
 */
package com.wootens.oreilly.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class InvoiceDetails implements Serializable {

	@JsonProperty("time")
	public String time;

	@JsonProperty("storeNumber")
	private String storeNumber;

	@JsonProperty("tenderDetails")
	private TenderDetails details;

	public InvoiceDetails() {

	}

	public InvoiceDetails(String time, String storeNumber) {
		super();
		this.time = time;
		this.storeNumber = storeNumber;
		// this.details = details;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public TenderDetails getDetails() {
		return details;
	}

	public void setDetails(TenderDetails details) {
		this.details = details;
	}

}
