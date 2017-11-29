package iCold.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartStoryV extends JFrame{
	
	JFrame jframe = new JFrame("StartStory");
	Timer[] time;
	int set_time = 2000;
	public StartStoryV(){
		time = new Timer[4];
		jframe.getContentPane().setBackground(Color.getHSBColor(55, 33, 55));
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		time[3] = new Timer();
		time[0] = new Timer();
		time[1] = new Timer();
		time[2] = new Timer();
		
		ImageIcon story1 = new ImageIcon("image\\story1.png");
		ImageIcon story2 = new ImageIcon("image\\story2.png");
		ImageIcon story3 = new ImageIcon("image\\story3.png");
		JLabel storylabel = new JLabel(story1);
		storylabel.setLocation(43, 42);
		storylabel.setSize(893, 515);
		TimerTask time1 = new TimerTask() {		
			@Override
			public void run() {
				storylabel.setIcon(story2);			
			}
		};
		TimerTask time2 = new TimerTask() {		
			@Override
			public void run() {
				storylabel.setIcon(story3);			
			}
		};
				
		time[0].schedule(time1, set_time*2);
		time[1].schedule(time2, set_time*4);
		
		ImageIcon skip = new ImageIcon("image\\skip.png");
		JButton SkipButton = new JButton(skip);
		SkipButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		SkipButton.setLocation(786, 569);
		SkipButton.setSize(150, 50);
		SkipButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});
		jframe.getContentPane().add(storylabel);
		jframe.getContentPane().add(SkipButton);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		
	}

}
