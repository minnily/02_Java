package edu.kh.toyProject.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.kh.toyProject.model.dto.Toy;

public class ToyProjectDAOImpl implements ToyProjectDAO {

		private final String FILE_TOY= "/java_project/1_ToyProject.dat";
		
		private ObjectInputStream ois = null;
		private ObjectOutputStream oos = null;
		
		private List<Toy> toyList = null;
		
		public ToyProjectDAOImpl() throws IOException, ClassNotFoundException {
			
			File file = new File(FILE_TOY);
			
			if(file.exists()) {
				try {
					ois = new ObjectInputStream(new FileInputStream(FILE_TOY));
					toyList = (ArrayList<Toy>)ois.readObject();
				
				}finally {
					if(ois != null)ois.close();
				}
			}else {
				File directory = new File("/java_test");
				if(!directory.exists())directory.mkdir();
			
			toyList = new ArrayList<Toy>();
			
			toyList.add(new Toy("바쉬풀 버니", 62900, "polyester", 0, "젤리캣"));
			toyList.add(new Toy("아이스크림 가게 놀이세트", 60000, "PVC", 3, "토이트론"));
			toyList.add(new Toy("포켓몬 RC카", 23400, "ABS", 3, "포켓몬"));
			toyList.add(new Toy("맥타일즈 자석 블록", 99000, "플라스틱",5 , "맥킹덤"));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_TOY));
				oos.writeObject(toyList);
			} finally {
				if (oos != null)oos.close();
			}
			System.out.println("++++ ToyProject.dat 파일 생성 완료 ++++");
			}
		}
}
