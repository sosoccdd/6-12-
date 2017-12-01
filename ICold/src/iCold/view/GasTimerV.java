package iCold.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class GasTimerV extends Thread{

	JFrame jr;
	JPanel panel;
	
	public GasTimerV(JFrame jr, JPanel panel){
		this.jr = jr;
		this.panel = panel;
	}

	@Override
	public void run(){		

		GasPanelV gp = new GasPanelV();
		
		//�������� ������ ����Ͽ� i �� ����
		for(int i = 100; i >= 0; i--){
			try {
				System.out.println(i);
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		//for���� ������ �������� false, GasEnd����
		jr.setVisible(false);
		new GasEndV();
	}

}
