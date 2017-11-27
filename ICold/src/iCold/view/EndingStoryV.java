package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class EndingStoryV extends JFrame{

	static class EndingStoryV1 extends JFrame{
		JButton story1;
		EndingStoryV1(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JButton("ÀÔ±¸ÄÆ ¤Ð");
			story1.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story1.setBounds(170, 10, 650, 80);
			
			add(story1);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV2 extends JFrame{
		JButton story2;
		EndingStoryV2(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story2 = new JButton("ÆÄÆ¼ Ãã½Å!");
			story2.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story2.setBounds(170, 10, 650, 80);
			
			add(story2);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV3 extends JFrame{
		JButton story3;
		EndingStoryV3(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story3 = new JButton("¹øÈ£ µû¿©¹ö¸®±â~");
			story3.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story3.setBounds(170, 10, 650, 80);
			
			add(story3);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV4 extends JFrame{
		JButton story4;
		EndingStoryV4(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story4 = new JButton("ÈÆ³²°ú ÃãÀ»!");
			story4.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story4.setBounds(170, 10, 650, 80);
			
			add(story4);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV5 extends JFrame{
		JButton story5;
		EndingStoryV5(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story5 = new JButton("ÆÄÆ¼ ÁÖÀÎ°ø!");
			story5.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story5.setBounds(170, 10, 650, 80);
			
			add(story5);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV6 extends JFrame{
		JButton story6;
		EndingStoryV6(){
			setLayout(null);
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story6 = new JButton("¶÷º¸¸£±â´Ï µå¶óÀÌºù!");
			story6.setFont(new Font("±¼¸²", Font.BOLD, 50));
			story6.setBounds(170, 10, 650, 80);
			
			add(story6);
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
}
	