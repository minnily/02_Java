package edu.kh.toyProject.model.dao;

import java.util.List;

import edu.kh.toyProject.model.dto.DinoTeang;

public interface ToyProjectDAO {

	List<DinoTeang> checkDino()throws Exception;

	int addingDino(DinoTeang dino) throws Exception;

}
