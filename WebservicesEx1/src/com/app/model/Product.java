package com.app.model;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Product {
	private int prodId;
	private String prodCode;
	private double prodCost;
	@JsonIgnore
	private String prodSceret;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdSceret() {
		return prodSceret;
	}
	public void setProdSceret(String prodSceret) {
		this.prodSceret = prodSceret;
	}
}
