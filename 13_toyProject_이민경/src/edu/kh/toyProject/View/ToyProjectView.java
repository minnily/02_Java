package edu.kh.toyProject.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
				case 3 : purchaseDino(); break; //상품 구매하기
				case 4 : toDeleteDino(); break; // 상품 삭제하기
				case 5 : updateDino(); break; // 상품 갱신하기
				
				case 0 : System.out.println("-----### [프로그램 종료] ###----"); break;
				default : System.out.println("******** 메뉴에 작성된 번호만 입력해주세요 *********");
				}
				System.out.println("=======================================================");
			
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
		System.out.println("-------------------------------");
		System.out.println("            ʕ •ᴥ•ʔ             ");
		System.out.println("     [DinoTaeng Menu List]     ");
		System.out.println("================================");
		System.out.println("    1.   DinoTaeng 상품 조회      ");
		System.out.println("    2.   DinoTaeng 상품 추가      ");
		System.out.println("    3.   DinoTaeng 상품 구매 및 취소");
		System.out.println("    4.   DinoTaeng 상품 삭제      ");
		System.out.println("    5.   DinoTaeng 상품 수정      ");
		System.out.println("    0.   Exit                   ");
		System.out.println("--------------------------------");
		
		System.out.print(" ▶ select menu number >>>>>>>>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}

	/* 장난감 전체 조회하기 */
	public void checkDino() throws Exception {
		System.out.println("=================================");
		System.out.println("              ʕ •ᴥ•ʔ             ");
		System.out.println("------[1. DinoTaeng 상품 조회]------\n");
		
		Map<String, Object> map = service.checkDino();
		
		List<DinoTeang> dinoList =(List<DinoTeang>)map.get("dinoList");
		int soldCount = (int)map.get("soldCount");
		
		System.out.printf("[ 판매된 상품 개수 / 전체 상품 수 : %d / %d ]\n"
				, soldCount, dinoList.size());
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-3s %8s %12s %14s %12s %10s\n", 
							"상품 번호", "모 델 명", "가 격","소 재", "상품 출시일", "판매 여부");
		System.out.println("--------------------------------------------------------------------------------");
		
		for(int i=0; i < dinoList.size(); i++) {
			String modelName = dinoList.get(i).getModelName();
			
			int price = dinoList.get(i).getPrice();
			
			String material = dinoList.get(i).getMaterial();
			
			String purchase = dinoList.get(i).isPurchase() ? "판매완료" : "재고있음";
			
			String date = service.dateFormat(dinoList.get(i).getDate());
			
			System.out.printf(" [%d]    %s      %s 원     %s   [%s]        (%s)\n"
					, i, modelName, price, material, date ,purchase);
			  
		}

	}
	
	/*상품 추가하기*/
	public void  addingDino() throws Exception {
		System.out.println("=================================");
		System.out.println("              ʕ •ᴥ•ʔ             ");
		System.out.println("------[2. DinoTaeng 상품 추가]------\n");
		
		
			System.out.print("ʕ•ᴥ•ʔ 추가할 상품명 : ");
			String modelName = br.readLine();
			
			System.out.print("ʕ•ᴥ•ʔ 추가할 상품 가격 : ");
			int price = Integer.parseInt(br.readLine());
			
			System.out.print("ʕ•ᴥ•ʔ 추가할 상품 소재 : ");
			String material = br.readLine();
			
		System.out.println("-------------------------------------------");
			int index = service.addingDino(modelName, price, material);
			
			if(index == -1) {
				System.out.println("    ʕ ´•̥̥̥ ᴥ•̥̥̥`ʔ    ");
				System.out.println("상품 등록에 실패했습니다");
				return;
			}
			System.out.println("         ʕง•ᴥ•ʔง             ");
			System.out.printf("[%d]번에 상품이 추가 되었습니다\n",index);
	}
	
	/*상품 구매하기*/
	public void purchaseDino() throws Exception{
		System.out.println("=================================");
		System.out.println("                  ʕ •ᴥ•ʔ             ");
		System.out.println("------[3. DinoTaeng 상품 구매 및 취소]------\n");
		
		System.out.print("구매/구매 취소 할 상품 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		boolean result = service.purchaseDino(index);
		
		if(result) { //변경 성공
			System.out.println("[상품 구매 및 구매 취소가 완료 되었습니다]");
			
		}else { //index 요소가 범위 초과한 경우
			System.out.println("### 상품이 존재하지 않습니다 ###");
		}
		
	}
	
	/*상품 삭제하기*/
	public void toDeleteDino() {
		System.out.println("=================================");
		System.out.println("              ʕ •ᴥ•ʔ             ");
		System.out.println("------[4. DinoTaeng 상품 삭제]------\n");
	}
	
	/**/
	public void updateDino() throws Exception{
		System.out.println("=================================");
		System.out.println("               ʕ •ᴥ•ʔ             ");
		System.out.println("------[5. DinoTaeng 상품 수정]------\n");
		
		
		System.out.print("ʕ•ᴥ•ʔ 수정할 상품 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		Map<String, Object> map = service.checkDino();
		
		if(map == null) {
			System.out.println("### 상품이 존재하지 않습니다 ###");
			return;
		}
		
		// 수정 코드 작성 ..
		// 수정 전 상세 내용 출력
		System.out.println("˗ˋˏ♡ˎˊ˗ [수정 전] ˗ˋˏ♡ˎˊ˗");
		System.out.println(map.get(index).toString());
		System.out.println("============================");
		
	
		// 수정할 제목, 내용 입력 받기
		
		System.out.print("ʕ•ᴥ•ʔ 수정할 상품명 : ");
		String modelName = br.readLine();
		
		System.out.print("ʕ•ᴥ•ʔ 수정할 상품 가격 : ");
		int price = Integer.parseInt(br.readLine());
		
		System.out.print("ʕ•ᴥ•ʔ 수정할 상품 소재 : ");
		String material = br.readLine();
	
		System.out.println("-------------------------------------------------");
		
		// 수정 서비스 호출 후 결과 반환 받기
		boolean result = service.updateDino(index,modelName, price, material);
		
		if(result) { 
			System.out.println("        ʕง•ᴥ•ʔง    ");
			System.out.println("[상품 수정이 완료 되었습니다]");
		}else{ 	
			System.out.println("      ʕ ´•̥̥̥ ᴥ•̥̥̥`ʔ    ");
			System.out.println("[상품 수정에 실패 했습니다]");
		}
		
	}
}
