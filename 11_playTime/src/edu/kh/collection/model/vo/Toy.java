package edu.kh.collection.model.vo;

import java.util.Objects;
import java.util.Set;

public class Toy {
	private String name;
	private int age;
	private int price;
	private String color;
	private String yymmdd;
	private Set<String> made;
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, String yymmdd, Set<String> made) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.yymmdd = yymmdd;
		this.made = made;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getYymmdd() {
		return yymmdd;
	}

	public void setYymmdd(String yymmdd) {
		this.yymmdd = yymmdd;
	}

	public Set<String> getMade() {
		return made;
	}

	public void setMade(Set<String> made) {
		this.made = made;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, made, name, price, yymmdd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(made, other.made)
				&& Objects.equals(name, other.name) && price == other.price && Objects.equals(yymmdd, other.yymmdd);
	}

	//문자열에 값이 들어가고 뒤에 , 가 들어갈 수 있게 만들기
	public String basicUsed() {
		StringBuilder sb = new StringBuilder();
		
		for(String used:made) {
			sb.append(used).append(", ");
		}
		
		//마지막에서는 공백과 쉼표 없애기
		
		if(sb.length()<0) {
			sb.setLength(sb.length()-2);
		}
		return sb.toString();
	}
	
	public String basicUsed1() {
		
		StringBuilder sb = new StringBuilder();
		
		for(String madeString: made) {
			
			sb.append(madeString).append(", ");
			
			}
		if(sb.length() <0) {
				sb.setLength(sb.length()-2);
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "이름 : " + name + "/ 가격 : " + price+ "/ 색상 : " + color +"/ 사용가능연령 : " + age +   "/ 제조년월일 : " + yymmdd
				+ "/ 재료 : " + basicUsed();
	}
	
	
	
	
	
}
