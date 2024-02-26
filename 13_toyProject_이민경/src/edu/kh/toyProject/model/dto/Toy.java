package edu.kh.toyProject.model.dto;

import java.io.Serializable;

public class Toy implements Serializable{

	private String modelName; //장난감 모델명
	private int price; //장난감 가격
	private  String material; //장난감 소재
	private int userAge; // 장난감 사용 가능 나이
	private String brand; // 장난감 브랜드
	
	public Toy() {}

	public Toy(String modelName, int price, String material, int userAge, String brand) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.material = material;
		this.userAge = userAge;
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setTypes(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "[ 장난감 모델명 : " + modelName + "/ 장난감 가격 : " + price + "원/ 장난감 소재 : " + material + "/  장난감 사용 가능 나이 : " + userAge
				+ "세 이상 / 장난감 브랜드 : " + brand + "]";
	};

	
	
	
}