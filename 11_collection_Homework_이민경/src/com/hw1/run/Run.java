package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
//		Friend fri = new Friend();
		//friend 객체만 넣을 수 있는 arrylist 객체 생성
		List <Friend> friendList = new ArrayList<Friend>();
		
		
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
		//방법 2 . Collections.add(All);사용하기
		
//		Collections.addAll(friendList, new Friend("짱구"),new Friend("철수"),
//				new Friend("유리"),new Friend("훈이"),new Friend("맹구"));
//		
		
		
		//방법 3. List.of() =Java 9 이상의 버전에서 사용가능
//		List<Friend> friendList = List.of(new Friend("짱구"),new Friend("철수"),
//				new Friend("유리"),new Friend("훈이"),new Friend("맹구"));
		
		
		
		
		//랜덤으로 골목대장 뽑기
		//Random random = new Random();
	
		
		int com = (int)(Math.random()*friendList.size());
		
		
			Friend leader =friendList.get(com);
			
			
			leader.pickLeader();
			
		
		
		
	}	
}
	
