package iCold.model.vo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import iCold.model.dao.IColdFunction;

public class SelectGenderM {
	IColdFunction function = new IColdFunction();
	public SelectGenderM(){
		
	}
	public void selectName(String name) {
		String coin2 = function.coinDisplay();  //���� ����� �� coin������ ����ϱ� ���� coin�� ���޹���
		String clothBackup = function.clothDisplay(); //���� ����� �� cloth������ ����ϱ� ���� cloth�� ���޹���
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
			bw.write(name);
			bw.newLine();
			bw.write(coin2);
			bw.newLine();
			bw.write(clothBackup);
			bw.newLine(); //���Ͽ� ����� cloth������ ������ ���� ���� �����

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
