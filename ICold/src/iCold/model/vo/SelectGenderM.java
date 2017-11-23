package iCold.model.vo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import iCold.model.dao.IColdFunction;

public class SelectGenderM {
	IColdFunction function = new IColdFunction();
	public SelectGenderM(){
		
	}
	public void selectName(String name) {
		String coin2 = function.coinDisplay();  //파일 덮어쓰기 전 coin정보를 백업하기 위해 coin값 전달받음
		String clothBackup = function.clothDisplay(); //파일 덮어쓰기 전 cloth정보를 백업하기 위해 cloth값 전달받음
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
			bw.write(name);
			bw.newLine();
			bw.write(coin2);
			bw.newLine();
			bw.write(clothBackup);
			bw.newLine(); //파일에 백업용 cloth정보와 더해진 코인 정보 덮어쓰기

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
