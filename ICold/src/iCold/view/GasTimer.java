package iCold.view;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GasTimer extends Thread{
	
	JFrame jr;
	JPanel panel;
	ChangePanel p;
	public GasTimer(JFrame jr, JPanel panel){
		this.jr = jr;
		this.panel = panel;		
	}
	
	@Override
	public void run(){		
		
	/*	JPanel dia = new JPanel();
		dia.setSize(300, 300);
		dia.setLocation(300, 300);
		*/
		
		for(int i = 60; i >= 0; i--){
			try {
				System.out.println(i);
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		p = new ChangePanel(jr, panel);
		JOptionPane.showMessageDialog(p, "������ �������ϴ�.");
		//new ChangePanel(jr, panel);
		//showScore();
		//new ChangePanel(jr, panel);
		
		
		
	}
	
	public void showScore(){
		//new ShowScore(jr, panel).saveScore();
		
		
	}
	
	
	

}
