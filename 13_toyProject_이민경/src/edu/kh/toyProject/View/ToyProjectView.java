package edu.kh.toyProject.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.toyProject.model.dto.DinoTeang;
import edu.kh.toyProject.model.service.ToyProjectService;
import edu.kh.toyProject.model.service.ToyProjectServiceImpl;

public class ToyProjectView {
	
	private BufferedReader br =null ;
	private ToyProjectService service = null;
	
	public ToyProjectView() {
		
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
				case 1 : checkDino(); break; //상품 조회하기
				case 2 : addingDino(); break; // 상품 추가하기
				case 3 : /*updateDino()*/; break; // 상품 갱신하기
				case 4 : /*toDeleteDino()*/; break; // 상품 삭제하기
				case 5 : /*purchaseDino()*/; break; //상품 구매하기
				
				case 0 : System.out.println("-----### [프로그램 종료] ###----"); break;
				default : System.out.println("******** 메뉴에 작성된 번호만 입력해주세요 *********");
				}
				System.out.println("=========================================================================================");
			
			}catch (NumberFormatException e) {
				System.out.println("### 숫자만 입력해 주세요 ###");
				input = -1; // 첫 반복에 종료되는걸 방지
				 
			} catch (IOException e) {
				System.out.println("### 입/출력 관련 예외 발생 ###");
				e.printStackTrace(); // 예외추적
				
			} catch (Exception e) { // 기타 예외 모두 처리
				e.printStackTrace(); 
				
			}
		}while(input != 0);	
	}

	public int menu() throws Exception{
		
		System.out.println("\n=========DinoTaeng Menu List=========\n");
				
		System.out.println("1. DinoTaeng 상품 조회");
		System.out.println("2. DinoTaeng 상품 추가");
		System.out.println("3. DinoTaeng 갱신");
		System.out.println("4. DinoTaeng 상품 삭제");
		System.out.println("5. DinoTaeng 상품 구매");
		System.out.println("0. Exit");
		
		System.out.print("select menu number >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}

	/* 장난감 전체 조회하기 */
	public void checkDino() throws Exception {
		System.out.println("\n============[1. DinoTaeng 상품 조회]==============\n");
		
		
		Map<String, Object> map = service.checkDino();
		
		List<DinoTeang> dinoList = (List<DinoTeang>)map.get("dinoList");
		Object sold = map.get("sold");
		
		System.out.printf("[ 구매 된 상품 수 / 등록된 전체 상품 수 : %d  / %d]\n", sold, dinoList.size());
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s %10s %5s %s\n", "순번", "모델명", "가격", "소재", "상품 출시일", "판매여부");
		System.out.println("--------------------------------------------------------------------------------------------");
		
		for(int i=0; i < dinoList.size(); i++) {
			String modelName = dinoList.get(i).getModelName();
			
			int price = dinoList.get(i).getPrice();
			
			String material = dinoList.get(i).getMaterial();
			
			String purchase = dinoList.get(i).isPurchase() ? "O" : "X";
			
			String date = service.dateFormat(dinoList.get(i).getDate());
			
			System.out.printf("[%3d]  %20s    %s 원  %s  [%s]   (%s)\n", i, modelName, price, material, date ,purchase);
			
		}

	}
	
	
	/*상품 추가하기*/
	public void  addingDino() throws Exception {
		System.out.println("\n============[2. DinoTaeng 물품 추가]==============\n");
	
		
		System.out.print("추가할 상품명 입력 : ");
		String modelName = br.readLine();
		
		System.out.print("추가할 상품가격 입력 : ");
		int price = Integer.parseInt(br.readLine());
		
		System.out.print("추가할 상품소재 입력 : ");
		String material = br.readLine();
		
		System.out.println("입력 종료 시 !dt 작성 후 엔터)");
		System.out.println("\n--------------------------------------------------------------------");
	
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String addModel = br.readLine();
			
			if(addModel.equals("!dt")) break;
			
			sb.append(addModel);
			sb.append("\n");
		}
		
		System.out.println("----------------------------------------------------------------------");
			int index = service.addingDino(modelName, price, material);
			
			if(index == -1) {
				System.out.println("상품 등록에 실패했습니다");
				return;
			}
			System.out.printf("[%d]번 상품에 추가 되었습니다\n",index);
	}
	
	
	public void updateDino() {
		System.out.println("\n============[3. DinoTaeng 갱신]==============\n");
	}
	
	public void toDeleteDino() {
		System.out.println("\n============[4. DinoTaeng 물품 삭제]==============\n");
	}
	
	public void purchaseDino() {
		System.out.println("\n============[5. DinoTaeng 상품 구매]==============\n");
	}
	
}
