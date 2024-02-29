package com.leaveWork.www;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeaveWorkService {

	private Scanner sc = new Scanner(System.in);
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
	public LeaveWorkService() {}
	
	public void displayMenu() {
		
		int num = 0;
		
		do {
			System.out.println("========================================");
			System.out.println("           ⎝⍥⎠ [사직서] ⎝⍥⎠             ");
			System.out.println("----------------------------------------");
			System.out.println("오늘도 지친 당신 퇴사를 꿈꾸고 있나요?  ");
			System.out.println("  (그렇다면 밑 번호를 입력해주세요)"     );
			System.out.println("========================================");
			
			System.out.println("1. 퇴사신청서 제출");
			System.out.println("2. 퇴사신청서 삭제");
			System.out.println("0. 퇴사 보류");
			System.out.println("----------------------------------------");
			
			System.out.println("원하는 번호를 입력해주세요   >>>>>>>>>>>");
			
			try {
				num = sc.nextInt();
				switch (num) {
				case 1 :break;
				case 2 :break;
				case 0 : System.out.println("퇴사말고 열일하세요! 화이팅!!");break;
				default:System.out.println("다른 번호를 입력한 것 같아요.. 다시 입력해주세요!");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} while (num !=0);
	}
	
	public void Resignation() throws Exception{

		System.out.println("==============================");
		System.out.println("사직서를 작성 하시겠습니까? Y/N");
		char input = sc.next().toUpperCase().charAt(0);
		
		if(input!=0) {
			System.out.println("아직 마음의 준비가 안되었군요? 다시 생각해고 오세요");		
		}else {
			System.out.print("퇴사자 이름 : ");
			String name = sc.next();
			
			System.out.println("퇴사 사유 : ");
			String why = br.readLine();
			
			
					
		}
	}
	
	public void deleteResignation() {
		
	}
	
}
