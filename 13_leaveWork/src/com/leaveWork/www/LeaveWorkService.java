package com.leaveWork.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class LeaveWorkService{

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static final LocalDateTime LOCALDATETIME = null;
	
	public String dateFormat(LocalDateTime leaveDate) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateTime = leaveDate.format(formatter);
		return dateTime;
	}
	
	
	public LeaveWorkService() {
	
	
	}
	
	public void displayMenu() {
		
		int num = 0;
		
		do {
			
			try {
				num = startMenu();
				switch (num) {
				case 1 :Resignation();break;
				case 2 :break;
				case 0 : System.out.println("당신의 미래를 응원합니다! 화이팅");break;
				default:System.out.println("잘못 입력한 것 같아요.. 다시 입력해주세요!");
				}
				
			} catch (Exception e) {
				System.out.println("오류가 발생하였습니다. 다시 실행해주세요");
				e.printStackTrace();
				num = -1;
				
			}
			
		} while (num !=0);
	}
	
	
	
	public int startMenu() throws Exception{
				
			System.out.println("========================================");
			System.out.println("           ⎝⍥⎠ [사직서] ⎝⍥⎠             ");
			System.out.println("----------------------------------------");
			System.out.println(" 오늘도 지친 당신 퇴사를 꿈꾸고 있나요?  ");
			System.out.println(" 퇴사하기를 원하신다면 해당 번호를 입력해주세요"     );
			System.out.println("========================================");
			
			System.out.println("1. 사직서 제출");
			System.out.println("2. 사직서 삭제");
			System.out.println("0. 퇴사 보류");
			System.out.println("----------------------------------------");
			
			System.out.println("원하는 번호를 입력해주세요   >>>>>>>>>>>");
			
			int num = Integer.parseInt(br.readLine());
			System.out.println();
			
			return num;
	}
	
	public void Resignation() throws Exception{

		System.out.println("========================================");
		System.out.println("           ⎝⍥⎠ [사직서 제출] ⎝⍥⎠             ");
		
		
		System.out.println("==============================");
		System.out.println("사직서를 작성 하시겠습니까?(Y/N) : ");
		String input = br.readLine().toUpperCase();
		
		
			if(input.equals("Y")) {
				System.out.print("퇴사자 이름 : ");
				String name = br.readLine();
				
				System.out.println("퇴사 사유 : ");
				
				StringBuilder sb = new StringBuilder();
				
			while(true){
				String why = br.readLine();
				if(why.equals("end")){
					System.out.println("퇴사 사유를 다 작성하셨습니까? Y/N");
					String check = br.readLine().toUpperCase();
						if(check.equals("Y")) {
							
							sb.append(why);
							sb.append("\n");
							
							System.out.println("=====================================");
							System.out.println(name +"님의 사직서가 성공적으로 제출되었습니다.");
						
							System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶   Roding ");
							System.out.println("퇴사 처리가 완료 되었습니다");
							System.out.println(name + "님의 미래를 응원합니다");
							System.out.println("---------------------------------------");
							System.out.println(LocalDateTime.now()+ "\n"+name +" 퇴사 ");
							System.out.println("========================================");
							break;
						}else if(check.equals("N")) {
							System.out.println("추가할 사유를 작성해주세요 : ");
							while(true) {
							String why2 = br.readLine();
								if(why2.equals("end")) {
									
									sb.append(why);
									sb.append(why2);
									sb.append("\n");
									
									System.out.println("=====================================");
									System.out.println(name +"님의 사직서가 성공적으로 제출되었습니다.");
								
									System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶   Roding ");
									System.out.println("퇴사 처리가 완료 되었습니다");
									System.out.println(name + "님의 미래를 응원합니다");
									System.out.println("---------------------------------------");
									System.out.println(LocalDateTime.now()+ "\n"+name +" 퇴사 ");
									System.out.println("========================================");
									break;	
								}
							}
						}else {
							System.out.println("잘못눌렀습니다");
						}
				return;
				}
			}
				
			}else if(input.equals("N")){
				System.out.println("통장잔고를 보고 생각이 많아졌나요?...\n"
								 +"그렇다면 당장 열일하러 가세요!!");
			return;
			}else {
			System.out.println("Y/N 중에 입력해주세요");
			return;	
			}
			
		return;
		
	}
	
	public void deleteResignation() throws Exception{
		
		System.out.println("========================================");
		System.out.println("           ⎝⍥⎠ [사직서 삭제] ⎝⍥⎠             ");
		
		if(  == null) {
			System.out.println("제출하신 사직서가 없습니다");
		}else {
			
		}
		
	}
	
}
