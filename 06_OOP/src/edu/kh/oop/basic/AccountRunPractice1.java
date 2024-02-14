package edu.kh.oop.basic;

public class AccountRunPractice1 {
	 public static void main(String[] args) {
		
		 Account ac = new Account();
		 
		 ac.setName("이민경");
		 ac.setAccountNumber("111111-00-2222222");
		 ac.setBalance(100000000);
		 ac.setPassword(1234);
		
		 
		 System.out.println("이름 : " +ac.getName());
		 System.out.println("계좌번호 : " +ac.getAccountNumber());
		 System.out.println("잔액 : " +ac.getBalance() +"원");
		 System.out.println("비밀번호 : " +ac.getPassword());
		 ac.deposit(5000000);
		 ac.withdraw(8888,700000000);
		 
		 Account ac1 = new Account();
		 
		 ac1.setName("김땡땡");
		 ac1.setAccountNumber("111111-01-333333");
		 ac1.setBalance(200000);
		 ac1.setPassword(0000);
		
		 
		 ac1.deposit(100000);
		 ac1.withdraw(0001,10000);
		 ac1.withdraw(0000,10000);
		 ac1.withdraw(0000,30000);
		 
	}
}
