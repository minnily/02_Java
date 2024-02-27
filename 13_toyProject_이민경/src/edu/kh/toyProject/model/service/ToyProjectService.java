package edu.kh.toyProject.model.service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import edu.kh.toyProject.model.dto.DinoTeang;

public interface ToyProjectService {

	

	public abstract int addingDino(String modelName, int price, String material)throws Exception;

	public abstract String dateFormat(LocalDateTime date) throws Exception;

	public abstract Map<String, Object> checkDino()throws Exception;

	public abstract boolean purchaseDino(int index)throws Exception;

	public abstract boolean updateDino(int index, String modelName, int price, String material)throws Exception;

	


	

	

}
