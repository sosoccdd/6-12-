package iCold.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodFighterV extends JFrame{
			
		public FoodFighterV() {
			JFrame fr=new JFrame("푸드파이터");
			fr.setBounds(1000, 1000, 1000, 700);
			fr.setLayout(null);
			Dimension frameSize = fr.getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			fr.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

			
			//ImageIcon gh1=new ImageIcon("images\\qoruds.jpg");
			ImageIcon gh2=new ImageIcon("images\\그림28.png");
			ImageIcon gh3=new ImageIcon("images\\그림29.png");
			ImageIcon gh4=new ImageIcon("images\\그림31.png");
			
			JPanel gh2panel =new JPanel();
			JLabel gh2label =new JLabel(gh2);
			gh2label.add(gh2label);
			gh2label.setSize(150, 160);
			gh2label.setLocation(350, 300);
			
			JPanel gh3panel =new JPanel();
			JLabel gh3label =new JLabel(gh3);
			gh3panel.add(gh3label);
			gh3panel.setSize(150, 160);
			gh3panel.setLocation(350, 300);
			
			JPanel gh4panel =new JPanel();
			JLabel gh4label =new JLabel(gh4);
			gh4panel.add(gh4label);
			gh4panel.setSize(80, 90);
			gh4panel.setLocation(300, 400);
			
			
			
			
			fr.add(gh2label);
			//fr.add(gh3panel);
			//fr.add(gh4panel);
			
			
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
}
