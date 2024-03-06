package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteService {
	/*
	 * 	스트림(Stream) 
	 * : 데이터가 이동하는 통로, 기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * 
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * 
	 * - 최상위 인터페이스 :InputStream, OutputStream
	 * 
	 * - 문자열, 이미지, 영상, 오디오, PDF 등 모든 것을 입/출력 할 수 있음
	 * 		(단, 통로가 좁다보니(1byte라서) 속도가 조금 느림)
	 * 
	 * 
	 * */
	
	/* ********************************************************************************/
	//IO 관련된 코드는 IOException이 발생될 가능성이 높다!
	//->거의 모든 메서드가 throws IOException이 발생!
	//따라서, IOException 예외 처리 구문을 작성하는 것이 필수임!
	/* *******************************************************************************/
	
	/**
	 * 바이트 기반 파일 출력하기
	 */
	public void fileByteOutput() {
		
	//OutputStream은 인터페이스임. 따라서 OutputStream을 객체로 생성할 수 x
	// 따라서, 자식을 불러 객체로 사용해야 한다. (== 자식 : FileOutputStream)
	
	// 1. FileOutputStream의 참조변수를 선언!
		
		/*
		FileOutputStream fos = new FileOutputStream("");
		=> Unhandled exception type FileNotFoundException 해당하는 경로에 파일이 없는 경우라는 예외!
		*/
	
		FileOutputStream fos = null;
	
		//따라서 예외 발생한 부분은 try~ catch 구문으로 예외 발생 처리를 해주면 된다.
		try {
			/*
			 ==new FileOutputStream("경로"); ==
			-> 경로에 작성된 파일과 파일출력 스트림 객체를 생성한다.
			-> 출력 스트림에 연결된 파일이 존재하지 않으면 자동생성해준다.(단, 폴더는 생성되지 않고 파일만 가능!)
			만약 기존 파일이 존재한다면 내용을 덮어쓰기를 해준다.
			
			==new FileOutputStream("경로,true");==
			-> 기존 파일이 존재하면 내용을 이어쓰기 해준다.
			*/
			
			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트.txt");
			
			//String의 불편성 문제를 해결한 객체(가변성) test
			StringBuilder sb = new StringBuilder();
			sb.append("fileByteOutput()\n");
			sb.append("Test 중\n");
			sb.append("오늘은 목요일\n");
			sb.append("^-^\n");
			sb.append("2024.02.22\n");
			sb.append("내일은  금요일\n");
			sb.append("입");
			sb.append("니");
			sb.append("다");
			sb.append(":)");
			
				//StringBuilder -> String 변환
			String content = sb.toString();
			
			//[출력방법 1 : 한글자(2byte)씩 파일로 출력]
				/*
				 -> 2byte 범주의 문자(영어, 숫자, 기본 특수문자 제외)는 1byte 기반 스트림 통과 시 
				 데이터 손실이 발생해서 글자가 깨지는 문제가 발생한다.
				
				-문자열을 한글자씩 쪼개서 나타나게 하는것
				for(int i =0; i <content.length();i++) {
					char ch = content.charAt(i); //i번째 글자 반환 후 변수(ch) 안에 넣어두기
					fos.write(ch); //1byte 출력 스트림이 연결된 파일에 ch 쓰기
					
				}
				
				=> 이렇게 하면 메모장에 글자가 깨져서 나타남. 그래서 밑에 출력방법2로 작성하면 깨지지않고 출력될 수 있음.
				
				*/
			
			
			//System.nanoTime() :1970.01.01 09:00:00 부터 현재 시간까지의 차이를 ns(nano second 단위)로 반환하는 것
			// 1ms(밀리) 		 == 1/1000초
			// 1us(마이크로)	 == 1/1000ms
			// 1ns(나노) 		 == 1/1000us(1/10억 초)
			
			long startTime =System.nanoTime();
			
			//[출력 방법 2: String byte[] 변환 후 출력]
			fos.write(content.getBytes());
			
			long endTime = System.nanoTime();
			
			//수행전 후에 nano 타임을 설정한 후 얼마나 걸렸는지 (수행시간이 얼마나 걸리는지) 확인하는 방법
			System.out.println("[수행시간] : " +(endTime-startTime) +"ns");
			
			
			fos.flush(); // 스트림 안에 남아있는 모든 데이터를 모두 밀어내는 것이다(==출력하는것)
			
			System.out.println("출력 완료!");
			
			
		}catch(IOException e) {
			e.printStackTrace(); //예외가 발생한 메서드까지 추적해 출력해주는 역할
			
			
			//try에서 예외 발생 여부 관계 없이 무조건 수행할 수 있도록 finally를 작성!
			//finally에 사용 완료한 스트림을 제거(닫기, 메모리 반환) 하는 코드를 작성할 것이다.
		}finally {
			
			//try~catch를 또 작성하는 이유 
			//fos.close(); 에 예외로 throws IOException가 발생할 수 있다고 뜨기때문! 이 예외발생을 처리하기 위해 사용하는 것임.
			
			try {
				//스트림이 정상 생성된 경우에만 close될수 있게 조건문 작성! 생성이 안된경우는 close 안되게!
				if(fos!= null) fos.close();
			}catch(IOException e) {
				e.printStackTrace(); //예외 발생한 것 추적해두려고 작성!
			}
			
		}
	}
	
	
	public void fileByteOutputPR() {
		//바이트 기반 출력 
		
		FileOutputStream fos =null;
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}

	/**
	 * 버퍼를 이용한 파일 출력하기
	 * 
	 * -BufferedOutputStream 보조 스트림 이용
	 */
	public void BufferedFileByteOutput() {
		/*
		 *  *버퍼란?
		 * -데이터를 모아두는 박스, 장바구니 같은 메모리 공간을 말한다.
		 * 
		 * * 버퍼링이란?
		 * - 인터넷 속도 낮고 스트리밍 코드가 효율이 안좋은 것을 말한다.
		 * 따라서, 버퍼링을 막기 위해! 
		 * 동영상 재생 중에 미리 앞에 재생될 부분을 다운 받아놓은 후 
		 * 영상을 끊김없이 볼 수 있게 하는데,
		 * 다운받아서 저장해 놓는 공간을 "버퍼"라고 한다!
		 * */
		
		/* 
		 * [BufferedInputStream / BufferedOutputStream] : 보조이기에 단독으로 사용할 수 없음!
		 * 
		 * 
		 * FileByteOutputStream은 1바이트씩 데이터를 입출력 하는데
		 * BufferedInputStream / BufferedOutputStream은 버퍼에 입출력할 내용을 모두 모아서 한번에 입출력을 한다.
		 * ===> 따라서, 스트림을 이용하는 횟수가 적어지고!  !성능!, !시간!의 !효율성!을 높일 수 있다!
		 * 
		 * */
		

			
			FileOutputStream fos = null;
		
			BufferedOutputStream bos = null;
		
			try {
				
				fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트_Buffered.txt");
				
				// 기반 스트림 fos 이용해 보조 스트림 bos를 생성
				
				bos= new BufferedOutputStream(fos);
				
				StringBuilder sb = new StringBuilder();
				sb.append("BufferedOutputStream\n");
				sb.append("Test 중\n");
				sb.append("오늘은 목요일\n");
				sb.append("^-^\n");
				sb.append("2024.02.22\n");
				sb.append("내일은  금요일\n");
				sb.append("입");
				sb.append("니");
				sb.append("다");
				sb.append(":)");
				
				
				String content = sb.toString();
			
				long startTime =System.nanoTime();
				
				
				bos.write(content.getBytes());
				
				long endTime = System.nanoTime();
				
				
				System.out.println("[수행시간] : " +(endTime-startTime) +"ns");
				
				
				bos.flush(); //스트림에 남아있는 데이터 밀어내기(쏟아내기)
				
				System.out.println("출력 완료!");
				
				
			}catch(IOException e) {
				e.printStackTrace(); 
				
			}finally {
				
				try {
					if(bos!= null) bos.close();
					// bos(보조 스트림)은 close()했지만, fos(기반 스트림)은 왜 close하지 않아도 되는가?
					//보조스트림 close()시에 보조스트림 생성에 사용된 기반스트림도 같이 close()되기 때문이다.
					
				}catch(IOException e) {
					e.printStackTrace(); 
				}
			}
	}

	/**
	 * 바이트 기반 파일 입력하기1
	 */
	public void fileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			
			// 방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			//-> 2byte 범주의 글자들이 깨지는 문제가 발생한다. (한글인 경우/ 영어는 안깨질것임)
			
			//Java byte는 정수형 BUT, 다루기가 힘들기때문에 정수 기본형인 int로 변환해서 사용
			
			int value =0 ; //읽어온 바이트 값을 저장할 변수
			
			StringBuilder sb = new StringBuilder(); //읽어온 문자열을 저장할 변수
			
			//더이상 읽어올 값이 없을 때까지 반복하고 이를 sb에 누적
			while(true) {
				value = fis.read(); //1byte씩 읽어오는 것을 value에 담기(누적)
				//단, 더 이상 읽어올 값이 없으면 -1 반환!
				
				if(value == -1) break; //더이상 읽어올 값이 없다면 멈추기 (break)
				
				//읽어온 값을 StringBuilder에 추가
				sb.append((char)value); //한글자씩 가져오는 것이기 때문에 char 형태로 강제 형변환해서 글자 형태로 추가
				
			}
			
			System.out.println(sb.toString()); //읽어온 내용을 콘솔에 출력 (sb에 있는 문자를 모두 출력하는 것)
			
			//InputStream은 flush() 없음 why? 외부에서 불러오는 값이기에
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			//사용 완료된 Stream 메모리 반환하기
			try {
				if(fis != null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileByteInputPR2() {
		
		
	}
	
	
	
	
	/**
	 * 바이트 기반 파일 입력하기2
	 */
	public void fileByteInput2() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			//방법 2 . 파일에 저장된 모든 byte 값을 다 읽어와 byte[] 형태로 반환 받기
			//-> 이후 byte[] 배열을 이용해서 String 객체 생성
			//-> String 생성시 배열 요소 2개씩 묶어 한글자로 해석해 깨지는 글자 없이 문자열로 변환
			
			byte[] bytes = fis.readAllBytes(); //저장된 모든 것을 다 읽어오는 것을 byte배열 bytes에 넣기
			
			
			String content = new String(bytes);
			
			System.out.println(content);//bytes에 있는 것을 알아서 2글자씩 묶에서 content 변수에 넣어주기
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
		
			try {
				if(fis != null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * BufferedInputSteam 보조 스트림을 이용한 성능 향상
	 */
	public void bufferedFileByteInput() {
		
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		
		try {
			//기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20240222\\노래가사.txt");
			
			//보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			String content = new String(bytes);
			
			System.out.println(content);
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			
			//보조 스트림만 close()해도 기반 스트림도 같이 close()됨.
			try {
				if(bis != null) bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * 파일 복사
	 * 
	 * -파일 경로를 입력 받아 
	 *  지정된 파일과 같은 경로에 복사된 파일 출력하기
	 *  
	 *  [실행화면]
	 *  파일 경로 입력 : /io_test/20240222/노래가사.txt
	 *  복사완료 :/io_test/20240222/노래가사_copy.txt
	 *  
	 *  복사하기 위해 해야하는 과정
	 *  1) 입력된 경로에 파일이 있는지 검사 
	 *  2) 있으면 파일 내용을 모두 읽어오기 :FileInputStream + BufferedInputStream
	 *  3) 읽어온 내용을 같은 위치에 "파일명_copy" 이름으로 출력
	 *  	:FileOutputStream +BufferedOutputStream
	 *  
	 *  + 입력할 때, Scanner 대신 BufferedReader(문자열 입력용 Stream) 이용할 것임!
	 */
	public void fileCopy() {
		
		//스트림 참조 변수를 선언(입력 시 스트림2개 , 출력시 스트림 2개, 문자열 입력용 1개 ==> 총 5개 선언해야함)
		BufferedReader br =null; //문자열 입력용 스트림
		
		FileInputStream fis = null; //파일 입력용 스트림
		BufferedInputStream bis =null; //입력 보조용 스트림

		FileOutputStream fos =null; //파일 출력용 스트림
		BufferedOutputStream bos =null;// 출력 보조용 스트림
	
		
		try {
			// 1. 키보드 입력을 받기 위한 스트림 객체 생성한 후 그 객체를 BufferedReader에 전달해주고 br(변수)에 대입해주기
			br = new BufferedReader(new InputStreamReader(System.in));
			
			// 2. 경로 입력 받기
			System.out.print(" 파일 경로 입력 : ");
			String target = br.readLine(); 
			//=>입력된 한 줄 읽어오는 메서드! 여기서 br은 위 입력용 스트림의 변수!를 target이라는 변수에 대입할 것임.
			
			// 3. 해당 경로에 파일이 존재하는 지 확인하기
			File file = new File(target);
			
			// 4. 존재 여부를 확인 
			//해당 경로에 파일이 존재하지 않는 경우를 조건문으로 설정
			if(!file.exists()) {
				System.out.println("[해당 경로에 파일이 존재하지 않습니다]");
				return; //해당경로에 파일이 존재하지 않는다면 메서드 종료시키기!
			}
		//------------------------------------------------------------------------------
			
			// 5. target이 가리키는 파일을 입력 받을 수 있도록 !입력용 스트림을 생성하기!
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			// 6. 입력용 스트림을 이용해서 target 입력 받기
			byte[] bytes = bis.readAllBytes();
			
		//------------------------------------------------------------------------------
			
			// 7. 출력할 파일의 경로 +_copy가 붙은 파일 이름 만들기
			
			/*
			target : /io_test/20240222/노래가사.txt
			copy :/io_test/20240222/노래가사_copy.txt
			*/
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); // "/io_test/20240222/노래가사.txt"
 			
			// int String.lastIndexOf("문자열") 
			//: String 뒤에서 부터 검색해서 "문자열"과 일치하는 부분의 인덱스를 반환하는 것
			// 없으면 -1 반환
			
			int insertPoint = target.lastIndexOf("."); //뒤에서 부터 검색했을 때 .이 들어있는 index를 검색한다.
			sb.insert(insertPoint, "_copy") ;// "/io_test/20240222/노래가사_copy.txt"
			
			String copy = sb.toString(); //복사할 파일의 경로
			
			// 8. 출력용 스트림 생성하기
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos); //보조형 스트림도 만들어서 fos와 연결해주기
			
			// 9. 읽어왔던 내용 bytes를 bos를 이용하여 출력하기
			
			bos.write(bytes);
			bos.flush(); //스트림에 남아있는 데이터 모두 밀어내기
			
			System.out.println("복사완료 : "+ copy);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				//사용한 스트림 메모리 모두 반환
				if(br!= null) br.close();
				if(bis!= null) bis.close(); // fis 도 함께 닫힘
				if(bos!= null) bos. close(); // fos 도 함께 닫힘
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
