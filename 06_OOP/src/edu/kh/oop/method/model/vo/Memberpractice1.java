package edu.kh.oop.method.model.vo;

public class Memberpractice1 {// 속성 + 기능

	// - memberId 아이디 , memberPw; 비밀번호  , memberName; 이름, memberAge 나이
	//만들기 getter setter도
	
	//+Memberpractice1() ,
	//+ Memberpractice1(String memberId, String memberPw, 
	//							String memberName, int memberAge)  만들기
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	public Memberpractice1() {}

	public Memberpractice1(String memberId, String memberPw, String memberName, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	};
	
	

	
	
	
	
	
	
	
}
