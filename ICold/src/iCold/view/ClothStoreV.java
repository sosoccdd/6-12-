package iCold.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import iCold.model.dao.IColdFunction;
import iCold.model.vo.ClothStoreM;


public class ClothStoreV extends JFrame{
	ClothStoreM Store = new ClothStoreM();
	IColdFunction function = new IColdFunction();
	private int i = 0;
	public ClothStoreV() {
		JFrame jframe = new JFrame("ClothStore");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		
		
		ImageIcon gender = new ImageIcon("image\\ø©¿⁄.png");
		JLabel genderlabel = new JLabel(gender);
		genderlabel.setLocation(-14, 68);
		genderlabel.setSize(500, 500);

		JButton ClothButton = new JButton("ø  ¿Â");
		ClothButton.setLocation(30, 30);
		ClothButton.setSize(150, 50);
		ClothButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});

		JButton StoreButton = new JButton("ªÛ¡°");
		StoreButton.setLocation(400, 30);
		StoreButton.setSize(150, 50);

		JButton coinButton = new JButton(function.coinDisplay()+" ∞≥ ");
		coinButton.setLocation(750, 30);
		coinButton.setSize(150, 50);

		JButton nickName = new JButton(function.nameDisplay());
		nickName.setLocation(149, 520);
		nickName.setSize(150, 50);
		
		ClothStoreM clotharr[] = new ClothStoreM[5];
		clotharr[0] = new ClothStoreM("ø 1", 1);
		clotharr[1] = new ClothStoreM("ø 2", 2);
		clotharr[2] = new ClothStoreM("ø 3", 3);
		clotharr[3] = new ClothStoreM("ø 4", 4);
		clotharr[4] = new ClothStoreM("ø 5", 5);

		ImageIcon images[] = new ImageIcon[5];
		images[0] = new ImageIcon("image\\ø 1.png");
		images[1] = new ImageIcon("image\\ø 2.png");
		images[2] = new ImageIcon("image\\ø 3.png");
		images[3] = new ImageIcon("image\\ø 4.png");
		images[4] = new ImageIcon("image\\ø 5.jpg");

		JLabel clothLabel = new JLabel("ø  ¿Ã∏ß : "+clotharr[0].getList()+"   ƒ⁄¿Œ : "+clotharr[0].getPay()+"∞≥");
		clothLabel.setLocation(640, 350);
		clothLabel.setSize(300, 300);


		JButton clothImages = new JButton();
		clothImages.setIcon(images[0]);
		clothImages.setLocation(500, 130);
		clothImages.setSize(400, 350);

		JButton before = new JButton("¿Ã¿¸");
		before.setLocation(500, 510);
		before.setSize(150, 30);

		JButton next = new JButton("¥Ÿ¿Ω");
		next.setLocation(750, 510);
		next.setSize(150, 30);

		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				if (i == 4){
					i-=4;
				}else{
					i+=1;
				}
				System.out.println("¥Ÿ¿Ω : "+i);
				clothLabel.setText("ø  ¿Ã∏ß : "+clotharr[i].getList()+"   ƒ⁄¿Œ : "+clotharr[i].getPay()+"∞≥");
				clothImages.setIcon(images[i]);
				next.requestFocus();
			}

		});
		before.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (i == 0){
					i+=4;

				}else{
					i-=1;
				}

				clothLabel.setText("ø  ¿Ã∏ß : "+clotharr[i].getList()+"   ƒ⁄¿Œ : "+clotharr[i].getPay()+"∞≥");
				clothImages.setIcon(images[i]);
				before.requestFocus();

			}
		});


		JButton shop = new JButton("»Æ ¿Œ");
		shop.setLocation(500, 540);
		shop.setSize(400, 30);

		shop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				function.subCoin(clotharr[i].getPay());
				coinButton.setText(function.coinDisplay()+" ∞≥");

			}
		});

		jframe.getContentPane().add(nickName);
		jframe.getContentPane().add(genderlabel);
		jframe.getContentPane().add(ClothButton);
		jframe.getContentPane().add(StoreButton);
		jframe.getContentPane().add(coinButton);
		jframe.getContentPane().add(clothLabel);
		jframe.getContentPane().add(clothImages);
		jframe.getContentPane().add(before);
		jframe.getContentPane().add(next);
		jframe.getContentPane().add(shop);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

}
