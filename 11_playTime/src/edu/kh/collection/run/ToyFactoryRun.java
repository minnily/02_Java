package edu.kh.collection.run;

import edu.kh.collection.model.service.ToyFactoryService;

public class ToyFactoryRun {
	public static void main(String[] args) {
		ToyFactoryService toy = new ToyFactoryService();
		
		toy.displayMenu();
	}
}
