package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;
import edu.kh.oop.method.model.vo.Memberpractice1;

public class MemberServicePractice1 {

	private Scanner sc =new Scanner(System.in);
	
	// ~-scanner 생성
	//+ displayMenu() = void  회원정보 관리 프로그램 만들기 
	//회원가입, 로그인, 회원정보조회, 회원정보 수정, 로그아웃, 프로그램 종료
	//do ~while 문 활용 하여 !
	
	private Memberpractice1 members  = null;
	private Memberpractice1 loginer =null;
	
	public void displayMenu() {
		
		int menucho =0;
		
		do {
			System.out.println("[회원 정보 관리 프로그램]");
			
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보조회");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 로그아웃");
			System.out.println("0. 프로그램 종료");
			
			System.out.print ("메뉴를 선택  : ");
			int menunum=sc.nextInt();
			
			switch(menunum) {
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : System.out.println(updateMember());break;
			case 5 : System.out.println(logOut());break;
			case 0 : System.out.println("==프로그램을 종료합니다");break;
			default : System.out.println("잘못누르셨으니 다시 눌러주세요");
			}
		}while(menucho!=0);
		
		
	}
	
	
	
	//+signUp()=Strimg -> 회원가입 기능에 넣기
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		//일치하지 않으면 회원가입 실패
		//일치하는 경우
		// 입력 받은 정보를 이용해서 Member 객체를 생성한 후 
		// 생성된 객체의 주소를 필드에 있는 memberInfor에 대입후 "회원가입 성공" 내용 띄우기
	
	public String signUp() {
		System.out.println("회원가입 ");
		
		System.out.print("아이디 입력 : ");
		String memberId =sc.next();
		System.out.print("비밀번호 입력 : ");
		String memberPw=sc.next();
		System.out.print("비밀번호 확인  : ");
		String memberPw2=sc.next();
		System.out.print("이름 입력 : ");
		String memberName =sc.next();
		System.out.print("나이 입력 : ");
		int memberAge =sc.nextInt();
		
		
		
		
	}



	// +login() = String => 로그인 기능에 넣기 회원가입시 저장된 아이디, 비밀번호가 
		//입력받은 아이디, 비밀번호와 같으면 "로그인 성공" "~님 환영합니다"
		// 같지 않으면 "아이디 또는 비밀번호가 일치하지 않습니다" 
	
	//+selectMember() = String =>회원정보 조회에 넣기
			
		//1)로그인 여부 확인
		//로그인 안했을 때 "로그인 후 이용해주세요" 리턴
		
		//2) 로그인이 되어있는 경우
		//회원 정보를 출력할 문자열을 만들어서 반환(return)
		//단, 비밀번호는 제외
		
		//이름 : 홍길동 
		//아이디 :user01
		//나이 :25세
		
	
	//+updateMember()= int => 회원 정보 수정으로 대입
	//로그인이 되어 있는 상태로 되어 있을 때 이름, 나이 수정입력받을 값 받기
	// 수정 후 비밀번호 값을 받고 로그인한 회원의 비밀번호와 일치하는지 보고 
	// 같으면 값 변경해주고 아니면 반환

	
	//logOut 메서드 만들기
	
}