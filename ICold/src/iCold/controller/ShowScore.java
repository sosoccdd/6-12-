package iCold.controller;

import javax.swing.JFrame;
import javax.swing.JPanel;

import iCold.view.ChangePanel;

public class ShowScore {
	
	JFrame jr;
	JPanel panel;
	
	public ShowScore(JFrame jr, JPanel panel){
		this.jr = jr;
		this.panel = panel;	
	}
	
	
	public void saveScore(){
		new ChangePanel(jr, panel);
	}
	
	
	
	

}
