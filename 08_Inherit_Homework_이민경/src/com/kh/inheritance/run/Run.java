package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;

import com.kh.inheritance.model.dto.SmartPhone;

public class Run {
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("Samsung","Galaxy S20",2020,1200000,"Android",128);

//		sp.setBrand("Samsung");
//		sp.setModel("Galaxy S20");
//		sp.setYear(2020);
//		sp.setPrice(1200000);
//		sp.setOperatingSystem("Android");
//		sp.setStorageCapacity(128);
		
		
		
		sp.printlnfo();
		
		System.out.println("==========================");
		
		BasicPhone bp = new BasicPhone("Nokia","3310",2000,100000,true);
		
//		bp.setBrand("Nokia");
//		bp.setModel("3310");
//		bp.setYear(2000);
//		bp.setPrice(100000);
		
		bp.printlnfo();
		bp.checkKeyboard();
	}
}
