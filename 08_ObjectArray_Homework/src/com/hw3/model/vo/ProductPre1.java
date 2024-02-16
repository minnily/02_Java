package com.hw3.model.vo;

import com.hw3.controller.ProductControllerPre1;

public class ProductPre1 {
	
	private int pld;
	private String pName;
	private int price;
	private double tax;
	
	public ProductPre1() {
		ProductControllerPre1.count++;
	};
	
	public ProductPre1(int pld, String pName, int price, double tax) {
		super();
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}


	public int getPld() {
		return pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		return toString().format("제품 번호 : %d /  제품명 : %s / 제품 가격 : %d / 제품 세금  : %.1f", pld, pName, price, tax );
	};
	
	
	
}
