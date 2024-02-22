package edu.kh.collection.model.vo;

import java.util.Objects;
import java.util.Set;

public class Toy2 {
	private String name;
	private int age;
	private int price;
	private String color;
	private String manufactureDate;//제조일을 문자열로 표현!
	private Set<String> materials;// (중복되지 않는 값 (== Set) 으로 저장)
	
	public Toy2() {} //기본생성자

	//매개변수 생성자
	public Toy2(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
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

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}
	
	// 밑에서 언급한 메서드!( 재료부분에 넣을) 
	//materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	public String getMaterialsAsString() {
		// StringBuilder : 변경 가능한 문자열을 합치는 작업을 할 때 (반복문 사용시 유용)
		// 현재 재료값을 추가해야하고 그 추가된 재료들(문자열들)을 합쳐야하기에 
		// StringBuilder를 사용하여 생성한다.
		StringBuilder sb = new StringBuilder();
		
		//확장된 포문을 사용하여 반복문 만들기
		//for(타입 + 변수명: 배열 또는 컬렉션) => 배열 또는 컬렉션에 저장된 값이 반복을 하면서
		// 순서대로 읽혀진 후 변수에 저장되는 것 !
		for(String material:materials) {
			//새롭게 형성한  StringBuilder에 (변수 sb에) 
			//for문에 순차적으로 저장된 값이 있는 변수를 추가해준다.(쉼표도 넣기 위해 뒤에 작성)
			//문자열에서 뒤에 문자열을 추가하고 싶다면 append(추가하고 싶은 변수명)을 사용한다.
			sb.append(material).append(", ");
		}
		
		//마지막 쉼표와 공백 제거하기
		if(sb.length()>0) {
			sb.setLength(sb.length()-2);
		}
		
		return sb.toString();
	}
	
	//마지막 재료에 문자열이 들어갈 것이고 여러개의 값이 추가되기에 새로운 메서드를 만들어서 불러오게 해야한다.
	//따라서 메서드를 넣어줘야한다!
	
	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / 제조년월일 :%s / 재료 : %s,"
					,name, price, color, age,manufactureDate,getMaterialsAsString());
	}

	//set에 toy를 넣어야하기때문에 hashSet을 사용해야함
	//따라서 hashcode() and equals를 해야해서 자동완성으로 해둬야한다!!
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy2 other = (Toy2) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	


	
}
