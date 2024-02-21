package edu.kh.collection.model.vo;

import java.util.HashMap;
import java.util.Map;

public class Use extends Toy{

	//기본 등록된 재료 만들기 (고유번호, 재료명)
	public void use() {
		Map<Integer, String> basicUse = new HashMap<Integer, String>();
		
		basicUse.put(1, "면직물");
		basicUse.put(2, "플라스틱");
		basicUse.put(3, "유리");
		basicUse.put(4, "고무");
	}
}
