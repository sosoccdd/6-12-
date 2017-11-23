package iCold.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import iCold.model.vo.ClothStoreM;


public class ClothStoreV extends JFrame{
	ClothStoreM Store = new ClothStoreM();
	private int i = 0;
	public ClothStoreV() {
		Store.openfile();
		JFrame jframe = new JFrame("ClothStore");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.setLayout(null);

		ImageIcon gender = new ImageIcon("image\\ø©¿⁄.png");
		JLabel genderlabel = new JLabel(gender);
		genderlabel.setLocation(50, 100);
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

		JButton coinButton = new JButton(Store.getCoin()+" ∞≥ ");
		coinButton.setLocation(750, 30);
		coinButton.setSize(150, 50);

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
		images[4] = new ImageIcon("image\\ø 5.png");

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
				Store.coin(clotharr[i].getPay());
				coinButton.setText(Store.getCoin()+" ∞≥");

			}
		});

		jframe.add(genderlabel);
		jframe.add(ClothButton);
		jframe.add(StoreButton);
		jframe.add(coinButton);
		jframe.add(clothLabel);
		jframe.add(clothImages);
		jframe.add(before);
		jframe.add(next);
		jframe.add(shop);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

}
