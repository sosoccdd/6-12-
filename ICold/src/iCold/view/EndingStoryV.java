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
			story1 = new JLabel("�Ա��� ���ع��Ⱦ�� �Ф�");
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
			story1 = new JLabel("ȯ������ �㸸 �߰� ���Ծ��!");
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
			story1 = new JLabel("��ȣ �������!");
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
			story1 = new JLabel("�Ƴ��� �Բ� ������!");
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
			story1 = new JLabel("������ ���ô԰� ����̺�!");
			story1.setBounds(500,350,100,100);
			
			setVisible(true);
			this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		}
	}
}
	