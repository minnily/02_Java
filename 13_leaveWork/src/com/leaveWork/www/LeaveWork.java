package com.leaveWork.www;

import java.time.LocalDateTime;

public class LeaveWork {

	private String Name; //퇴사자 이름
	private LocalDateTime leaveDate; // 퇴사날짜(오늘로 할 예정)
	private String why;// 퇴사사유
	
	public LeaveWork(String name, LocalDateTime leaveDate, String why) {
		super();
		Name = name;
		this.leaveDate = leaveDate;
		this.why = why;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDateTime getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(LocalDateTime leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	@Override
	public String toString() {
		return "퇴사예정자 [이름 : " + Name + "/ 퇴사일 : " + leaveDate + "]\n 사유 : " + why ;
	}
	
	
	
	
}
