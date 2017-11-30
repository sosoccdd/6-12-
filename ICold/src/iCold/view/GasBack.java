package iCold.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasBack extends JPanel{
	
	JFrame jr;
	JPanel panel;
	
	public GasBack(JFrame jr){
		this.jr = jr;
		this.setLayout(null);
		
		/*JLabel background = new JLabel(new ImageIcon(new ImageIcon("image\\batang.png").getImage().getScaledInstance(1000, 700, 0)));
		background.setBounds(0, 0, 1000, 700);
		this.panel.add(background);*/
		
		
		GasPanel gp = new GasPanel(jr);
		GasTimer timer = new GasTimer(jr, gp);
		//jr.setContentPane(timer);
		Thread t1 = timer;
		t1.start();
		
		
	}
	
	
	
	

}
