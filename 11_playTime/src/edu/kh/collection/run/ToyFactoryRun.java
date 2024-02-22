package edu.kh.collection.run;

import edu.kh.collection.model.service.ToyFactoryService;
import edu.kh.collection.model.service.ToyFactoryService2;

public class ToyFactoryRun {
	public static void main(String[] args) {
		ToyFactoryService toy = new ToyFactoryService();
		
		toy.displayMenu();
		
		ToyFactoryService2 toy2 = new ToyFactoryService2();
		toy2.displayMenu();
	}
}
