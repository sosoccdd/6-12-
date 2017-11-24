package iCold.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class EndingStoryV extends JFrame{

	static class EndingStoryV1 extends JFrame{
		JLabel story1;
		EndingStoryV1(){
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JLabel("입구컷 당해버렸어요 ㅠㅠ");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV2 extends JFrame{
		JLabel story1;
		EndingStoryV2(){
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JLabel("환상적인 춤만 추고 나왔어요!");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV3 extends JFrame{
		JLabel story1;
		EndingStoryV3(){
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JLabel("번호 따였어요!");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV4 extends JFrame{
		JLabel story1;
		EndingStoryV4(){
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JLabel("훈남과 함께 춤췄어요!");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
	
	static class EndingStoryV5 extends JFrame{
		JLabel story1;
		EndingStoryV5(){
			setBounds(1000,1000,1000,700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			story1 = new JLabel("부잣집 도련님과 드라이빙!");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
}
	