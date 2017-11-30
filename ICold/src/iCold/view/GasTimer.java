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



public class GasTimer extends Thread{

	JFrame jr;
	JPanel panel;
	JLabel time;
	//ChangePanel p;
	ImageIcon icon;

/*	Timer mTimer = new Timer();
	int mTime = 1000;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(mTimer == arg0.getSource())
		{
			mTime-=20;
			if(mTime <= 0)
			{
				
				}
		
		}
	}
	
	public void paintComponent(Graphics g) {
	       

	       g.setColor(Color.red);
	       g.fillRect(300, 400,mTime, 20);
	
	}*/
	//Timer t = new Timer(speed, this);


	public GasTimer(JFrame jr, JPanel panel){
		this.jr = jr;
		this.panel = panel;
		//ImageIcon icon = new ImageIcon("image\\timerim");
		//this.paintComponent(icon);
		/*time = new JLabel(icon);
		time.setSize(150, 150);
		time.setLocation(600, 20);
		panel.add(time);
		if(i%10==0){
			time.setLocation(600 - i , 20);
			jr.repaint();

		}*/




	}

	@Override
	public void run(){		


		GasPanel gp = new GasPanel();
		//gp.timelable();




		
	/*	JPanel dia = new JPanel();
		dia.setSize(300, 300);
		dia.setLocation(300, 300);
		*/
		
		for(int i = 100; i >= 0; i--){
			try {
				System.out.println(i);
				//time.setLocation((point.x-(i*10)), 20);
				this.sleep(100);



			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}


		jr.setVisible(false);
		new GasPanelChange();

	}


}
