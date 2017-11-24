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

import iCold.model.dao.IColdFunction;
import iCold.model.vo.ClothStoreM;

public class ClothRoomV {
	ClothStoreM Store = new ClothStoreM();
	IColdFunction function = new IColdFunction();
	public ClothRoomV(){

		JFrame jframe = new JFrame("ClothRoom");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);


		ImageIcon gender = new ImageIcon("image\\¿©ÀÚ.png");
		JLabel genderLabel = new JLabel(gender);
		genderLabel.setLocation(0, 96);
		genderLabel.setSize(376, 442);


		JButton coinButton = new JButton(function.coinDisplay()+" °³ ");
		coinButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		coinButton.setLocation(30, 30);
		coinButton.setSize(150, 50);
		
		JButton ClothButton = new JButton("¿Ê Àå");
		ClothButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		ClothButton.setLocation(400, 30);
		ClothButton.setSize(150, 50);

		JButton endingButton = new JButton("»ç±³Àå°¡±â");
		endingButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		endingButton.setLocation(750, 30);
		endingButton.setSize(150, 50);
		endingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new EndingStroyV();

			}
			
		});

		JButton nickName = new JButton(function.nameDisplay());
		nickName.setFont(new Font("±¼¸²", Font.BOLD, 20));
		nickName.setLocation(120, 550);
		nickName.setSize(150, 50);

		JButton StoreButton = new JButton("»óÁ¡");
		StoreButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		StoreButton.setLocation(400, 550);
		StoreButton.setSize(150, 50);
		StoreButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new ClothStoreV();

			}
			
		});
		JButton workButton = new JButton("°í¿ë³ëµ¿ºÎ");
		workButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		workButton.setLocation(599, 550);
		workButton.setSize(150, 50);
		workButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new WorkNetV();

			}
			
		});

		JButton randomButton = new JButton("·£´ý¹Ú½º");
		randomButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		randomButton.setLocation(785, 550);
		randomButton.setSize(150, 50);
		randomButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new RandomBoxV.MainFrame();

			}
			
		});
		jframe.add(genderLabel);
		jframe.add(coinButton);
		jframe.add(ClothButton);
		jframe.add(endingButton);
		jframe.add(nickName);
		jframe.add(StoreButton);
		jframe.add(workButton);
		jframe.add(randomButton);



		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

		


	}

}
