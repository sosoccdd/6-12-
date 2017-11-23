package iCold.view;

import java.awt.Dimension;
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
		jframe.setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		ImageIcon gender = new ImageIcon("image\\여자.png");
		JLabel genderlabel = new JLabel(gender);
		genderlabel.setLocation(224, 30);
		genderlabel.setSize(500, 500);

		JLabel nickLabel = new JLabel("닉네임");
		nickLabel.setLocation(393, 500);
		nickLabel.setSize(100, 30);

		JTextField nickText = new JTextField(10);
		nickText.setLocation(450, 500);
		nickText.setSize(100, 30);
		
		JButton checkButton = new JButton("확  인");
		checkButton.setLocation(393, 542);
		checkButton.setSize(150, 50);
		checkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickText.getText();
				select.selectName(name);
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});

		jframe.add(genderlabel);
		jframe.add(nickLabel);
		jframe.add(nickText);
		jframe.add(checkButton);


		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);


	}


}
