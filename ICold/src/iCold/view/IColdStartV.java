package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

import iCold.model.dao.IColdFunction;

public class IColdStartV {

	public IColdStartV(){
		IColdFunction function = new IColdFunction();
		JFrame jframe = new JFrame("ICold Start");
		jframe.getContentPane().setBackground(Color.getHSBColor(10, 123, 23));
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		ImageIcon ICold = new ImageIcon("image\\icold.png");
		JLabel IColdlabel = new JLabel(ICold);
		IColdlabel.setBackground(Color.getHSBColor(10, 123, 23));
		IColdlabel.setBackground(new Color(30, 144, 255));
		IColdlabel.setLocation(308, 119);
		IColdlabel.setSize(358, 130);
		
		ImageIcon start = new ImageIcon("image\\start.png");
		JButton StartButton = new JButton(start);
		StartButton.setLocation(324, 329);
		StartButton.setSize(326, 100);
		StartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				function.reset();
				
				new SelectGenderV();
			}
		});
		
		ImageIcon end = new ImageIcon("image\\end.png");
		JButton ContinewButton = new JButton(end);
		ContinewButton.setLocation(324, 471);
		ContinewButton.setSize(326, 100);
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
