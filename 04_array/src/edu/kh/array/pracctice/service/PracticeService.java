package edu.kh.array.pracctice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int[] arr = new int[9];
		int sum=0;
		
		for(int i=0; i < arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+ " ");
			
			if(i %2 ==0) {
				sum+= arr[i];
			}	
		}
		System.out.println("\n 짝수번째 인덱스 합 :" + sum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.print(arr[i] + " ");

            if (i % 2 == 1) {
                sum += arr[i];
            }
        }

        System.out.println("\n홀수 번째 인덱스 합 : " + sum);
			
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i < arr.length;i++) {
		 arr[i]=i+1;
		 
		 System.out.print(arr[i] + " ");
		}
		
	}

	public void practice4() {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력" + i + " : ");
			arr[i] =sc.nextInt();	
		}
			System.out.print("검색할 값 :");
			int search =sc.nextInt();
			
			boolean flag =false;
			
			for(int i=0; i<arr.length; i++) {
				if(search == arr[i]) {
				System.out.print("인덱스 :" + i);
				flag = true;
				break;
				}
			}if (!flag) {
				System.out.println("일치하는 값이 존재하지 않습니다");
			}
	}
		
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 :");
		String text =sc.next();
		
		char[] arr= new char[text.length()];
		
		for(int i=0; i <arr.length; i++) {
			arr[i]=text.charAt(i);
		}
		
		System.out.print("문자 : ");
		char text2 = sc.next().charAt(0);
		
		int count =0;
		
		System.out.print(text +"에 " + text2+ "가 존재하는 위치(인덱스) :");
		for(int i=0; i <arr.length; i++) {
			if(arr[i]== text2) {
				System.out.print(i + " ");
				count ++;
			}
		}
			
			System.out.println("\n" + text2 + "개수 :" + count);
		
	}
}

