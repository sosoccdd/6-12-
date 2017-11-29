package iCold.model.vo;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import iCold.view.GasOilV;
import iCold.view.WorkNetV;

public class GasOilM extends GasOilV implements Runnable{

	public GasOilM() {
	}

	public void gastimer(){
	}

	@Override
	public void run() {			
		
		Thread gas = new Thread(new GasOilV());
		Thread t1 = gas;
		t1.setPriority(10);
		t1.start();
		
		try {
			for(int i = 0; i<=100; i++){
				System.out.println(i);
				Thread.sleep(100);
				if(i==100){
					this.diag();				
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}





}




