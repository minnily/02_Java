package com.hw1.run;


import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		
		
		//3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student[] stdArr= new Student[3]; 
		
		
		
		//사용데이터를 참고하여 3명의 정보 초기화
		stdArr[0]=new Student("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과"); 
		stdArr[1]=new Student("김말똥",21, 187.3, 80.0, 2, "경영학과"); 
		stdArr[2]=new Student("강계순",23, 167.0, 45.0, 4, "정보통신공학과"); 
		
	
		//위의 학생 정보 모두 출력
		
//		향상된 fo문
		for(Student std :stdArr) {
			//자료형 변수 : 배열명 
			System.out.println(std.information());
		}
		
		System.out.println("============================================");
				
//		for(int i=0; i<stdArr.length;i++) {
//					
//					System.out.println(stdArr[i].information());
//				
//				}
		//최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] emps = new Employee[10];
		
		
		//사원들의 정보를 키보드로 계속 입력 받고 
		
		//while(true) 무한 반복문을 통해 계속 추가할 것인지 물어보고
		//대소문자 상관없이 'y'이면 계속 객체 추가
		//한명씩 추가될 때 마다 카운트 함.
			//2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
		
		
		Scanner sc =new Scanner(System.in);
		
		int count =0;
		
			while(true) {
				System.out.print("이름 :");
				String name =sc.next();
				
				System.out.print("나이 : ");
				int age =sc.nextInt();
				
				System.out.print("신장 : ");
				double height =sc.nextDouble();
				
				System.out.print("몸무게 : ");
				double weight =sc.nextDouble();
				
				System.out.print("급여 : ");
				int salary= sc.nextInt();
				
				System.out.print("부서 : ");
				String dept = sc.next();
				
				emps[count]=new Employee(name, age, height, weight, salary,dept);
				count++;
				
				System.out.println("계속 추가하시겠습니까? (y/n) :" );
				String str =sc.next().toUpperCase(); //대문자형으로 바꿔주는 것
				
				
				if(str.equals("N")) break;
			}
		
			//현재 기록된 사원들의 정보를 모두 출력
			
			for(Employee emp : emps) {
				if(emp == null)break; // nullpointerexception 방지
				System.out.println(emp.information());
			}
		
	}
}
