package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class EndingStoryV extends JFrame{
	public EndingStoryV() {
	}

	static class EndingStoryV1 extends JFrame{
		Timer t;
		JLabel story1;
		EndingStoryV1(){
			t= new Timer();
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			
			ImageIcon st1 = new ImageIcon("image\\입구컷.png");
			story1 = new JLabel(st1);
			story1.setLocation(43, 42);
			story1.setSize(893, 515);
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			add(story1);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV2 extends JFrame{
		JLabel story2;
		Timer t;
		EndingStoryV2(){
			
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			ImageIcon st2 = new ImageIcon("image\\파티춤신.png");
			story2 = new JLabel(st2);
			story2.setLocation(43, 42);
			story2.setSize(893, 515);
			t= new Timer();
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			add(story2);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV3 extends JFrame{
		JLabel story3;
		Timer t;
		EndingStoryV3(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			ImageIcon st3 = new ImageIcon("image\\번호따이기.png");
			story3 = new JLabel(st3);
			story3.setLocation(43, 42);
			story3.setSize(893, 515);
			t= new Timer();
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			add(story3);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV4 extends JFrame{
		JLabel story4;
		Timer t;
		EndingStoryV4(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			ImageIcon st4 = new ImageIcon("image\\훈남과춤.png");
			story4 = new JLabel(st4);
			story4.setLocation(43, 42);
			story4.setSize(893, 515);
			
			t= new Timer();
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			
			add(story4);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV5 extends JFrame{
		JLabel story5;
		Timer t;
		EndingStoryV5(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			ImageIcon st5 = new ImageIcon("image\\주인공.png");
			story5 = new JLabel(st5);
			story5.setLocation(43, 42);
			story5.setSize(893, 515);
			
			t= new Timer();
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			
			
			add(story5);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV6 extends JFrame{
		JLabel story6;
		Timer t;
		EndingStoryV6(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			ImageIcon st6 = new ImageIcon("image\\람보르기니.png");
			story6 = new JLabel(st6);
			story6.setLocation(43, 42);
			story6.setSize(893, 515);
			
			t= new Timer();
			TimerTask time = new TimerTask() {		
				@Override
				public void run() {
					setVisible(false);
					new IColdStartV();		
				}
			};
					
			t.schedule(time, 3000);
			
			
			add(story6);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
}
	