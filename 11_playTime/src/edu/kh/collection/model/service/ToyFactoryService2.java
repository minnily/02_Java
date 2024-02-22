package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import edu.kh.collection.model.vo.Toy2;

public class ToyFactoryService2{

	private Scanner sc = new Scanner(System.in);
	private Set<Toy2> toySet = new HashSet<Toy2>();// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap= new HashMap<Integer, String>(); //재료가 저장되어있는 map
	
	public ToyFactoryService2() {
		//기본생성자 안에 기본 등록된 재료와 현재 제작된 장난감 목록을 만들어 줄것이다.
		
		//기본 등록된 재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		
		//다섯개 장난감 생성하기 => new 메서드 ();
		//생성한 다섯개 장난감을 toySet에 담아줘야하는 경우!
		//toySet.add();을 생성한 객체 안에 넣어주면된다@@
		toySet.add(new Toy2("마미롱 레드", 8, 36000, "분홍색", "19950805", addMaterials(1,4) ));
		toySet.add(new Toy2("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1,2)));
		toySet.add(new Toy2("키시미시", 8, 15000, "분홍색", "19940505", addMaterials(1,2)));
		toySet.add(new Toy2("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1,2)));
		toySet.add(new Toy2("파피", 12, 57000, "빨간색", "19931225", addMaterials(1,2,4)));
			
	}
	
	// materials에 전달 받은 값들을 추가하고 Set으로 반환하는 메서드
									//매개변수에 몇개가 들어올지 모를때 타입쓰고 ... 매개변수명 작성
	public Set<String> addMaterials(Integer... newMaterials){
		Set<String> addedMaterials = new HashSet<String>();
		
		for(Integer materialKey : newMaterials) {
			
			//맵에서 해당 번호(key)에 대응하는 재료를 가져와 추가할것임
			String materialValue = materialMap.get(materialKey);
			
			if(materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		
		return addedMaterials;
	}
	
	//메뉴 만들기
	public void displayMenu() {
		int menuNum =0;
		
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
				
				menuNum =sc.nextInt();
				
				switch(menuNum) {
				case 1 : displayAllToys();break;
				case 2 : creatNewToy();break;
				case 3 : deleteToy();break;
				case 4 : displayToysByManufactureDate();break;
				case 5 : displayToysByAge();break;
				case 6 :addMatetial();break;
				case 7 : removeMaterialByName();break;
				case 0 : System.out.println("프로그램을 종료합니다");break;
				default : System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				
				}
				
			}catch(Exception e) {
				System.out.println("알맞은 입력을 해라 ...(경고)...");
				sc.nextLine();
				
				menuNum = -1;
				//첫 반복에서 예외 발생시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
				
			}
			
		}while(menuNum!=0);
	}
	
	//전체 장난감 조회하기
	public void displayAllToys() throws Exception{
		System.out.println("<전체 장난감 목록>");
		
		int index =1;
		
		for(Toy2 toy : toySet) {
			System.out.println(index + "." + toy);
			index++;
		}
	}

	// 새로운 장난감 만들기
	public void creatNewToy() throws Exception{
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		// 기존에 있는 장난감인지 확인
		
		for(Toy2 exstingToy : toySet) {
			if(exstingToy.getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return; //프린트 구문 후 장난감 만드는 구문을 종료한다는 뜻
			}
		}
		//위 포문이 아니라면 반복해서 나타날 내용 
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD형식으로 입력) : ");
		String manufactureDate = sc.next();
		
		Set<String> materials = new HashSet<String>(); //재료 저장할 컬렉션
		while(true) {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			//q와 같다면 반복문을 빠져나가는 것
			if(input.equals("q")) {
				break;
			}
			
			//재료저장할 컬렉션 안에 input에 넣을 값을 넣기
			materials.add(input);
		}
		
		// 새로운 객체를 넣고
		Toy2 newToy = new Toy2(name, age, price, color, manufactureDate,materials);
		//set에 넣어주기
		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다");
	
	}
	
	public void deleteToy() throws Exception{
		System.out.println("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();
		
		boolean flag = false; 
		
		for(Toy2 toy : toySet) {
			if(toy.getName().equals(toyName)) {
				toySet.remove(toy);
				flag = true;
				break;
			}
		
		}
		if(flag) {
			System.out.println("장난감이 삭제되었습니다.");
		}else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
		}
		
	}
	
	//제조일 순으로 장난감 정렬하기
	public void displayToysByManufactureDate() throws Exception{
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<Toy2> toyListSortedByDate = new ArrayList<Toy2>(toySet);
		//toy2에 있는 제조순에 넣은 값대로 오름차순 정렬할 것임.
		toyListSortedByDate.sort(Comparator.comparing(Toy2::getManufactureDate));
		
		int index =1; 
		for(Toy2 toy : toyListSortedByDate) {
			System.out.println(index + "." + toy);
			index ++;
		}
			
		
	}

	//연령별로 사용 가능한 장난감 리스트 조회하기
	public void displayToysByAge() throws Exception{
		System.out.println("<연령별로 사용 가능한 장난감>");
		//만들어진 map을 또 연령별 map으로 만들기
		//연령별 숫자가 key/ 그 값(toy2에 있는 목록들) 을 hashmap으로 생성
		Map<Integer,List<Toy2>> toybyAge = new HashMap<Integer, List<Toy2>>();
		//toybyAge 라는 이름의 새로운 맵을 생성
		//-> 연령을 key로 하고, 해당 연령을 가진 장난감 List를 value로 가짐
		//{k:v} ->{5:["키시미시,"히기워기"]}
		
		for(Toy2 toy : toySet) {
			int age = toy.getAge();//5  age에 toy에 있는 나이에 넣은 값을 age의 변수에 넣기
			toybyAge.putIfAbsent(age, new ArrayList<>());
			//putIfAbsent() : Map 인터페이스에서 제공되는 메서드로,
			//해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함.
			//-> 맵에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가
			//즉, map에 해당하는key(나이)가 없는 경우에는 새롭게 map을 만들어서 리스트를 추가할 것을 나타내는 것이다.
			
			toybyAge.get(age).add(toy);
			// 그리고 나서 전체 map에 그 age에 해당하는 toy의 값을 추가할 것이라는 내용
		}
		
		//entry를 사용하여 key 값과 value의 값을 모두 얻어온다. keyset을 사용하면 value값을 얻어올때 get을 사용하여
		// 또 작성해야하는 번거로움이 있기 때문에 entry를 사용하면 편하다!
		for(Entry<Integer, List<Toy2>> entry: toybyAge.entrySet()) {
			
			int age = entry.getKey(); //age라는 변수에 toy에서 가져온 키값들을 누적할 것이고 
			List<Toy2> toyList = entry.getValue(); //toyList에 toy에서 가져온 값들을 넣을 것이다.
			
			System.out.println("[연령 : " + age +"세]");
			int index =1;
			
			for(Toy2 toy :toyList) {
				System.out.println(index + "." + toy);
				index++;
			}
		}
	}

	//재료 추가하기
	
	public void addMatetial() {
		System.out.println("<재료추가>");
		System.out.println("----현재 등록된 재료----");
		//반복해서 접근할 것이다. map에 설정한 것을
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue()); // 목록들을 모두 나타낼 것임.
		}
		
		System.out.println("-------------------------------");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String material = sc.next();
		
		//만약 map에 있는 내용과 key에 넣은 값이 같다면 해당 내용 띄우기
		if(materialMap.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록 되어 있습니다.");
			System.out.println("덮어 쓰시겠습니까? (Y/N) :");
			String input =sc.next();
			
			//대문자, 소문자 상관없음을 말해주는 메서드
			if(input.equalsIgnoreCase("Y")) {
				materialMap.put(key, material); //y라면 맵에 입력 받은 값들을 넣어주고 내용 띄우기
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다!");
			}else{//y가 아닌 n을 눌렀을 경우
			System.out.println("재료 추가가 취소되었습니다.");
			
			}
		}else {
			
			//같은 재료가 없는 경우에는 입력받은 값을 넣어준다.
			materialMap.put(key, material);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다~");
		}
		
	}

	//재료 제거하기
	public void removeMaterialByName() throws Exception{
		System.out.println("<재료추가>");
		System.out.println("----현재 등록된 재료----");
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("삭제할 재료명 입력 : ");
		String materialName =sc.next();
		//변수 임의로 지정
		boolean flag = false;
		
		for(Entry<Integer, String> entry :materialMap.entrySet()) {
			//엔트리에 있는 값이 입력한 값의 이름과 같은 경우 삭제해준다. 키를!
			if(entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());
				System.out.println("재료 '"+ materialName + "' 가 성공적으로 제거되었습니다.");
			
				flag = true;
				break;
			}
			
		}
		
		if(!flag) { //해당재료가 없는 경우 (ture인 경우)
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
	}
}
