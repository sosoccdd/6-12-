package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartStoryV {
	
	public StartStoryV(){
		JFrame jframe = new JFrame("StartStory");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		JButton SkipButton = new JButton("Skip");
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
		jframe.getContentPane().add(SkipButton);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		
	}

}
