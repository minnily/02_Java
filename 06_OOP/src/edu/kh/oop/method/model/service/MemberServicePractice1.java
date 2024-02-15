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
		
		int menunum =0;
		
		do {
			System.out.println("===============================================");
			System.out.println("[회원 정보 관리 프로그램]");
			
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보조회");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 로그아웃");
			System.out.println("0. 프로그램 종료");
			
			System.out.print ("메뉴를 선택  : ");
			menunum=sc.nextInt();
			sc.nextLine();
			
			switch(menunum) {
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : 
					int list = updateMember();
				
					if(list==0) {
						System.out.println("회원정보 변경이 실패하셨습니다(비밀번호 불일치)");
					}else if(list == -1) {
						System.out.println("로그인 후 이용해 주세요");
					}else {
						System.out.println("회원정보가 변경되었습니다.");
					};
					break;
			case 5 : System.out.println(logOut());break;
			case 0 : System.out.println("==프로그램을 종료합니다");break;
			default : System.out.println("잘못누르셨으니 다시 눌러주세요");
			}
		}while(menunum!=0);
		
		
	}
	
	
	
	//+signUp()=String -> 회원가입 기능에 넣기
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		// 일치하는 경우
		// 입력 받은 정보를 이용해서 Member 객체를 생성한 후 
		// 생성된 객체의 주소를 필드에 있는 memberInfor에 대입후 "회원가입 성공" 내용 띄우기
	
	public String signUp() {
		
		System.out.println("[회원가입]");
		
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
		
		
			if(!memberPw.equals(memberPw2)) {
					return "비밀번호가 일치하지 않습니다. 다시 입력해주세요";
			}else{
				
				members= new Memberpractice1(memberId, memberPw, memberName, memberAge);
				
				return "회원가입에 성공했습니다!";	
			 }
			
	}



	// +login() = String => 로그인 기능에 넣기 회원가입시 저장된 아이디, 비밀번호가 
		//입력받은 아이디, 비밀번호와 같으면 "로그인 성공" "~님 환영합니다"
		// 같지 않으면 "아이디 또는 비밀번호가 일치하지 않습니다" 
	
	public String login() {
		System.out.println("[로그인]");
		
		if(members == null) {
			return "회원가입 먼저 이용해주세요";
		}else {
			System.out.print("\n아이디 입력 :");
			String inputId =sc.next();
			
			System.out.print("\n비밀번호 입력 : ");
			String inputPw = sc.next();
			
			if(inputId.equals(members.getMemberId())&& inputPw.equals(members.getMemberPw())) {
				
				loginer = members;
				
				return "로그인에 성공했습니다~!";
				
			}else {
				return "아이디 또는 비밀번호가 일치하지 않습니다";
			}
		}
	}
	
	
	
	
	
	
	//+selectMember() = String =>회원정보 조회에 넣기
			
		//1)로그인 여부 확인
		//로그인 안했을 때 "로그인 후 이용해주세요" 리턴
		
		//2) 로그인이 되어있는 경우
		//회원 정보를 출력할 문자열을 만들어서 반환(return)
		//단, 비밀번호는 제외
		
		//이름 : 홍길동 
		//아이디 :user01
		//나이 :25세
	
	
	public String selectMember() {
		System.out.println("[회원정보 조회]");
		
		if(loginer == null) {
			return "로그인 후 이용해주세요";
		}else {
			
			String str = "이름 :" + loginer.getMemberName();
			str += "\n아이디 :" + loginer.getMemberId();
			str += "\n나이 :" + loginer.getMemberAge();
			
			return  str;
			
		}
	}
	
	
		
	//+updateMember()= int => 회원 정보 수정으로 대입
	//로그인이 되어 있는 상태로 되어 있을 때 이름, 나이 수정입력받을 값 받기
	// 수정 후 비밀번호 값을 받고 로그인한 회원의 비밀번호와 일치하는지 보고 
	// 같으면 값 변경해주고 아니면 반환

	
	public int updateMember() {
		System.out.println("[회원 정보 수정]");
	
		if(loginer == null ) {
			return -1;
		}else {
		
			System.out.print("변경할 이름 : ");
			String changeName = sc.next();
			
			System.out.print("변경할 나이 : ");
			int changeAge = sc.nextInt();
			
			System.out.print("비밀번호를 입력해주세요");
			String memberPw = sc.next();
			
			if(memberPw.equals(loginer.getMemberPw())) {
				return 1;
			}else {
				return  0;
			}
			
		}
	}
	
	
	//logOut 메서드 만들기
	
	public String logOut() {
		
		if(loginer == null) {
			return "로그인을 먼저 해주시기 바랍니다";
		}else {
			loginer =null;
			return "로그아웃 되었습니다";
		}
	}
	
}