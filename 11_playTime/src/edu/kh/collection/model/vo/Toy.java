package edu.kh.collection.model.vo;

public class Toy {
	private String toyName;
	private int age;
	private int price;
	private String color;
	private int made;
	private String use;
	
	public Toy() {}


	public Toy(String toyName, int age, int price, String color, int made, String use) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.made = made;
		this.use = use;
	}


	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMade() {
		return made;
	}

	public void setMade(int made) {
		this.made = made;
	}


	public String getUse() {
		return use;
	}


	public void setUse(String use) {
		this.use = use;
	}


	@Override
	public String toString() {
		
		
		return "이름: " +toyName + "/ 가격: "+  price + "/ 색상: "+ color + 
				"/ 사용가능 연령: " +age +"/ 제조년월일: " +made+"/ 재료: "+ use;
	}
}
