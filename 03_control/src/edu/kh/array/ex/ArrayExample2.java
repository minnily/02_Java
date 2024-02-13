package edu.kh.array.ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample2 {

	private int x;

	//배열 복사
	// 얕은 복사시에 복사한 배열을 수정하게 될 경우 원래 배열 또한 수정되는 결과를 얻게된다 **(참고)**
	
	//얕은 복사(shallow) : 
	// 주소를 복사하여 서로 다른 두 변수가 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법			
	
	public void shallowCopy() {
		int[] arr= {1, 2, 3, 4, 5};
		
		//얕은 복사 진행
		int[] copyArr = arr; //주소만 복사
	
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	
		//얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	    //=>복사한 값을 변경하면 원본 배열도 변경된다!
	
	}
	
	//깊은 복사(deep)
	//-> 같은 자료형의 새로운 배열을 만들어서 기존 배열의 데이터를 모두 복사하는 방법

	public void deepCopy() {
		
		int[] arr = {1,2,3,4,5}; //원본배열
		
		//1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length];//5칸 짜리 배열 생성
		
		for(int i =0;i<arr.length;i++) {
		copyArr1[i]=arr[i];
		
		}
		
		// 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사할 배열명,복사 배열의 삽입 시작 인덱스, 복사길이);
		
		int[] copyArr2 = new int[arr.length]; //5칸짜리 배열 생성 (==원본)
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		// 3. 복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할길이);
		int[] copyArr3 =Arrays.copyOf(arr,arr.length);
		
		
		// 값 변경 후 확인
		
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
	}	
	
	//배열을 이용한 중복 데이터 제거 + 정렬
	
	public void createLottoNumber() {
		
		//6개의 로또 번호를 출력할 배열을 만들기
		
		int[] number = new int[8];
		
		
		//for문 사용하여 증가할때마다 랜덤번호 뽑기!
		
		for(int i =0; i<number.length; i++) {
		
		//i를 뽑는 동안 1~99까지의 숫자의 랜덤 번호!를 설정할 것이고 
		int randomnum = (int)(Math.random()*99 +1);
		
		//랜덤으로 뽑은 값을 i번째 로 넣을 것이다.
		number[i]=randomnum;
		
		//그런데 중복이 안되게 해야하기에 중복된 것 없애기!
		
		for(int h =0; h<i; h++) {
			if(randomnum == number[h]) {
				i--;
				break;
			}
		}
		
		}
	
		//오름차순으로 정렬하기
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		
	
	
	}
	
	
	
	

	
}
