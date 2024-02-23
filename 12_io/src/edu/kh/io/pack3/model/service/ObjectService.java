package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	/*
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * 
	 * -Java 객체(Instance == Object)를 입/출력할 때 사용하는 바이트 기반 "보조" 스트림
	 * (보조 스트림은 단독으로 사용 불가능) 
	 * 
	 * 
	 * ** 직렬화(Serializable)**
	 * - 객체를 직선(직렬) 형태로 변환
	 * 
	 * 
	 * */
	
	/**
	 * 객체를 외부 파일로 출력하기
	 */
	public void objectOutput() {
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			//.dat확장자 : data를 담고 있는 파일을 나타내는 확장자 (== 데이터가 들어가 있는 파일)
			fos = new FileOutputStream("/io_test/20240222/Member.dat");
			
			oos = new ObjectOutputStream(fos);//객체 보조 스트림 생성
			
			//Member 객체 하나 생성
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			///ObjectOutputStream을 이용해서 Member 객체를 출력하기 (객체를 사용할것이기에 writeObject 사용)
			oos.writeObject(member); //객체 출력
			
			System.out.println("회원출력완료~");
			
			//.NotSerializableException (=> 출력시 직렬화가 되어 있지 않는다는 에러발생)
			//해결하기 위해 Member Class에서 직렬화를 하면 된다!
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 외부 파일로 부터 객체 입력받기
	 */
	public void objectInput() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
	
		try {
			
			//파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240222/Member.dat");
			
			//객체 입력 보조 스트림 생성
			ois =new ObjectInputStream(fis);	
			
			//스트림을 이용해 파일에 작성된 직렬화 된 멤버(Member) 객체를 읽어와
			//역직렬화를 수행하여 정상적인 멤버(Member) 객체로 변경해야한다.
			
			//ois.readObject() : 직렬화된 객체를 읽어와 역직렬화 == 하나의 객체로 만든다는 것 (반환형 Object)
						// 			Member 객체로 변경해야하기 때문에 다운캐스팅을 해야한다.
			Member member = (Member)ois.readObject(); //다운캐스팅 한 후 member라는 변수에 담아두기 
			
			//읽어온 내용 확인
			System.out.println(member);
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
