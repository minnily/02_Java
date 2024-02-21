package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.kh.collection.model.vo.Toy;


public class ToyFactoryService extends Toy{

	Scanner sc = new Scanner(System.in);
	
	/**
	 * 플레이타임 공장 메뉴
	 */
	public void displayMenu() {
		
		int menu =0;
		
		do {
			
			System.out.println("<<플레이타임 공장>>");
			
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료제거");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("선택 : ");
			
			
			try {
				
				menu =sc.nextInt();
				
				switch (menu) {
				case 1: toyList(); 
						System.out.println("======================================");
						break;
				case 2: toyMade(); 
						System.out.println("======================================");
						break;
				case 3: toydelet(); 
						System.out.println("======================================");
						break;
				case 4: toyMadeSet(); 
						System.out.println("======================================");
						break;
				case 5: toyAgeList(); 
						System.out.println("======================================");
						break;
				case 6: addUse(); 
						System.out.println("======================================");
						break;
				case 7: deletUse(); 
						System.out.println("======================================");
						break;
				case 0: System.out.println("프로그램을 종료합니다"); 
						System.out.println("======================================");
						break;
				default : System.out.println("잘못입력하셨습니다"); 
				}
			}catch (InputMismatchException e){
				
				System.out.println("잘못입력하셨습니다");
				sc.next();
				menu = -1;	
			} 
			
		}while (menu !=0);
		
		
	}
	
	 
	/**
	 * 전체 장난감 조회하기
	 */
	public void toyList() {
		
		//기본 등록된 재료 만들기 (고유번호, 재료명)
		
		Map<Integer, String> basicUse = new HashMap<Integer, String>();
			
		basicUse.put(1, "면직물");
		basicUse.put(2, "플라스틱");
		basicUse.put(3, "유리");
		basicUse.put(4, "고무");
		
		
		//toy에 값 넣고
		Toy toy1 = new Toy("마미롱레드", 8, 36000, "분홍색", 19950805,getUse());
		Toy toy2 = new Toy("허기워기", 5, 12000, "파란색", 19940312, getUse());
		Toy toy3 = new Toy("키시미시", 5, 15000, "분홍색", 19940505,getUse());
		Toy toy4 = new Toy("캣냅", 8, 27000, "보라색", 19960128, getUse());
		Toy toy5 = new Toy("파피", 12, 57000, "빨간색", 19961225, getUse());
		
		//넣은 값을 list에 추가하기
		List<Toy> list = new ArrayList<Toy>();
		
		list.add(toy1);
		list.add(toy2);
		list.add(toy3);
		list.add(toy4);
		list.add(toy5);
		
		for(int i =0; i<list.size();i++) {
			System.out.println(i+1 +"."+list.get(i));
		}
	}
	
	/**
	 * 새로운 장난감 만들기
	 */
	public void toyMade() {
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String toyName = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD형식으로 입력) : ");
		int made = sc.nextInt();
		
		//반복해서 재료 입력하는 문구가 나올 수 있도록 하기 ('q'나오면 종료)
		
		char ch ='q';
		
		
		do {
			
			System.out.println("재료를 입력하세요(종료하려면 'q'를 입력하세요) :");
			char use = sc.next().toLowerCase().charAt(0);
			
			if(use !='q') {
				//list(장난감 전체목록)에 use에 적은 값을 추가할 것
				
			}else {
				System.out.println("새로운 장난감이 추가되었습니다.");
				break;
			}
				
			
		} while (ch =='q');			
		
	}
	
	/**
	 * 장난감 삭제하기
	 */
	public void toydelet() {
		
		//스케너로 삭제할 장난감 이름 입력 받기
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String toyName = sc.next();
		
		//반복문을 통해 입력한 장난감 이름과 목록에 있는 장난감 이름이 같은지 확인
		
		//만약 같다면 그 장난감을 삭제하기
		
			
	}
	
	/**
	 * 장난감 제조일 순으로 조회하기
	 */
	public void toyMadeSet() {
		
		//treeset을 사용하여 제조일 순으로 조회하기
		
	}
	
	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 */
	public void toyAgeList() {
		
		//확장 포문을 사용하여 list에 있는 연령별 나이를 조회 하고 
		
		//나이가 5세인경우를 출력
		
		//나이가 8세인 경우를 출력
		
		//나이가 12세인 경우를 출력
		
	}

	/**
	 * 재료추가
	 */
	public void addUse() {
		
		Map<Integer, String> basicUse = new HashMap<Integer, String>();
		
		basicUse.put(1, "면직물");
		basicUse.put(2, "플라스틱");
		basicUse.put(3, "유리");
		basicUse.put(4, "고무");
		
		
		System.out.println("<재료 추가>");
		//현재 등록되어 있는 재료 목록을 보여준다
		System.out.println("----현재 등록된 재료----");
		//확장 포문을 사용하여 map에 있는 값 나타내거나
		//프린트 구문으로 map 내용 전체 띄우기
		for(int i=0; i<=basicUse.size();i++) {
			System.out.println(basicUse.get(i));
		}
				
		System.out.println("---------------------------");		
		
		System.out.println("재료 고유번호(key)입력 : ");
		int key = sc.nextInt(); 
		
		System.out.println("재료명 입력 : ");
		String value =sc.next();
		
		System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		
		
		
		//추가한 값을 map에 추가하기
		
		basicUse.put(key, value);
		
		
		System.out.println("현재 등록된 재료 \n");
		System.out.println(basicUse);
		
		
	}
	
	/**
	 * 재료삭제
	 */
	public void deletUse() {
		
		Map<Integer, String> basicUse = new HashMap<Integer, String>();
		
		basicUse.put(1, "면직물");
		basicUse.put(2, "플라스틱");
		basicUse.put(3, "유리");
		basicUse.put(4, "고무");
		
		
		System.out.println("<재료 삭제>");
		//현재 등록되어 있는 재료 목록을 보여준다
		System.out.println("----현재 등록된 재료----");
		//확장 포문을 사용하여 map에 있는 값 나타내거나
		//프린트 구문으로 map 내용 전체 띄우기
		for(int i=0; i<=basicUse.size();i++) {
			System.out.println(basicUse.get(i));
		}
				
		System.out.println("---------------------------");		
		
		System.out.println("삭제할 재료 입력 : ");
		int key = sc.nextInt(); 
		
		//만약 입력한 값과 재료 리스트에 있는 값이 같다면 리스트에서 제거
			for(int i=0; i<basicUse.size();i++) {
				if(key == ) {
					basicUse.remove(key);
				}System.out.println("해당 이름의 재료가 존재하지 않습니다.");
				
			}
		//제거 후 나타내기	
		System.out.println("재료"+ key+"가 성공적으로 제거되었습니다.");	
		
		
		

		
	}
}
