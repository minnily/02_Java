package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample_pr1 {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//1부터 10까지 씩 증가하며 출력하는 반복문 작성
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5
		
		for(int i = 1; i <=10;  i++) {
			System.out.println(i  + " ");
			
			if(i == 5)
				break;
		}
		
	}

	public void ex2() {
		
		//입력받은 모든 문자열을 누적
		//단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력

		String text ="";
		
		while(true) {
			System.out.print("입력할 문자 :");
			String input = sc.nextLine();
			
			if(input.equals("exit@")) {
				break;
			}
			text += input + "\n";
		}
		
		System.out.println("===============입력된 문자열 모두 출력====================");
		System.out.println(text);
		
	}

	public void ex3() {
		//1~10까지 1씩 증가하며 출력
				//단, 3의 배수 제외
		int num=0;
		
		for(num=1; num<=10; num++) {
			if(num % 3 ==0) {
				continue;
			}
			System.out.print(num + " ");
		}
		
	
	}

	public void ex4() {
		//1~100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을때 반복을 멈춤
		
		//ex)
		//1
		//2
		//3
		//...
		//39
		
		int num=0;
		
		for(num =1; num<=100; num++) {
			if(num == 40) {
				break;
			}else if(num % 5 == 0){
				continue;
			}else {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
	}

	public void RSPGame() {
		
		// 가위바위보 게임을 할건데 몇 판할지 입력받음
		// 입력받은 판 수 만큼 반복
		// 컴퓨터 :Math.random() : 0.0~1.0미만 난수생성
		// int random =(int)(Math.random() * 3 + 1);
		/*
		 * 0.0 <= x < 1.0
		 * 0.0 <= x *3 <3.0
		 * 1.0 <= x *3 +1 < 4.0
		 * 1<= (int) (x*3+1) <4
		 * ==> 1이상 4 미만 정수 -> 1 2 3*/
		
		
		
		// 1)1~3 사이 난수 생성
		// 2)1이면 가위, 2이면 바위, 3이면 보 지정(switch 문사용)
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다 ㅜㅜ
		// 매판마다 
		// - 현재 기록 : 2승 1무 0패

		System.out.println("[컴퓨터와 함께하는 가위, 바위, 보 게임]"); //제목
		
		System.out.println("몇 라운드를 진행하시겠습니까? "); //스케너에 몇판할지 작성
		int round =sc.nextInt(); //숫자를 입력할것이니 스케너와 연결
		
		int win = 0;
		int draw = 0;
		int lose = 0; //각각 더해줘야하기에 변수들을 미리 정해둠
		
		for(int i =1; i <= round; i ++) { //for문을 사용하여 설정한 round동안 반복해서 for문을 작성할 것임
		
			System.out.println("\n" + i +"번째 게임");	
			System.out.print("가위/ 바위/ 보 중 어떤 것 을 내시겠습니까?"); //어떤것을 낼지에 대한 문자열값 스케너에 적용
			String text = sc.next();
			
			int random =(int)(Math.random() * 3 + 1);	//컴퓨터라는 난수 생성하기
			String computer =null;	//컴퓨터 변수를 임의로 지정
			
			
			switch(random) { //스위치 문을 사용해 컴퓨터에 해당 문자를 랜덤으로 나타낼 것임
			case 1 : computer = "가위"; break; // case 숫자 : 적용할 변수 = 어떤 값을 나타낼지 작성
			case 2 : computer = "바위"; break;
			case 3: computer ="보"; break;
			}
		
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", computer); //스케너를 통해 어떤 값을 최종적으로 나타낼지 입력
			
			
			//if문을 사용해 플레이어의 상황에 대해 입력 
			
			if(text.equals(computer)) { //비겼을 경우
				System.out.println("비겼습니다");
				draw++;
			}else { //플레이어가 이겼을 경우
				    //변수 설정하여 안내
				boolean win1 = text.equals("가위") && computer.equals("보");
				boolean win2 = text.equals("바위") && computer.equals("가위");
				boolean win3 = text.equals("보") && computer.equals("가위");
				
				if( win1 || win2|| win3) { //3가지 중 하나라도 있는 경우 이겼습니다 나타내기 + 점수 축척
					System.out.println("축하합니다, 당신이 이겼습니다!");
					win++;
				}else { //그외의 경우(졌을 경우) 나타내기 + 점수 축척
					System.out.println("아쉽네요, 당신이 졌습니다..");
					lose++;
				}
			}
		
			//for문이 닫히기 전에 현재 기록 스케너로 알리기
			
			System.out.printf("현재 기록 : %d승 %d무 %d패 입니다\n", win, draw, lose);
		}
	}
}
