package edu.kh.thread.test;

//Runnable 인터페이스 상속 받아 Thread 생성하기
public class ThreadWithRunnable implements Runnable{
	//Runnable 인터페이스를 사용하는 방법은 클래스 상속의 제약을 피하고(단일 상속의 제약)
	//코드 재사용성을 높일 수 있기 때문에 일반적으로 권장되는 방법
	//run() 메서드 하나만을 정의하고 있으므로, 다른 클래스를 상속받은 상태에서도
	//Runable을 구현하여 Thread를 실행할 수 있음!
	@Override
	public void run() {
		
		//[5번 반복하는 for문 만들기]
			for(int i =0; i<5; i++) {
				System.out.println("Runnable: " + i);
				
				//[Thread에서 사용하는 메서드 만들기]
				// 전에 Thread 메서드에서 에러를 발생하기 때문에 예외처리를 위해 try~catch 사용
				//InterruptedException : 자바에서 다중 Thread 프로그래밍 시 발생할 수 있는 예외
				try {
					
					//-1초간 Thread를 멈추어 대기시키기(ms)
					Thread.sleep(1000);
					//sleep : static 메서드이기 때문에 클래스명,메서드명()으로 작성해야 함.
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	}

}
