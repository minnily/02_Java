package edu.kh.toyProject.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.toyProject.model.dto.DinoTeang;

public class ToyProjectDAOImpl implements ToyProjectDAO {

		private final String FILE_PATH= "/java_test/1_ToyProject.dat";
		
		private ObjectInputStream ois = null;
		private ObjectOutputStream oos = null;
		
		private List<DinoTeang> dinoList = null;
		
		public ToyProjectDAOImpl() throws IOException, ClassNotFoundException {
			
			File file = new File(FILE_PATH);
			
			if(file.exists()) {
				try {
					ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
					dinoList = (ArrayList<DinoTeang>)ois.readObject();
				
				}finally {
					if(ois != null)ois.close();
				}
			}else {
				File directory = new File("/java_test");
				if(!directory.exists())directory.mkdir();
			
			dinoList = new ArrayList<DinoTeang>();
			
			dinoList.add(new DinoTeang("쿼카 슬리퍼",26000, "polyester 100%", LocalDateTime.now(), false));
			dinoList.add(new DinoTeang("스모어 쿼카 쿠션", 39000, "polyester 100%",LocalDateTime.now(), false));
			dinoList.add(new DinoTeang("스모어 피규어", 33000, "PVC", LocalDateTime.now(), false));
			dinoList.add(new DinoTeang("쿼카&보노 머그컵", 26000, "Ceramic",LocalDateTime.now() , false));
			dinoList.add(new DinoTeang("쿼카 스노우볼 메이커", 10000, "PVC",LocalDateTime.now() , false));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(dinoList);
			} finally {
				if (oos != null)oos.close();
			}
			System.out.println("++++ ToyProject.dat 파일 생성 완료 ++++");
			}
		}

		private void saveFile() throws Exception{
			
			try {
				//FILE_PATH 경로에 있는 파일과 연결된 객체 출력 스트림 생성
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(dinoList); //toodoList 출력
				
			}  finally {
				oos.close();
				
				
			}
			
		}
		
		
		
		
		
		@Override
		public List<DinoTeang> checkDino() throws Exception {
			
			return dinoList;
		}

		@Override
		public int addingDino(DinoTeang dino) throws Exception{
			if(dinoList.add(dino)) {
				saveFile();
				
				return dinoList.size()-1;
			}
			return -1;
		}


	
		
}
