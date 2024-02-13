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
	        int[] arr = new int[9];

	        int num=9;
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            arr[i]=num-i;
	            System.out.print(arr[i] + " ");

	            if (i % 2 == 1) {
	                sum += arr[i];
	            }
	        }

	        System.out.println("\n홀수 번째 인덱스 합 : " + sum);
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
		String input = sc.nextLine();
		
		char[] arr= new char[input.length()];
		for(int i=0; i< input.length();i++) {
			arr[i]=input.charAt(i);
		}
		
		System.out.print("문자 :");
		char text = sc.next().charAt(0);
		
		int count=0;
		
		System.out.print(input + "에" + text + "가 존재하는 위치(인덱스) :");
		for(int i=0; i<arr.length; i++) {
			if(text == arr[i]) {
				System.out.print(i + " ");
				count ++;
			}
		}
		System.out.println("\n" + text + "개수 : " +count);
	}	
	
	public void practice6() {
		
		System.out.print("정수");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i< arr.length;i++) {
			
			System.out.print("배열"+ i +"번째 인덱스에 넣을 값 :");
			arr[i]= sc.nextInt();
		}
		
		System.out.print(Arrays.toString(arr) + "");
		
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("\n총 합 :" +sum);
	}
	
	
	public void practice7() {
		System.out.print("주민등록 번호(-포함) :");
		String input = sc.nextLine();
		
		char[] arr= new char[input.length()];
		
		for(int i=0; i<=arr.length; i++) {
			
			if(i<=7) {
				arr[i] =input.charAt(i);
			}else {
				arr[i]='*';
			}
			System.out.print(arr[i]);
		}
		
	}

	
	public void practice8(){
		
		
		//무한으로 반복될 while 문 작성
		//단 해당 for이 ture 경우 break 할 수 있게 하기
		
		//정수를 입력받을만한 scanner 작성하기
		
		//만약 3미만 또는 짝수를 입력하면 "다시입력하세요" 출력하기
		
		//잘 입력했을 경우 넣은 값만큼의 배열 만들기
		
		//배열안에 값넣어주기
		//for문을 사용하여 중간기준으로 이하는 오름 차순/ 이상은 내림차순으로 출력하고
		//중간값은 그대로 출력하기
		
		while (true) {
			
			System.out.print("정수 :");
			int num = sc.nextInt();
			
			if(num <3 || num%2 ==0) {
				System.out.println("다시 입력해주세요");
			}else {
				
				int[] arr= new int[num];
				int input =0;
				for(int i=0; i<arr.length;i++) {
					if(i <= arr.length/2) {
						arr[i]= ++input;
					}else if(i > arr.length/2) {
						arr[i]=--input;
					}
					if(i==arr.length-1) {
					System.out.println(arr[i]);
					}else {
						System.out.print(arr[i] +", ");
					}
					
				}
				break;
			}
			
			
		}
		
	}

	public void practice9(){
		
		int[] arr=new int[10];
		//10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		
		//난수 발생시키기(int)(math.random *10 +1);
		
		System.out.print("발생한 난수 :");
		//for문을 사용하여 난수 발생시키기
		for(int i=0; i<arr.length;i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] =random;
			System.out.print(random+ " ");
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





