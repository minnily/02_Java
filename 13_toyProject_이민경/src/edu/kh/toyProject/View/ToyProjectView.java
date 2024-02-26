package edu.kh.toyProject.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.kh.toyProject.model.service.ToyProjectService;
import edu.kh.toyProject.model.service.ToyProjectServiceImpl;

public class ToyProjectView {
	
	private BufferedReader br =null ;
	private ToyProjectService service = null;
	
	public void ToyProjectView() {
		
		try {
			
			service = new ToyProjectServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void startView() {
		int input = 0;
		
		do {
			try {	
				input = menu();
		
				switch(input) {
				case 1 : checkToys(); //장난감 조회하기
				case 2 : addingToys(); // 장난감 추가하기
				case 3 : updateToys(); // 장난감 갱신하기
				case 4 : toDeleteToy(); // 장난감 삭제하기
				case 0 : System.out.println("-----### [프로그램 종료] ###----");
				default : System.out.println("******** 메뉴에 작성된 번호만 입력해주세요 *********");
				}
				System.out.println("=========================================================================================");
			}catch(IOException e) {
				System.out.println(" #### 입/ 출력 관련하여 예외가 발생했습니다. 재 입력해주세요 #####");
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("------####### 입력에 오류가 있으니 다시 입력해주세요#######------");
				e.printStackTrace();
			}
		}while(input != 0);	
	}

	public int menu() throws NumberFormatException,IOException{
		
		System.out.println("\n=========MinKyung Toy Project Menu =========\n");
				
				System.out.println("1. 장난감 전체 조회하기");
				System.out.println("2. 장난감 추가하기");
				System.out.println("3. 장난감 갱신하기");
				System.out.println("4. 장난감 삭제하기");
				System.out.println("0. 나가기");
				
				System.out.print("select menu number >>> ");
				
				int input = Integer.parseInt(br.readLine());
				System.out.println();
				
				return input;
	}

	public void checkToys() {
		System.out.println("\n============[1. 장난감 전체 조회하기]==============\n");
		
		
	
	
	
	
	
	}
	
	public void  addingToys() {
		System.out.println("\n============[2. 장난감 추가하기]==============\n")
	}
	
	public void updateToys() {
		System.out.println("\n============[3. 장난감 갱신하기]==============\n")
	}
	
	public void toDeleteToy() {
		System.out.println("\n============[4. 장난감 삭제하기]==============\n")
	}
	
}
