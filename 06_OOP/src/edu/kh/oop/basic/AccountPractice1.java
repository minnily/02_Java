package edu.kh.oop.basic;

public class AccountPractice1 {

	//이름 name , 계좌번호 accountNumber/ 잔액 balance/ 비밀번호 password
	//추상화/캡슐화
	
	//메서드
	//getter/setter
	//deposit(amount):전달받은 금액을 잔액에 누적한 후 현재 잔액을 콘솔에 출력
	//withdraw(pw,amount): 비밀번호와 출금할 금액을 전달받아와 
	//조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	//1) 비밀번호와 일치하지 않으면, " 비밀번호 불일치" 출력
	//2) 출금할 금액이 잔액보다 크면 "잔액부족" 출력

	private String name;
	private String accountNumber;
	private int balance;
	private String password;
	
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String deposit(int amount) {
		balance = amount+balance;
		return "현재잔액은  " + balance + "원 입니다." ;
		
	}
	
	public String withdraw(String pw, int amount) {
		if(!pw.equals(password)) {
			return "비밀번호 불일치";
		}else {
			balance -= amount;
		} if(balance<amount){
			return "잔액이 부족합니다";
		}else {
			return amount+"원이 출금되었습니다.\n남은 잔액은 "+balance +"원 입니다.";
		}
	} 
	

}
