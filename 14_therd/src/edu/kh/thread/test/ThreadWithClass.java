package edu.kh.thread.test;

//Thread 클래스를 상속받아 쓰레드 생성하기

public class ThreadWithClass extends Thread{
	//클래스 상속은 단일 상속만 가능한데, 
	//Thread 클래스 상속을 받으면 다른 클래스 상속이 불가하다 
	//따라서, 일반적으로 Runnable 인터페이스 상속받아 구현함
	
	public void run() {
	//스레드가 수행할 작업을 정의하면 됨.
		
		//[5번 반복하는 for문 만들기]
		for(int i =0; i<5; i++) {
			System.out.println("Thread: " + i);
			
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
