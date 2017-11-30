package iCold.model.vo;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


import iCold.view.GasBack;

public class GasMain extends JFrame{
	
	public GasMain(){		
		this.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		this.add(new GasBack(this));
		
	/*	ChangePanel cp = new ChangePanel(this);
		this.getContentPane().add("one", cp);
		*/
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void changePanel(){
		//new ChangePanel(jr, panel);
	}
	
	

}
