package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.model.vo.Toy;

public class ToyFactoryService {

 //list로 장난감 목록을 만들기
List<Toy> toyList = new ArrayList<Toy>();
	//기본 등록된 재료 map 만들기
Map<Integer, String> madeMap = new HashMap<Integer, String>();
private Scanner sc = new Scanner(System.in);


/**
 * 기본등록된 재료에 들어갈 숫자들을 문자로 나타내는 컬렉션 만들것임.
 * 중복이 되면 안되기에 set을 사용하고
 * 숫자를 넣으면 재료명(문자열)을 나오게끔 얻어오기
 */
public Set<String> madeNum1(Integer... num){
	//1. 문자열로 반환될 중복되지 않는 컬렉션 만들기
	Set<String> madeResult = new HashSet<String>();
	
	//2. 번호값을 넣었을 때 기본 등록된 재료에 만든 문자열 재료명이
	// 나올 수 있게 하기
	for(Integer numbers : num) {
		String madeName=madeMap.get(num);
		
		//3. 만약 값이 있다면 사용재료의 재료명들을 추가해줄 것이다.
		if(madeName != null) {
			madeResult.add(madeName);
		}
		
	}
	//4. 반복해줄것임. 
	return madeResult;
}


	public ToyFactoryService() {
		toyList.add(new Toy("마미롱레드", 8, 36000, "분홍색", "19950805", madeNum1(1,4)));
		toyList.add(new Toy("허기위기", 5, 12000, "파란색", "19940312", madeNum1(1,2)));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", madeNum1(1,2)));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", madeNum1(1,2)));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", madeNum1(1,2,4)));
		
		madeMap.put(1, "면직물");
		madeMap.put(2, "플라스틱");
		madeMap.put(3, "유리");
		madeMap.put(4, "고무");
	}

public void displayMenu() {
	
	int menu = 0;
	do {
		System.out.println("<<플레이타임 공장>>");
		
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		System.out.println("0. 프로그램 종료");
		
		System.out.println("선택 : ");
		
		try {
			menu = sc.nextInt();
			
			switch (menu) {
			case 1: toyList();break;
			case 2: newToy();break;
			case 3: deleteToy();break;
			case 4: yyMMddList();break;
			case 5: ageList();break;
			case 6: addMade();break;
			case 7: deleteMade();break;
			case 0: System.out.println("프로그램을 종료합니다.");;break;
			
			default: System.out.println("다시 입력해주세요");

			}
			
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			menu=-1;
		}
	} while (menu!=0);
}

/**
 * 기본등록된 재료에 들어갈 숫자들을 문자로 나타내는 컬렉션 만들것임.
 * 중복이 되면 안되기에 set을 사용하고
 * 숫자를 넣으면 재료명(문자열)을 나오게끔 얻어오기
 */
public Set<String> madeNum(Integer... num){
	//1. 문자열로 반환될 중복되지 않는 컬렉션 만들기
	Set<String> madeResult = new HashSet<String>();
	
	//2. 번호값을 넣었을 때 기본 등록된 재료에 만든 문자열 재료명이
	// 나올 수 있게 하기
	for(Integer numbers : num) {
		String madeName=madeMap.get(num);
		
		//3. 만약 값이 있다면 사용재료의 재료명들을 추가해줄 것이다.
		if(madeName != null) {
			madeResult.add(madeName);
		}
		
	}
	//4. 반복해줄것임. 
	return madeResult;
}



	/**
	 * 전체 장난감 조회하기
	 */
	public void toyList() {
		
		System.out.println("<전체 장난감 목록>");
		
		int i =1;
		for(Toy toy:toyList) {
			
			System.out.println(i +". " + toy);
			i++;
		}
	}

	/**
	 * 새로운 장난감 만들기
	 */
	public void newToy() {
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조일(YYYYMMDD)형식으로 입력 : ");
		String yymmdd = sc.next();
		
		for(:madeMap)
	}


}
