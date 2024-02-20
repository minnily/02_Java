package edu.kh.collection.pack1.run;

import edu.kh.collection.pack1.model.service.StudentService;
import edu.kh.collection.pack1.model.service.StudentService_pr1;

public class StudentRun {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		//service.ex();
		service.displayMenu();
		
		StudentService_pr1 ser1 =new StudentService_pr1();
		ser1.displayMenu();
	}
}
