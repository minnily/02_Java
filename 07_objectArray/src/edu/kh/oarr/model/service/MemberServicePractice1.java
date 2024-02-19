package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;
import edu.kh.oarr.model.vo.MemberPractice1;

public class MemberServicePractice1 {
	
	//-scanner 입력
	// Member 5칸짜리 객체배열 선언 및 할당 
	//MemberServicePractice1() 메서드 만들고 인덱스 초기화하기
	
	private Scanner sc= new Scanner(System.in);
	
	private MemberPractice1[] members = new MemberPractice1[5];
	
	public MemberServicePractice1() {//아이디 , 비번, 이름,나이, 지역
		members[0] = new MemberPractice1("user1", "1234", "송강인",24,"광주");
		members[1] = new MemberPractice1("user2", "1234", "한소이",27,"서울");
		members[2] = new MemberPractice1("user3", "1234", "서연진",26,"부산");
	}
	
	//메뉴 출력용 메서드
	public void displayMenu() {
		//회원 정보 관리 프로그램 
		//회원가입, 로그인, 회원정보 조회 회원정보 수정, 
		//회원검색 지역, 로그아웃 (do while문)
	}
		
	public int emptyIndex() {
		//3번까지 배열을 미리 정해두었는데 만약 비어있는게 있을 경우 다시 i번째로
		//돌아가고 아니라면 -1하기
		
	}
	
	//회원가입 메서드
	
	public String signUp() {
		
		
		
	}	
	
	//로그인 메서드

	public String login() {
		
		
		
		
	}	
	
	
	//6) 로그아웃 메서드 
	public void logout() {
		
	}

	
	//회원 검색(지역) 메서드
	public void searchRegion() {
		
		
		
	}
	
	
	//회원 정보 조회 메서드
	public String search() {
		
		
		
	}
	
	//회원 정보 수정 메서드
	public int update() {
		
		
	}
	
	
	
}
