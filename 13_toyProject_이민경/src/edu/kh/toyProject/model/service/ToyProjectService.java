package edu.kh.toyProject.model.service;


import java.time.LocalDateTime;
import java.util.Map;

public interface ToyProjectService {

	public abstract Map<String, Object> checkDino() throws Exception;

	public abstract int addingDino(String modelName, int price, String material)throws Exception;

	public abstract String dateFormat(LocalDateTime date) throws Exception;

	


	

	

}
