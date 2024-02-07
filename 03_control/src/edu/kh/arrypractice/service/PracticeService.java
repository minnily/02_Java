package edu.kh.arrypractice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//9인 배열 선언 및 할당
		int[] arr= new int[9];
	
		//값을 더해줄 변수 설정
		int sum=0;
		int num=1;
		//1~9까지 반복문 이용해 
		//순서대로 배열의 각 인덱스 요소에 대입 및 출력
		for(int i=0; i < arr.length; i++) {	
			arr[i]=num++;
				if(i % 2 == 0) {
					sum += arr[i];
				}
		}
		System.out.println(Arrays.toString(arr));		
		System.out.println(" 짝수 번째 인덱스 합 :"+sum);
		//짝수번째 인덱스의 값의 합 출력				
	}
	
	public void practice2() {
		int[] arr= new int[9];
		//9의 값의 변수를 지정
		int num=9;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = num--;
			
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 :"+sum);				
	}
	
	public void practice3() {
		//사용자에게 입력받은 양의 정수
		
		
		System.out.print("양의 정수 :");
		int input =sc.nextInt();
		//만큼 배열 크기를 할당하고
		
		int num=1;
		int[] arr = new int[input];
		for(int i=0; i<arr.length; i++) {
			arr[i]=num++;
		}
		System.out.println(Arrays.toString(arr));
		
		//1~입력받은 값까지 배열에 초기화한후 출력
	}

	public void practice4() {
		//정수 5개를 입력받아
		//배열을 초기화 하고
		
		//검색할 정수를 입력받아
		//배열에서 같은 수가 있는 인덱스를 찾아 출력
		
		//배열에 같은수가 없는 경우 "일치하는 값이 존재하지 않습니다"출력
	   
		
		System.out.print("입력할 수 :");
		int input = sc.nextInt();
		int[] arr = new int[input];	
		
			
		    
		for(int i=0; i <arr.length; i++) {
			
			System.out.print("입력" + i +":");
		    int num=sc.nextInt();
		    arr[i]=num;
		}
			
		 System.out.print("검색할 값 :\n");
		 int search=sc.nextInt();
		
		 boolean flag = false;
		 
		 for(int i=0; i<arr.length; i++){
			 
			 if(arr[i] == search) {
				
				System.out.printf("인덱스 값 : %d\n", i);
				flag=true;
			 }  	
			
		 }
		 if(!flag) {
			 System.out.println("일치하는 값이 없습니다.");
		 }
	}
	
	public void practice5() {
		System.out.print("문자열 :");
		String text= sc.nextLine();
		//입력할 문자열의 스케너 생성 후 넣을값 변수 지정
		
		//문자열의 길이만큼 배열이 증가함을 for문으로 명시
		for(int i=0; i<text.length();i++) {
			String[] arr = new String[text.length()];	
		} 
		
		System.out.print("문자 :");
		String input= sc.nextLine();
		
			
		for(int i=0; i<text.length();i++) { 
		
		
		String search ="";//검색이라는 변수 지정
			
		boolean flag=false;
		
		
		
			if(!search.equals(input)){
			System.out.printf("application에 %s가 존재하는 위치(인덱스) : %d", input, i);
				flag=true;
			}
			if(!search.equals(input)){
				
				System.out.println("존재하는 값이 없습니다.");
				break;
			}
		}
		
	}
	
	
	
	public String getInfo(String n1, String n2) {
		
		//getInfo() : 입력 받은 이름 두개를 배열로 만들어 반환하는 메서드 
		// 				콘솔 출력시 ["김나나", "홍길동"]
		
		//-getInfo() 정의와 호출을 해야함
		//-호출 시 입력받은 이름 두개를 전달인자로 전달할 것
		//-getInfo() 메서드의 정의는 전달 받은 매개변수 값을 이용할 것
		
		String[] strArr = {n1, n2};
		return Arrays.toString(strArr);
	}
	
	
}





