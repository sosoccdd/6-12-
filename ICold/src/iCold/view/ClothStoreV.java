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

		ImageIcon gender = new ImageIcon("image\\����.png");
		JLabel genderlabel = new JLabel(gender);
		genderlabel.setLocation(50, 100);
		genderlabel.setSize(500, 500);

		JButton ClothButton = new JButton("�� ��");
		ClothButton.setLocation(30, 30);
		ClothButton.setSize(150, 50);
		ClothButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});

		JButton StoreButton = new JButton("����");
		StoreButton.setLocation(400, 30);
		StoreButton.setSize(150, 50);

		JButton coinButton = new JButton(Store.getCoin()+" �� ");
		coinButton.setLocation(750, 30);
		coinButton.setSize(150, 50);

		ClothStoreM clotharr[] = new ClothStoreM[5];
		clotharr[0] = new ClothStoreM("��1", 1);
		clotharr[1] = new ClothStoreM("��2", 2);
		clotharr[2] = new ClothStoreM("��3", 3);
		clotharr[3] = new ClothStoreM("��4", 4);
		clotharr[4] = new ClothStoreM("��5", 5);

		ImageIcon images[] = new ImageIcon[5];
		images[0] = new ImageIcon("image\\��1.png");
		images[1] = new ImageIcon("image\\��2.png");
		images[2] = new ImageIcon("image\\��3.png");
		images[3] = new ImageIcon("image\\��4.png");
		images[4] = new ImageIcon("image\\��5.png");

		JLabel clothLabel = new JLabel("�� �̸� : "+clotharr[0].getList()+"   ���� : "+clotharr[0].getPay()+"��");
		clothLabel.setLocation(640, 350);
		clothLabel.setSize(300, 300);


		JButton clothImages = new JButton();
		clothImages.setIcon(images[0]);
		clothImages.setLocation(500, 130);
		clothImages.setSize(400, 350);

		JButton before = new JButton("����");
		before.setLocation(500, 510);
		before.setSize(150, 30);

		JButton next = new JButton("����");
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
				System.out.println("���� : "+i);
				clothLabel.setText("�� �̸� : "+clotharr[i].getList()+"   ���� : "+clotharr[i].getPay()+"��");
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

				clothLabel.setText("�� �̸� : "+clotharr[i].getList()+"   ���� : "+clotharr[i].getPay()+"��");
				clothImages.setIcon(images[i]);
				before.requestFocus();

			}
		});


		JButton shop = new JButton("Ȯ ��");
		shop.setLocation(500, 540);
		shop.setSize(400, 30);

		shop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Store.coin(clotharr[i].getPay());
				coinButton.setText(Store.getCoin()+" ��");

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
