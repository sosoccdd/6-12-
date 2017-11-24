package iCold.model.vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClothStoreM{
	private String list;
	private int pay;
	private int coin;
	private char cloth;
	
	
	public ClothStoreM() {}
	
	public ClothStoreM(String list, int pay, char cloth){
		
		this.list=list;
		this.pay=pay;
		this.cloth=cloth;
				
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	public void setList(String list) {
		this.list = list;
	}
	public String getList() {
		return list;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}	
	public char getCloth() {
		return cloth;
	}

	public void setCloth(char cloth) {
		this.cloth = cloth;
	}

}
