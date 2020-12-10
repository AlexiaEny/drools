package com.secbro.drools.model;

import com.secbro.drools.model.fact.AddressCheckResult;

/**
 */
public class Address {

	private String postcode;
	
	private String street;
	
	private String state;

	private boolean postCodeResult = false;

	public boolean isPostCodeResult() {
		return postCodeResult;
	}

	public void setPostCodeResult(boolean postCodeResult) {
		this.postCodeResult = postCodeResult;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
