package iCold.model.vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClothStoreM {
	private String list;
	private int pay;
	private int coin;
	
	public ClothStoreM() {}
	
	public ClothStoreM(String list, int pay){
		
		this.list=list;
		this.pay=pay;	
	}
//	public void coin(int num){
//		
//		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("main.txt"))) {
//
//			int i = (int) objIn.readObject();			
//			System.out.println(i);
//			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("main.txt"));
//			objOut.writeObject(i-num);
//			setCoin(i-num);
//			objOut.flush();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//
//	public void openfile(){
//		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("main.txt"))) {
//
//			int i = (int) objIn.readObject();
//			setCoin(i);
//			System.out.println(i);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public void savefile(){
//		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("main.txt"))){
//			objOut.writeObject(500);
//			objOut.flush();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

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
	public String prints() {		
		return getList()+"   "+getPay();
	}

}
