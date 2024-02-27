package edu.kh.toyProject.model.dao;

import java.util.List;

import edu.kh.toyProject.model.dto.DinoTeang;

public interface ToyProjectDAO {
	
	void saveFile() throws Exception;

	List<DinoTeang> checkDino()throws Exception;

	int addingDino(DinoTeang dino) throws Exception;

	boolean purchaseDino(int index)throws Exception;

	boolean updateDino(int index, String modelName, int price, String material)throws Exception;

}
