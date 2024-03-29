package edu.kh.toyProject.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DinoTeang implements Serializable{

	private String modelName; //모델명
	private int price; // 가격
	private String material; //소재
	private LocalDateTime date; // 상품출시일
	private boolean purchase ; //판매여부
	


	public DinoTeang(String modelName, int price, String material, LocalDateTime date, boolean purchase) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.material = material;
		this.date = date;
		this.purchase = purchase;
	}





	public String getModelName() {
		return modelName;
	}





	public void setModelName(String modelName) {
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





	public LocalDateTime getDate() {
		return date;
	}





	public void setDate(LocalDateTime date) {
		this.date = date;
	}





	public boolean isPurchase() {
		return purchase;
	}





	public void setPurchase(boolean purchase) {
		this.purchase = purchase;
	}





	@Override
	public String toString() {
		return "[상품명 : " + modelName + "] [가격 : " + price + "] \n [재료 : " + material + "] [상품출시일 : " + date
				+ "] [판매여부 : "+ purchase + "]\n";
		
		
	}
	
	
	
	
	
	
}