package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Hero;

public class HeroService2 {

	public void ex1() {
	
		Hero he =new Hero();
		Hero hs  =new Hero();
		
		he.setNickName("lee");
		he.setJob("마법사");
		he.setHp(100);
		he.setMp(5000);
		he.setLevel(30);
		he.setExp(6000);		
	
		
		
		System.out.println("닉네임 :"+he.getNickName());
		System.out.println(he.getNickName()+"의 직업 :"+he.getJob());
		System.out.println(he.getNickName()+"의 체력 :"+he.getHp());
		System.out.println(he.getNickName()+"의 마력 :"+he.getMp());
		System.out.println(he.getNickName()+"의 레벨 :"+he.getLevel());
		System.out.println(he.getNickName()+"의 경험치 :"+he.getExp());
	
		System.out.printf("%s 직업으로 %s님이 생성되었습니다. 현재 레벨 :%d\n",he.getJob(),he.getNickName(),he.getLevel());
		
		he.attack(50);
		he.magicJump(100);
		
		
		System.out.println("===========================================================");
		
		
		
		
		
		hs.setNickName("쿠키");
		hs.setJob("요리사");
		hs.setHp(500);
		hs.setMp(300);
		hs.setLevel(1);
		hs.setExp(3000);	
		
		
		
		
		System.out.println("닉네임 :"+hs.getNickName());
		System.out.println(hs.getNickName()+"의 직업 :"+hs.getJob());
		System.out.println(hs.getNickName()+"의 체력 :"+hs.getHp());
		System.out.println(hs.getNickName()+"의 마력 :"+hs.getMp());
		System.out.println(hs.getNickName()+"의 레벨 :"+hs.getLevel());
		System.out.println(hs.getNickName()+"의 경험치 :"+hs.getExp());
		
		System.out.printf("%s 직업으로 %s님이 생성되었습니다. 현재 레벨 :%d\n",hs.getJob(),hs.getNickName(),hs.getLevel());
		
		
		
		
		
	}
	
}
