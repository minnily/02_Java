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
		System.out.print("문자열 :"); //1.문자열 입력받기
		String text= sc.nextLine(); //2.입력할 문자열에 변수 지정
		String[] arr = new String[text.length()];
		//3.입력한 문자열만큼 배열 생성
		
		System.out.print("문자 :"); //4.찾을 문자를 입력받는 곳 만들기
		String search= sc.nextLine(); //5. 찾을 문자를 입력하는 곳 변수지정
		
		
		boolean flag=false; //5. flag를 거짓이라고 지정
		
		//6.for문을 사용하여 문자열 안에 문자가 있는 지 확인
	
			for(int i=0; i<text.length();i++) {
					if(!search.equals(text)){
					//7. 찾을 문자와 text에 입력한 값이 같다면 콘솔에 내용 띄우기 
			
						System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %d",text, search, );
						System.out.printf("%s의 개수 : %d", search,);
				
						flag=true; //8.그리고 값을 변경해준 후 작업을 멈춤
					}if(!flag) { //9.그외의 경우에는 존재하지 않는다는 경우로 지정
						System.out.println("존재하지 않습니다");
					}
			}
	}	
	
	public void practice6() {
		System.out.print("정수 :");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		
		for(int i=0; i< arr.length; i++) {
			
			
			System.out.printf("\n배열 %d번째 인덱스에 넣을 값 : " , i);
			int input= sc.nextInt();
			arr[i]= input;
		}
		
		
		System.out.print(arr[i]);
	}
	
	public
	
	
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





