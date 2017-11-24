package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IColdStartV {

	public IColdStartV(){
		JFrame jframe = new JFrame("ICold Start");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		
		JLabel IColdlabel = new JLabel("ICold");
		IColdlabel.setFont(new Font("±¼¸²", Font.BOLD, 99));
		IColdlabel.setLocation(346, 118);
		IColdlabel.setSize(284, 163);
		
		JButton StartButton = new JButton("»õ·ÎÇÏ±â");
		StartButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		StartButton.setLocation(396, 423);
		StartButton.setSize(150, 50);
		StartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new SelectGenderV();
			}
		});
		
		JButton ContinewButton = new JButton("ÀÌ¾îÇÏ±â");
		ContinewButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		ContinewButton.setLocation(396, 496);
		ContinewButton.setSize(150, 50);
		ContinewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});
		
		jframe.getContentPane().add(IColdlabel);
		jframe.getContentPane().add(StartButton);
		jframe.getContentPane().add(ContinewButton);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}
	
}
