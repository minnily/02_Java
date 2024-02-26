package edu.kh.toyProject.model.service;

import edu.kh.toyProject.model.dao.ToyProjectDAO;
import edu.kh.toyProject.model.dao.ToyProjectDAOImpl;

public class ToyProjectServiceImpl implements ToyProjectService{

	private ToyProjectDAO dao = null;
	
	public ToyProjectServiceImpl() {
		
		dao = new ToyProjectDAOImpl();
	}
	
}
