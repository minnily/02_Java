package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{
	private String operatingSystem;
	private int storageCapacity;
	public SmartPhone() {}
	public SmartPhone(String brand, String model, int year, int price,String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	};
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
//	@Override
//	public void printlnfo() {
//
//		System.out.println("Brand :" + getBrand());
//		System.out.println("Model :" + getModel());
//		System.out.println("Year :" +getYear());
//		System.out.println("Price :" + getPrice()+"원");
//		System.out.println("Operating System :" + operatingSystem);
//		System.out.println("Storage Capacity :" + storageCapacity+"GB");
//		
//	}; 
	
	@Override
	public void printlnfo() {
		
		super.printlnfo();
		System.out.println("Operating System :" + operatingSystem);
		System.out.println("Storage Capacity :" + storageCapacity+"GB");
	}
	
}
