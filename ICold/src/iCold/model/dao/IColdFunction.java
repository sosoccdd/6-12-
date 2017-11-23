package iCold.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class IColdFunction {

	public IColdFunction() {}

	public String coinDisplay() {
		String coin = null;
		try (BufferedReader br = new BufferedReader(new FileReader("Information.txt"))) {
			br.readLine();
			coin = br.readLine(); //information.txt�� �ι�° ���� ������ coin�� ����
		} catch (Exception e) {
			e.printStackTrace();
		}

		return coin;
	}
	
	public String clothDisplay() {
		String cloth = null;
		try (BufferedReader br = new BufferedReader(new FileReader("Information.txt"))) {
			br.readLine();
			br.readLine();
			cloth = br.readLine(); //information.txt�� ����° ���� ������ cloth�� ���� 
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cloth;
	}



	public void addCoin(int num) {
		int coin = Integer.parseInt(this.coinDisplay());
		String coin2 = (coin+=num)+""; //coin���� �޾ƿ� �� int�� ��ȯ, ���ڰ��� ���� �ٽ� string���� ��ȯ
		String clothBackup = clothDisplay(); //���� ����� �� cloth������ ����ϱ� ���� cloth�� ���޹���
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
			bw.write("�μ�");
			bw.newLine();
			bw.write(coin2);
			bw.newLine();
			bw.write(clothBackup);
			bw.newLine(); //���Ͽ� ����� cloth������ ������ ���� ���� �����

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	public void subCoin(int num) {
		int coin = Integer.parseInt(this.coinDisplay());
		String coinAfterSub = (coin-=num)+"";//coin���� �޾ƿ� �� int�� ��ȯ, ���ڰ��� �� �� �ٽ� string���� ��ȯ
		String clothBackup = clothDisplay();//���� ����� �� cloth������ ����ϱ� ���� cloth�� ���޹���
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
			bw.write("�μ�");
			bw.newLine();
			bw.write(coinAfterSub);
			bw.newLine();
			bw.write(clothBackup);
			bw.newLine(); //���Ͽ� ����� cloth������ ������ ���� ���� �����

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void addCloth(int num) {
		String cloth = this.clothDisplay();
		String cloth2 = cloth+num; //cloth���� �ҷ��� �� ���ڰ��� ���ڿ��� ����
		String coinBackup = coinDisplay(); //���� ����� �� coin������ ����ϱ� ���� coin�� ���޹��� 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
		
			bw.write("�μ�");
			bw.newLine();
			bw.write(coinBackup);
			bw.newLine();
			bw.write(cloth2);
			bw.close();//���Ͽ� ����� coin������ �߰��� �� ���� �����

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
