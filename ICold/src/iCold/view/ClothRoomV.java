package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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


		ImageIcon gender = new ImageIcon("image\\ø©¿⁄.png");
		JLabel genderLabel = new JLabel(gender);
		genderLabel.setLocation(0, 96);
		genderLabel.setSize(376, 442);


		JButton coinButton = new JButton(function.coinDisplay()+" ∞≥ ");
		coinButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		coinButton.setLocation(30, 30);
		coinButton.setSize(150, 50);
		
		JButton ClothButton = new JButton("ø  ¿Â");
		ClothButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		ClothButton.setLocation(400, 30);
		ClothButton.setSize(150, 50);

		JButton endingButton = new JButton("ªÁ±≥¿Â∞°±‚");
		endingButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		endingButton.setLocation(750, 30);
		endingButton.setSize(150, 50);
		endingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				char cr[] = new char[5];
				ArrayList ar = new ArrayList();
			    
				cr = function.clothDisplay().toCharArray();
				
				for (int j = 0; j < cr.length; j++) {
					if(cr[j]!='0')
					ar.add(cr[j], j);
				}
				
				
			
			}
			
		});

		JButton nickName = new JButton(function.nameDisplay());
		nickName.setFont(new Font("±º∏≤", Font.BOLD, 20));
		nickName.setLocation(120, 550);
		nickName.setSize(150, 50);

		JButton StoreButton = new JButton("ªÛ¡°");
		StoreButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		StoreButton.setLocation(400, 550);
		StoreButton.setSize(150, 50);
		StoreButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new ClothStoreV();

			}
			
		});
		JButton workButton = new JButton("∞ÌøÎ≥Îµø∫Œ");
		workButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		workButton.setLocation(599, 550);
		workButton.setSize(150, 50);
		workButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new WorkNetV();

			}
			
		});

		JButton randomButton = new JButton("∑£¥˝π⁄Ω∫");
		randomButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
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
