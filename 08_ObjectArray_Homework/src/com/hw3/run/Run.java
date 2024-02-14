package com.hw3.run;

import com.hw3.controller.ProductController2;

public class Run {
	public static void main(String[] args) {
		
		new ProductController2().mainMenu();
		//여러개를 불러야하는 경우에는 변수를 만들어서 평상시 처럼 사용하면 좋음
		//하지만, 현재는 하나만 불러야하는 경우이기에 이렇게 불러와도 된다.
	}
}
