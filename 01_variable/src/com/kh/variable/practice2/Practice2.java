package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char result =sc.next().charAt(0);
		
		System.out.printf("%c unicode : %d" , result, (int)result);
	}
}
