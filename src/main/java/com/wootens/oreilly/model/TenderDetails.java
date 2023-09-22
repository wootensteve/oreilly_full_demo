/**
 * 
 */
package com.wootens.oreilly.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class TenderDetails implements Serializable {

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("type")
	private String type;

	public TenderDetails() {

	}

	public TenderDetails(BigDecimal amount, String type) {
		super();
		this.amount = amount;
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
