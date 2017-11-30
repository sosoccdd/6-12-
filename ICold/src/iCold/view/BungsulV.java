package iCold.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BungsulV {
	public BungsulV(){
				
		JFrame jframe = new JFrame("ºØ¾î»§ °ÔÀÓ »ç¿ë¼³¸í¼­");
		jframe.getContentPane().setLayout(null);
		jframe.getContentPane().setBackground(Color.getHSBColor(55, 33, 55));
		jframe.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		ImageIcon sulimage = new ImageIcon("image\\ºØ¾î»§¼³¸í.png");
		JLabel sullabel = new JLabel(sulimage);
		sullabel.setBackground(Color.getHSBColor(55, 33, 55));
		sullabel.setLocation(28, 33);
		sullabel.setSize(927, 519);
		
		
		ImageIcon Startimage = new ImageIcon("image\\°ÔÀÓ½ÃÀÛ.gif");
		JButton StartButton = new JButton(Startimage);
		StartButton.setLocation(356, 555);
		StartButton.setSize(271, 86);
		StartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new BungeoppangV();
				
			}
			
		});
		
		
		jframe.getContentPane().add(sullabel);
		jframe.getContentPane().add(StartButton);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}

}
