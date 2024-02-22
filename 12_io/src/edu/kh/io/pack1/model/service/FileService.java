package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileService {
	
	
	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *  
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *  
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성 (폴더 생성)
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */

	
	
	/*[!개발자 상식!]
	 * 
	 * 			OS : 운영 체제
	 * 		(Windows)  / (Linux, Mac)
	 * 	 	  폴더	  /    디렉토리
	 * 
	 * 
	 * 
	 * [경로 표기 방법(하위 폴더, 파일 표시) ]
	 * 
	 *  -백슬래시 ( \ : Windows) -> ex) C:\ workSpace \ 02_Java
	 *  -슬래시  (  /  : Linux, Mac) ->ex) /Users:/ workSpace / 02_Java
	 *  
	 *  [Java 언어의 특징] 
	 *  : 플랫폼(OS)에 독립적 ->OS 관계 없이 똑같은 코드 작성이 가능
	 *  => 이 특징을 유지하기 위해 /,\  둘다 호환 가능하다! (런타임 시 실행되는 OS에 맞게 자동으로 변경 된다)
	 *  
	 *  ----------------------------------------------------------------------------------------------------------------
	 *  
	 *  [경로 표기 방법]
	 *  
	 *  1) 절대 경로 : 하나의(절대적인) 기준으로 부터 (내가 찾고자 하는) 목표까지의 경로를 모두 표기하는 방법
	 *  				ex) C:\ workSpace \ 02_Java
	 *  
	 *  	기준? 
	 *  -Window : C:\ , D :\
	 *  -Linux ,Mac : /Users , /
	 *  
	 *  
	 *  2) 상대 경로 : 현재 위치를 기준으로 (내가 찾고자 하는) 목표까지의 경로를 표기하는 방법
	 *  				ex) ../js/js01.js 
	 *  				=> 내가 현재 어디있냐에 따라 위치가 계속해서 바뀜
	 *  
	 * 
	 * */
	
	/**
	 * File 클래스로 객체 생성
	 * +폴더가 존재하지 않으면 폴더 생성 (기능추가)
	 */
	public void method1() {
		
		//제일 앞 "/" : 최상위 폴더(== root, 절대 경로의 기준점) 를 의미 한다.
		
		// C:/ io_test/20240222 폴더를 지정
		File directory = new File("/io_test/20240222");
		// -> 처음 : 존재하지 않는 폴더를 관리하는 File객체 생성 
		//즉, 현재 없는 객체(존재하지 않는)이지만 생성했다는 의미
		
		System.out.println("존재 여부 확인 : " + directory.exists()); 
		//false (현재 존재하지 않기 때문에 false로 출력)
		
		//폴더가 존재하지 않으면 폴더 생성
		if(!directory.exists()) {
			
			directory.mkdirs(); //폴더를 전부 생성할 것이기에 mkdirs();사용
			
			System.out.println(directory.getName()); // 만든 디렉토리 중 제일 마지막꺼가 반환됨. ==> 20240222
			System.out.println(directory.getPath()); // 전체 경로를 반환해 줌. ==> \io_test\20240222
			
		//==> if문작성 후 파일이 생성되었기에 true로 출력되고 폴더는 더이상 생성되지 않음!
		}
		
		
	}
	
	
	/**
	 * File 객체를 이용해서
	 * 지정된 위치에 파일 생성하기
	 */
	public void method2() {
		
		// 문자열에서 "\" 표기하는 방법 :"\\" ( 자바에서 \한개는 이스케이프 문자열을 의미하기 때문)
		File file = new File("\\io_test\\20240222\\파일생성.txt");
		
		//예외가 발생할 수 있기에 예외설정!
		try {
			//현재 존재하지 않기에 !을 붙여서 ture로 만들어주기
			if(!file.exists()) {
				//if 쓰는 이유 ?
				// createNewFile()를 사용할 것인데 boolean 타입! 따라서 잘 만들어졌다면 true, 아니라면 false를 출력하기 위해서~
				if(file.createNewFile()) { //파일 생성이 성공한 이유
					System.out.println(file.getName()+"파일이 생성 되었습니다.");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();//예외 정보 + 예외가 발생한 위치까지 메서드 추적
		}
		
		
	}

	/**
	 * File 클래스 제공 메서드 활용하기
	 */
	public void method3() {
		
		//File 객체 생성
		File directory = new File("\\workspace\\02_Java\\12_io");
		
		//지정된 디렉토리에 있는 모든 파일/디렉토리를 File[] 형태로 얻어오기
		File[] files = directory.listFiles();
		
		//향상된 for문 -> for( 요소 저장 변수 : 배열 |컬렉션){}
		for(File f : files) {
			
			//File.toString() : 지정된 파일/ 디렉토리의 절대경로를 String 형태로 반환해줌
			//System.out.println(f.toString());
			
			//1.파일명
			String fileName = f.getName();
			
			//2.마지막으로 수정한 날짜
			long lastModified = f.lastModified();
			//System.out.println(lastModified); ex) 1708571630536
			
			//java.text.SimpleDateFormat : 간단히 날짜 형식을 지정할 수 있는 객체 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
													// ex) 2024-02-22 오후 2:14 
			
			//SimpleDateFormat.format(long) : 
			//매개변수 long 값을 지정된 패턴 형식으로 변화하여 문자열 형태로 반환해주는 메서드
			String date = sdf.format(lastModified);
			//반환형이 String이기에 String의 변수안에 값을 넣어준다.
			
			//System.out.println(date);
			
			
			//3.파일 유형
			String type = null;
			//이 객체가 파일이라면
			if(f.isFile()) type ="파일";
			else		type= "폴더";
		
			//if~else 문에서 간단하게 한줄정도로 나타내는 경우 {} 없어도 됨
			
			
			//4.파일 크기(byte)
			String size = f.length() + "B";
			//파일이 폴더면 빈문자열("")로 변경하겠다는 내용
			if(f.isDirectory()) size =""; 
										//예쁘게 나타날 수 있게 조정해준 것!%-20s, %10s 이런것!
			String result = String.format("%-20s %-20s %-5s %10s",fileName, date,type, size);
			
			System.out.println(result);
			
		}
	}
}
