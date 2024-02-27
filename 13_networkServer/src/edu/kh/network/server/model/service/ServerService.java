package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerService {
	
	//TCP Socket 프로그래밍
	
	/* TCP 
	 * - 서버, 클라이언트 간의 1:1 소켓통신(연결 지향적 프로토콜)
	 * - 서버가 먼저 실행 되어 있는 상태에서 클라이언트가 연결해야 함.
	 * 
	 * 
	 * -데이터 전송 순서가 보장되고, 수신 여부를 판단하여 오류(데이터 손실) 발생 시 재전송 함.
	 * 
	 * 
	 * java.net 패키지에서 제공하는
	 * Socket, ServerSocket 클래스를 사용해야함!
	 * 
	 * Socket
	 * -프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * -Input/OutputStream 보유하고 있음
	 * 
	 * ServerSocket
	 * -포트와 연결되어 외부 요청을 기다리는 객체
	 * -클라이언트의 연결 요청이 들어오면 클라이언트의 소켓을 얻어와 연결하게 된다.
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * */
	
	public void serverStart() {
		
		// 1. 서버의 포트번호 정함
		// 포트는 0~6536 사이를 지정 가능하나, 
		// 1023번 이하는 이미 사용 중인 경우가 많으니 피하는 것이 좋음)
		
		int port =8500; //포트번호 지정하기
		
		//소켓용 참조변수 선언
		ServerSocket serverSocket = null ; 
		Socket clientSocket = null; 
		
		//입출력 스트림 참조변수 선언
		InputStream is = null; 
		OutputStream os = null;
		
		//보조 스트림에 대한 참조변수 만들기
		BufferedReader br = null;
		PrintWriter pw = null; // 자바에서 쓰는 text기반 출력 클래스 
								// 파일, 콘솔, 네트워크 소켓 등 다양한 출력 스트림에 데이터를 쉽게 출력 가능
		
		// 이후에 만들 것에 대해 예외 발생이 많을 예정이라 위에서 미리 try~catch를 만들어서 예외를 잡아주기
		try {
		// 2. 서버용 소켓 객체 생성
			
			serverSocket = new ServerSocket(port); //port 번호를 연결해줘야하기에 ()안에 포트번호를 작성해준다
		
		// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
		
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리는 중 입니다. 잠시만 기다려주세요."); 
			//접속요청이 오기 전까지 위에 무구만 나타남
			
		// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성	
			clientSocket = serverSocket.accept(); 
			//.accept() : 클라이언트의 요청이 오고 수락이 될 때까지 무한대기 하는 역할을 함
			
			System.out.println("[클라이언트의 접속이 성공하였습니다!]"); //수락 후 나타나는 문구
			
		// 5. 연결된 클라이언트와 입출력 스트림 생성
		//     -> 클라이언트가 서버 요청 시 소켓을 전달함
		//     -> 소켓에 입/출력 스트림이 담겨 있음.

			is = clientSocket.getInputStream();// 위에서 만든 참조변수에 넣어두기
			os = clientSocket.getOutputStream();// 위에서 만든 참조변수에 넣어두기

		// 6. 보조 스트림을 통해 성능 개선 (보조스트림 연결해주기)
			br = new BufferedReader(new InputStreamReader(is)); 
			//문자 기반 BufferedReader와 바이트 기반 InputStream을 연결할 수 있도록
			//InputStreamReader를 함께 사용한다. (중간다리 역할)
			
			pw = new PrintWriter(os); 
			
		// 7. 스트림을 통해 읽고 쓰기
			// 서버 -> 클라이언트 메세지 전송
			
			// 접속한 날짜, 시간 보내고 접속성공 문구 띄우기
			// -> 2024년 02월 27일 10:31:21 [서버 접속 성공]
			
			Date now = new Date(); //java.util.Date : 자바에서 시간을 나타내는 객체
								//new Date()로 객체 생성시 현재 시간이 저장되어 있다. 
								//어디에? now 참조변수에!
			
			//SimpleDateFormat : 날짜 형식을 간단히 지정하는 객체 (대소문자에 따른 패턴이 있기에 맞춰서 작성해야함)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			String str = sdf.format(now) + "서버 접속 성공"; //위에 지정한 형식으로 바뀌어서 들어가는데 문자열이기에 
															//String 참조형에 변수를 지정해준다.
			
			pw.println(str); //서버 -> 클라이언트로 출력할 수 있게 해주는 역할을 함.
			pw.flush(); // flush() : 스트림에 있는 내용을 밀어내는 것
			
			//--------------------------------------------------
			// 클라이언트  -> 서버 메세지 전달 받기
			String clientMessage = br.readLine();
			
			String clientIP = clientSocket.getInetAddress().getHostAddress();
							//클라이언트 IP구하는 방법
			
			//클라이언트 메세지 출력
			System.out.println(clientIP + "가 보낸 메세지가 도착했습니다 \n " + clientMessage);
		
			
			//--------------------------------------------------
			
			
			// 서버 -> 클라이언트로 메세지 전송
			
			Scanner sc = new Scanner(System.in);
			System.out.print("서버로 전달할 메세지 : ");
			String str2 = sc.nextLine();
			
			pw.println(str2); //메세지를 서버쪽으로 출력
			pw.flush(); //스트림 내용 밀어내기
			//--------------------------------------
			
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외 추적하기
		}finally {
		// 8. 통신 종료(닫는 과정에서 또 예외가 발생하기에 예외 처리를 위한 try~catch 구문 작성!
			
			try {
				//스트림/소켓 닫기
				if(br != null) br.close(); // +기반스트림 : is close(); 
				if(pw != null) pw.close(); //+ 기반 스트림 : os close();
				//보조 스트림을 닫게 되면 연결된 기반 스트림도 같이 닫게 된다.
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
