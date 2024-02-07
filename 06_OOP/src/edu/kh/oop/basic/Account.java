package edu.kh.oop.basic;

public class Account {

	//이름 name , 계좌번호 accountNumber/ 잔액 balance/ 비밀번호 password
	//추상화/캡슐화
	
	//메서드
	//getter/setter
	//deposit(amount):전달받은 금액을 잔액에 누적한 후 현재 잔액을 콘솔에 출력
	//withdraw(pw,amount): 비밀번호와 출금할 금액을 전달받아와 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	//1) 비밀번호와 일치하지 않으면, " 비밀번호 불일치" 출력
	//2) 출금할 금액이 잔액보다 크면 "잔액부족" 출력

	
	
	//실행용 클래스 :AccountRun ->main

private String name;
private String accountNumber;
private long balance;
private int password;

public void deposit(long amount) {
	
	balance += amount;
	System.out.println("=========================================");
	System.out.println(name + "의 현재 잔액 : "+ balance + "원");
	
}
  
public void withdraw(int pw, long amount) {
	if(pw != password) {
		System.out.println("비밀번호 불일치");
	}else if(amount > balance) {
		System.out.println("잔액부족");
	}else { 
		System.out.printf(name + "의 현재 잔액 : %d 원\n", balance - amount);
	}

	
	
	/* 
	 * public void withdraw(String pw, long amount) {
	 if(!password.equals(pw)){
	System.out.println("비밀번호 불일치");
	return;//매서드 종료 ->호출한 곳으로 돌아감

	public void withdraw(int pw, long amount) {
	 if(amount>balance) {
	System.out.println("잔액부족");
	return;
	balance -= amount;
		
	System.out.printf("%s 계좌에서 %d원 출금\n", accountNumber,amount);
	System.out.println(name + "의 현재 잔액 : "+balance);}
		*/
	
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}


}
