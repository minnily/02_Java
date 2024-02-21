apackage edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.collection.pack2.model.vo.Person;

public class MapService {
	
		
		
		
		/* Map : 특정 키워드(key)를 입력하면 해당되는 상세한 값(Value)를 얻을 수 잇는
		 * 			컬렉션 객체
		 * 
		 * Map의 특징 :
		 * 1)K:V 형싱으로 구성
		 * 2)K:V 한쌍을 "Entry"라고 부름
		 * 
		 * 3)Key: 키워드 역할(==변수명)
		 *  (1)중복 x
		 *  	-> 만약 중복되는 Key 입력 시 Value를 덮어씌움
		 *  		-> Key역할의 객체는 hasfCode(),equals() 오ㅂ라이딩 필수!
		 * 	(2) 순서 유지x(단, LinkedHadhMap 제외)
		 * 
		 * Key만 묶어서 보면 Set과 같은 특징을 지니고 있음
		 * ->Map.keyset()/ map.entrySet()
		 * 
		 * 
		 * 
		 * 
		 * Value : 키워드에 해당하는 상세한 값
		 * 
		 *  Key로 인해서 모든 Value가 구분됨
		 *  
		 *  ->Map.gey(key)/ Mav.remove(try)형태로 사용
		 * */
	


	public void method1 (){
		//HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//1. V put(k k V v) : Map에 추가
		//Map에 추가 시 중복되는 key가 있으면 null
		//중복되는 key가 없으면 이전 value 반환
		
		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로티세리바베큐"));
		System.out.println(map.put(3, "스테이크앤치즈"));
		System.out.println(map.put(3, "스파이시 쉬림프"));// 3. 중복
		
		System.out.println(map);
		System.out.println("=========================================================");
		//2. V get(k k) : Key에 해당하는 value 반환, 일치하는 Key가 없다면 null반환
		
		System.out.println(map.get(1));//에그마요
		System.out.println(map.get(0));//null
		
		String temp = map.get(2); //"로티세리바베큐"
		System.out.println(temp);
		
		//3. size() : Map에 저장된 Entry(K:V)의 개수
		System.out.println("size : " + map.size());//3
		
		System.out.println("=======================================================");
		//4. remove(K K):
		// - Key가 일치하는 Entry를 제거
		// - 일치하는 Key가 있다면 Value, 없다면 null 반환
		System.out.println("remove(2): " + map.remove(2));
		System.out.println("remove(5): " + map.remove(5));//null
		System.out.println(map);
		
		//5. void clear() : 모든 Entry 삭제
		//6. boolean isEmpty() : 비어 있는지 확인
	
		System.out.println("clear() 전 isEmpty() : " + map.isEmpty());//false;
		
		map.clear();//모든 Entry 삭제함
	
		System.out.println("clear() 후 isEmpty() : " + map.isEmpty());//true;
	
	
	}

	/**
	 * Map 요소(Entry)순차 접근 하기1
	 * -Map.KeySet() 이용하기
	 */
	public void method2() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "수원시 권선구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		
		//Set<K>Map.keySet():
		//-Map에 있는 Key만 뽑아내서 Set 형태로 만들어 반환

		Set<String> set = map.keySet();
		
		System.out.println("keySet : "  +set );
		
		//향상된 for문 +Set
		for(String key : set) {
			System.out.println(key + " : " +map.get((key)));
		}
		
		
		
	}

	/**
	 * Map 요소 (Entry)순차 접근 하기2
	 * -Map.entrySet() 이용하기
	 */
	public void method3() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원", "서울시 중구");
		map.put("집", "수원시 권선구");
		map.put("롯데타워", "서울시 송파구");
		map.put("63빌딩", "서울시 영등포구");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		//향상된 for문 + EntrySet

		//Entry.getKey() : Key만 얻어오기
		//Entry.getValue() : Value만 얻어오기
		for(Entry<String, String> entry : entrySet) {
			System.out.printf("key : %s, value : %s \n", 
					entry.getKey(),entry.getValue());
		}
	}

	/**
	 * Map 활용 하기 - DTO 대체하기
	 * -서로 다른 데이터를 한번에 묶어서 관리해야하는 경우
	 */
	public void method4() {
		
		//DTO/VO 이용방법
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
	
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c \n",
				p1.getName(),p1.getAge(),p1.getGender());
	
		System.out.println("===========================================================");
		
		//DTO 대신  Map 활용하기
		// -Key는 무조건 String을 활용하는 게 Best!
		// -Value의 타입이 모두 다름
		// ->Object를 부모타입 참조 변수로 활용
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		
		//데이터 추가
		
		p2.put("name", "김길순");
		p2.put("age", 52); // int -> Integer 변환
		p2.put("gender", '여'); //char -> Character 변환
		
		// 데이터 얻어오기
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %c \n",
				p2.get("name"),p2.get("age"),p2.get("gender"));
		
	}
}
