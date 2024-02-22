package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.collection.model.vo.Toy;

public class ToyFactoryService {

 //list로 장난감 목록을 만들기
List<Toy> toyList = new ArrayList<Toy>();
	//기본 등록된 재료 map 만들기
Map<Integer, String> madeMap = new HashMap<Integer, String>();

public ToyFactoryService() {
	toyList.add(new Toy("마미롱레드", 8, 36000, "분홍색", "19950805", null));
	toyList.add(new Toy("허기위기", 5, 12000, "파란색", "19940312", null));
	toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", null));
	toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", null));
	toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", null));
	
	madeMap.put(1, "면직물");
	madeMap.put(2, "플라스틱");
	madeMap.put(3, "유리");
	madeMap.put(4, "고무");
}

	
}
