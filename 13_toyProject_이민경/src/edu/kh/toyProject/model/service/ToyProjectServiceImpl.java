package edu.kh.toyProject.model.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.toyProject.model.dao.ToyProjectDAO;
import edu.kh.toyProject.model.dao.ToyProjectDAOImpl;
import edu.kh.toyProject.model.dto.DinoTeang;

public class ToyProjectServiceImpl implements ToyProjectService{

	private static final LocalDateTime LocalDateTime = null;
	private ToyProjectDAO dao = null;
	
	public ToyProjectServiceImpl() throws Exception{
		
		dao = new ToyProjectDAOImpl();
	}
	
	@Override
	public String dateFormat(LocalDateTime date) {
		
		return null;
	}
	/*상품 조회하기*/
	
	
	@Override
	public Map<String, Object> checkDino() throws Exception {
		List<DinoTeang> dinoList = dao.checkDino();
		int soldCount =0;
		
		for(DinoTeang dinoTeang : dinoList) {
			if(dinoTeang.isPurchase()) {
				soldCount++;
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("dinoList", dinoList);
		map.put("soldCount", soldCount);
		return map;
	}
	
	/*상품 추가하기*/
	@Override
	public int addingDino(String modelName, int price, String material) throws Exception{
		
		DinoTeang dino = new DinoTeang(modelName, price, material,LocalDateTime.now(), false);
		
		int index =dao.addingDino(dino);
		
		return index;
	}

	@Override
	public boolean purchaseDino(int index) throws Exception {
		
		return dao.purchaseDino(index);
	}

	@Override
	public boolean updateDino(int index, String modelName, int price, String material) throws Exception {
		
		return dao.updateDino(index, modelName, price, material);
	}



	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
