package iCold.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class IColdFunction {

	public IColdFunction() {}
	
	public String nameDisplay() {
		String name = null;
		try (BufferedReader br = new BufferedReader(new FileReader("Information.txt"))) {
			name = br.readLine(); //information.txt의 첫번째 열의 정보를 name에 저장 

		} catch (Exception e) {
			e.printStackTrace();
		}

		return name;
	}

	public String coinDisplay() {
		String coin = null;
		try (BufferedReader br = new BufferedReader(new FileReader("Information.txt"))) {
			br.readLine();
			coin = br.readLine(); //information.txt의 두번째 열의 정보를 coin에 저장
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
			cloth = br.readLine(); //information.txt의 세번째 열의 정보를 cloth에 저장 
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cloth;
	}



	public void addCoin(int num) {
		String name = nameDisplay(); //파일 덮어쓰기 전 name정보를 백업하기 위해 name값 전달받음
		int coin = Integer.parseInt(this.coinDisplay());
		String coin2 = (coin+=num)+""; //coin값을 받아온 후 int로 변환, 인자값을 더해 다시 string으로 변환
		String clothBackup = clothDisplay(); //파일 덮어쓰기 전 cloth정보를 백업하기 위해 cloth값 전달받음
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



	public void subCoin(int num) {
		String name = nameDisplay(); //파일 덮어쓰기 전 name정보를 백업하기 위해 name값 전달받음
		int coin = Integer.parseInt(this.coinDisplay());
		String coinAfterSub = (coin-=num)+"";//coin값을 받아온 후 int로 변환, 인자값을 뺀 후 다시 string으로 변환
		String clothBackup = clothDisplay();//파일 덮어쓰기 전 cloth정보를 백업하기 위해 cloth값 전달받음
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
			bw.write(name);
			bw.newLine();
			bw.write(coinAfterSub);
			bw.newLine();
			bw.write(clothBackup);
			bw.newLine(); //파일에 백업용 cloth정보와 가감된 코인 정보 덮어쓰기

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void addCloth(String num) {
		String name = nameDisplay(); //파일 덮어쓰기 전 name정보를 백업하기 위해 name값 전달받음
		String cloth = this.clothDisplay();
		String cloth2 = cloth+num; //cloth값을 불러온 후 인자값을 문자열에 더함
		String coinBackup = coinDisplay(); //파일 덮어쓰기 전 coin정보를 백업하기 위해 coin값 전달받음 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("information.txt"))) {
		
			bw.write(name);
			bw.newLine();
			bw.write(coinBackup);
			bw.newLine();
			bw.write(cloth2);
			bw.close();//파일에 백업용 coin정보와 추가된 옷 정보 덮어쓰기

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}

