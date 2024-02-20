package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.vo.Student;

public class StudentService_pr1 {
 
	//1.-스케너 만들기 (입력할)
	
	private Scanner sc = new Scanner(System.in);
	
	//2. -ArratList 만들기<제네릭스설정>
	
	private List <Student> studentlist = new ArrayList <Student>();
	
	//3. 기본 생성자에 +기본으로 제공할 객체 5개정도 만들기
	public StudentService_pr1() {
		studentlist.add(new Student("박일번", 29, "용인시", 'F', 100));
		studentlist.add(new Student("송이번", 28, "서울시", 'M', 90));
		studentlist.add(new Student("이삼번", 31, "제주시", 'F', 65));
		studentlist.add(new Student("최사번", 30, "대구광역시", 'M', 88));
		studentlist.add(new Student("김오번", 31, "평택시", 'F', 57));
		
	}
	
	//< 학생 관리 프로그램 만들기>
	
	//1. + displayMenu() - 학생관리 프로그램
	
		/* do~while 문을 사용하여 최소 1번은 실행하는 구문 작성 
		 * 변수를 지정하여 0인경우 멈추고 0이 아닌경우 반복
		 * 그외 번호를 입력하는 경우 -1해주기!
		 * 
		 * 1. 학생 정보 추가 2. 학생 정보 전체조회 3. 학생 정보 수정 4. 학생 정보 제거
		 *  5. 이름으로 검색(일치) 6. 이름으로 검색 (포함) 0. 프로그램 종료
		 * 
		 * try - catch 문을 사용하여 메뉴 번호를 입력하는 값에 대해 나올 상황들을 switch문을 사용하여
		 * 작성하고 발생하는 오류가 있을 경우 공통적으로 띄울 문구를 println 구문으로 나타내게 하기
		 * 
		 * */
	public void displayMenu() {
		int studentmenu = 0;
		
		do {
			System.out.println("=============================================================");
			System.out.println("[학생 관리 프로그램]");
			
			System.out.println("1. 학생 정보 추가하기");
			System.out.println("2. 학생 정보 전체 조회하기");
			System.out.println("3. 학생 정보 수정하기");
			System.out.println("4. 학생 정보 제거하기");
			System.out.println("5. 이름으로 검색하기 1");
			System.out.println("6. 이름으로 검색하기 2");
			System.out.println("0. 프로그램 끝마치기");
			
			
			System.out.println("원하는 번호를 입력해주세요 : ");

			try { 
				studentmenu =sc.nextInt();
			
				switch(studentmenu) {
				
				case 1 : System.out.println(addStudent());break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent());break;
				case 4 : System.out.println(RemoveStudent());break;
				case 5 : searchName1();break;
				case 6 : searchName2();break;
				case 0 :System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
						System.out.println("[프로그램을 종료합니다]");break;
				default : System.out.println("메뉴에 작성된 번호만 입력해주세요");
				}
				
								
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				sc.nextLine();
			  studentmenu = -1;
			}
			
			
		}while(studentmenu !=0);
		
	}
	
	// 2. + String addStudent() - 학생정보 추가 (throws 사용하여 예외처리를 해주기 )
	
		/*scanner를 통해 이름, 나이, 지역, 성별, 점수를 받고
		 * if문을 사용하여  Student에 새로운 객체를 생성한다. "성공" 띄우고 
		 * 제대로 된 값이 아니라면 "실패"라고 출력되게 하기
		 * */
	
	public String addStudent() throws InputMismatchException{
		System.out.println("========================================================");
		System.out.println("[학생 정보 추가하기]");
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		System.out.print("지역을 입력해주세요 : ");
		String region = sc.next();
		
		System.out.print("성별을 입력해주세요 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수를 입력해주세요 : ");
		int grade = sc.nextInt();
		
		if(studentlist.add(new Student(name, age, region, gender, grade))) {
			return "학생의 정보가 추가되었습니다";
		}
			return "학생 정보 추가를 실패했습니다. 다시 입력바랍니다";
	}
	

	// 3. +selectAll() - 학생 전체 조회 (throw 사용하여 예외처리 해주기)
	
		/* 조건문을 사용하여 컬렉션이 아예 비어있는 상태라면
		 *  print 구문으로 출력을 하고 반환형이 없이 다시 호출한 곳으로 돌아갈 수 있게 하기
		 * 
		 *  반복문을 적용시킬 컬렉션명에 변수를 지정하여  출력할 수 있게 하기
		 *  
		 * 
		 * */
	public void selectAll() throws InputMismatchException{
		System.out.println("================================================");
		System.out.println("[학생 전체 조회하기]");
		
		if(studentlist.isEmpty()) {
			System.out.println("등록하신 학생의 정보가 없습니다. 학생 정보를 등록해주시기 바랍니다");
			return;
		}else {
		
			int index =0;
			for(Student std : studentlist) {
				
				System.out.print("["+(index++)+"]"+"번째 학생정보 : ");
				System.out.println(std);
		 }	
			
		}
	}
	
	
	
	// 4. + updateStudent() : String - 학생 정보 수정 ( throws를 사용하여 예외처리 해주기)

		/*- 학생정보가 studentList에 있는지 검사, 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 * - 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 * - studentList 범위 내 인덱스번호인지 검사, 범위를 초과했다면 " 범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 * - 수정이 완료 되었다면, "000의 정보가 변경되었습니다" 문자열 반환
	 * 
	 *  수정할 값을 변수에 지정하여 새롭게 값을 넣고 
	 * 출력 시 그전에 사용했던 이름을 가져와 정보가 변경되었음을 나타내는 문구 나타내기
	 * 
		 * */
	public String updateStudent() throws InputMismatchException{
		System.out.println("===============================================");
		System.out.println("[학생 정보 수정하기]");
		
		System.out.println("검색할 학생 인덱스 번호를 입력하세요 : ");
		int indexnum = sc.nextInt();
		
			if(studentlist.isEmpty()) {
				return "입력된 학생 정보가 없습니다. 다시 입력해주세요";
			}else if(indexnum < 0) {
				return "음수는 입력할 수 없습니다. 다시 입력해주세요";	
			}else if(indexnum > studentlist.size()) {
				return "범위를 넘어선 값을 입력할 수 없습니다. 다시 입력해주세요";
			}else {
				System.out.println("!수정할 학생 정보를 입력해주세요!");
				System.out.print("수정할 이름을 입력해주세요 : ");
				String name = sc.next();
				
				System.out.print("수정할 나이를 입력해주세요 : ");
				int age = sc.nextInt();
				
				System.out.print("수정할 지역을 입력해주세요 : ");
				String region = sc.next();
				
				System.out.print("수정할 성별을 입력해주세요 : ");
				char gender = sc.next().charAt(0);
				
				System.out.print("수정할 점수를 입력해주세요 : ");
				int grade = sc.nextInt();
				Student temp =studentlist.set(indexnum,new Student(name, age, region, gender, grade));
				
				return temp +"학생의 정보가 성공적으로 변경되었습니다!";
			
		}
	}
	
	// 5. + RemoveStudent() : String - 학생 정보 삭제  ( throws를 사용하여 예외처리 해주기)
	
		/*제거할 인덱스 번호를 받고 학생정보가 없으면 "입력된 학생정보가 없습니다 문자열로 반환
		 * 입력된 숫자가 0보다 작으면 "음수는 입력 할 수 없습니다 출력 
		 * 범위 내 인덱스 번호를 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다 출력
		 *  학생 정보 제거 전 print()구문을 사용하여 삭제 여부를 한번더 묻기
		 *  만약 y/n 중 y인 경우 학생정보가 저장된 변수에 index 번호를 제거해주고
		 *  n라면 "취소"문자열 반복하기 (소문자, 대문자 상관없이 대문자로 인식하게 하기)
		 * */
	
	public String RemoveStudent() throws InputMismatchException{
		System.out.println("============================================");
		System.out.println("[학생 정보 삭제하기]");
		
		System.out.println("제거할 학생 정보의 인덱스 번호를 입력해주세요 :");
		int indexnum = sc.nextInt();
		
		if(studentlist.isEmpty()) {
			return "입력된 학생 정보가 없습니다. 다시 입력해주세요";
		}else if(indexnum < 0) {
			return "음수는 입력할 수 없습니다. 다시 입력해주세요";	
		}else if(indexnum > studentlist.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다. 다시 입력해주세요";
		}else {
			
			System.out.println("[잠깐!!] 입력하신"+indexnum +"학생의 정보를 정말로 삭제하시겠습니까?(Y/N)");
			char check = sc. next().toUpperCase().charAt(0);
			
			if(check == 'Y') {
			 Student temp =studentlist.remove(indexnum);
				return temp.getName() + "의 정보가 삭제되었습니다";
			}
			 	return "학생 정보 삭제를 취소합니다";
		
	}
		
	}
	
	
		/** 5. 이름으로 검색(일치)
		 * 이름이 일치하는 학생을 찾아서 조회하는 메서드(완전 일치)
		 * 검색할 이름 입력받아 studentList에서 꺼내온 Student 객체의 name 값이 같은지 비교
		 * - 일치하는 경우 Student 객체 출력
		 * - 검색 결과가 없습니다 출력
		 */
		public void searchName1() throws InputMismatchException{
			
			System.out.println("================================================");
			System.out.println("[이름으로 검색하기 1]");
			
			System.out.println("검색할 이름을 입력하세요 : ");
			String searchname = sc.next();
			
			boolean flag = false;
			
			for(Student std : studentlist) {
				if(std.getName().contains(searchname)) {
					System.out.println(std);
					flag = true;
				}
				}if(!flag) {
					System.out.println("검색결과가 없습니다");
			}
		
		}
		
		/** 6. 이름으로 검색(불일치)
		 * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
		 * 문자열 입력받아 studentList에서 꺼내온 Student 객체의 name 값에 포함되는 문자열인지 검사
		 * - 포함되는 경우 Student 객체 출력
		 * - 없으면 검색 결과가 없습니다 출력
		 */
		public void searchName2() {
			
			//사용해야하는 메서드 
			//boolean String.contains(문자열) 사용해야함 : String에 문자열이 포함되어 있으면 ture/ 없으면 false
			
			System.out.println("================================================");
			System.out.println("[이름으로 검색하기 2]");
			
			System.out.println("검색할 글자를 입력하세요 : ");
			String searchname = sc.next();
			
			boolean flag = false;
			
			for(Student std : studentlist) {
				if(std.getName().contains(searchname)) {
					
					System.out.println(std);
					flag = true;	
				}
					
				}if(!flag) {
					System.out.println("검색결과가 없습니다");
			}
			
			
			
		}
}
