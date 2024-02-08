package edu.kh.oop.abstraction.model.vo;

public class Hero {
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void attack(int exp) {
		System.out.println(nickName+"은 공격을 했다!!");
		this.exp += exp;
		
			if(this.exp >500) {
				level+= 1;
				System.out.print("레벨이 올랐습니다! 현재 레벨 :"+level +" 입니다.\n");
			}
	}
	
	public void magicJump(int mp) {
		
		if(mp <=0) {
			System.out.println("더 이상 매직 점프 할 수 없습니다.");
		}else { this.mp-=10;
		System.out.println(nickName +"의 mp는"+this.mp +"남았습니다");
		}
	}
}
