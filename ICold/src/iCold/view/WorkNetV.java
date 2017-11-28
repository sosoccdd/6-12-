package iCold.view;


import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import iCold.model.vo.GasOilM;
import iCold.model.vo.GasOilStart;
import iCold.view.*;

public class WorkNetV {
	//GasOilV gasm = new GasOilV();
	public WorkNetV(){
		JFrame jframe = new JFrame("WorkNet");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
			

		JButton ClothButton = new JButton("¿Ê Àå");
		ClothButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		ClothButton.setLocation(43, 12);
		ClothButton.setSize(150, 50);
		ClothButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});

		JButton workButton = new JButton("°í¿ë³ëµ¿ºÎ");
		workButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		workButton.setLocation(393, 12);
		workButton.setSize(150, 50);


		ImageIcon hambergerImage = new ImageIcon("image\\Hamberger.png");
		JButton HambergerButton = new JButton(hambergerImage);
		HambergerButton.setLocation(12, 492);
		HambergerButton.setSize(181, 126);
		HambergerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new HambergerV();

			}

		});
		ImageIcon CrushCarImage = new ImageIcon("image\\CrushCar.png");
		JButton CrushCarButton = new JButton(CrushCarImage);
		CrushCarButton.setLocation(594, 492);
		CrushCarButton.setSize(181, 126);
		CrushCarButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new CrushCarV();

			}

		});
		ImageIcon GasOilImage = new ImageIcon("image\\GasOil.png");
		JButton GasOilButton = new JButton(GasOilImage);
		GasOilButton.setLocation(398, 492);
		GasOilButton.setSize(181, 126);
		GasOilButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				jframe.setVisible(false);
				GasOilV.GasOilM2 gasv = new GasOilV.GasOilM2();
				Thread t1 = new Thread(gasv);
				t1.start();
				GasOilV.jr.setVisible(false);
				
				
			}
				
		});
		
		
		
		ImageIcon FoodFighterImage = new ImageIcon("image\\FoodFighter.png");
		JButton FoodFighterButton = new JButton(FoodFighterImage);
		FoodFighterButton.setLocation(205, 492);
		FoodFighterButton.setSize(181, 126);
		FoodFighterButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new FoodFighterV();

			}

		});
		ImageIcon Bungeoppang = new ImageIcon("image\\Bungeoppang.png");
		JButton BungeoppangButton = new JButton(Bungeoppang);
		BungeoppangButton.setLocation(787, 492);
		BungeoppangButton.setSize(185, 126);
		BungeoppangButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new BungeoppangV();

			}

		});
		



		jframe.getContentPane().add(ClothButton);
		jframe.getContentPane().add(workButton);
		jframe.getContentPane().add(FoodFighterButton);
		jframe.getContentPane().add(GasOilButton);
		jframe.getContentPane().add(CrushCarButton);
		jframe.getContentPane().add(HambergerButton);
		jframe.getContentPane().add(BungeoppangButton);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

	}









}
