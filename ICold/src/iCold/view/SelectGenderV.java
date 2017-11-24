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
import javax.swing.JTextField;

import iCold.model.vo.SelectGenderM;

public class SelectGenderV extends JFrame{

	SelectGenderM select = new SelectGenderM();
	
	public SelectGenderV(){

		JFrame jframe = new JFrame("SelectGender");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		ImageIcon gender = new ImageIcon("image\\¿©ÀÚ.png");
		JLabel genderlabel = new JLabel(gender);
		genderlabel.setLocation(224, 30);
		genderlabel.setSize(500, 500);

		JLabel nickLabel = new JLabel("´Ð³×ÀÓ");
		nickLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
		nickLabel.setLocation(371, 500);
		nickLabel.setSize(110, 30);

		JTextField nickText = new JTextField(10);
		nickText.setFont(new Font("±¼¸²", Font.BOLD, 20));
		nickText.setLocation(440, 500);
		nickText.setSize(120, 30);
		
		JButton checkButton = new JButton("È®  ÀÎ");
		checkButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		checkButton.setLocation(393, 542);
		checkButton.setSize(150, 50);
		checkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickText.getText();
				select.selectName(name);
				jframe.setVisible(false);
				new StartStoryV();
			}
		});

		jframe.getContentPane().add(genderlabel);
		jframe.getContentPane().add(nickLabel);
		jframe.getContentPane().add(nickText);
		jframe.getContentPane().add(checkButton);


		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);


	}


}
