package edu.kh.oop.basic;

public class AccountRun {
		public static void main(String[] args) {
			
			AccountPractice1 ac1=new AccountPractice1();
			
			ac1.setName("이연희");
			ac1.setAccountNumber("123456-7891234");
			ac1.setBalance(500000);
			ac1.setPassword("0000");
			
			AccountPractice1 ac2=new AccountPractice1();
			
			ac2.setName("김현준");
			ac2.setAccountNumber("987456-5432198");
			ac2.setBalance(1000000);
			ac2.setPassword("1111");
			
			System.out.println(ac1.getName()+"의 정보 안내\n");
			System.out.print("이름 : " + ac1.getName());
			System.out.print("\n계좌번호 : "+ ac1.getAccountNumber());
			System.out.print("\n현재 잔액 : "+ac1.getBalance());
			System.out.print("\n비밀번호 : "+ac1.getPassword());
			System.out.println();
			System.out.println("===============================");
			System.out.println(ac1.deposit(800000));
			System.out.println("===============================");
			System.out.println(ac1.deposit(100000));
			System.out.println("===============================");
			System.out.println(ac1.deposit(200000));
			System.out.println("===============================");
			System.out.println(ac1.withdraw("0001", 100000));
			System.out.println("===============================");
			System.out.println(ac1.withdraw("0000", 100000));
			System.out.println("===============================");
			System.out.println(ac1.withdraw("0000", 500000));
			System.out.println("===============================");
			System.out.println(ac1.withdraw("0000", 500000000));

			System.out.println("********************************");
			System.out.println(ac2.getName()+"의 정보 안내");
			System.out.print("\n이름 : "+ac2.getName());
			System.out.print("\n계좌번호 : "+ac2.getAccountNumber());
			System.out.print("\n현재 잔액 : "+ac2.getBalance());
			System.out.print("\n비밀번호 : "+ac2.getPassword());
			System.out.println();
			System.out.println("===============================");
			System.out.println(ac2.deposit(1000000));
			System.out.println("===============================");
			System.out.println(ac2.deposit(1000000));
			System.out.println("===============================");
			System.out.println(ac2.deposit(1000000));
			System.out.println("===============================");
			System.out.println(ac2.withdraw("1111", 500000));
			System.out.println("===============================");
			System.out.println(ac2.withdraw("0000", 100000));
			System.out.println("===============================");
			System.out.println(ac2.withdraw("1111", 1000000));
			System.out.println("===============================");
			System.out.println(ac2.withdraw("1111", 1000000000));
			
		}
}
