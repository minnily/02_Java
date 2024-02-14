package com.hw3.model.vo;

import com.hw3.controller.ProductController2;

public class Product2 {
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public int getPId() {
		return pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
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

	public Product2() {
		ProductController2.count++;
	};
	
	public Product2(int pId, String pName, int price, double tax) {
		
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}

	public String information() {
		return "제품번호 : " + pId + ", 제품명 : " 
				+ pName + ", 가격" + price + ",세금" + tax;
	};
}
