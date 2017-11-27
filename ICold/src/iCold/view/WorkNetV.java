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
	GasOilV gasm = new GasOilV();
	public WorkNetV(){
		JFrame jframe = new JFrame("WorkNet");
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		if(gasm.jr.isVisible()){
			gasm.stopOilM();
		}
		
		

		JButton ClothButton = new JButton("옷 장");
		ClothButton.setFont(new Font("굴림", Font.BOLD, 20));
		ClothButton.setLocation(43, 12);
		ClothButton.setSize(150, 50);
		ClothButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe.setVisible(false);
				new ClothRoomV();
			}
		});

		JButton workButton = new JButton("고용노동부");
		workButton.setFont(new Font("굴림", Font.BOLD, 20));
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
				
<<<<<<< HEAD
				try {
					for(int i = 0; i<=100; i++){
						System.out.println(i);
						Thread.sleep(100);
						if(i==100){
							JFrame sf = new JFrame();
							sf.setTitle("시간 종료");
							sf.setBounds(300, 300, 500, 500);
							sf.getContentPane().setLayout(null);

							int sum = 0;

							JLabel slabel = new JLabel("획득 : " + "2222" + " 원");
							slabel.setSize(100, 100);
							slabel.setLocation(100, 50);
							JLabel dlabel = new JLabel("합계 : " + sum + " 원");
							dlabel.setSize(100, 100);
							dlabel.setLocation(100, 150);      
							JButton fbutton = new JButton("돌아가기");
							fbutton.setSize(70, 70);
							fbutton.setLocation(100, 350);

							sf.getContentPane().add(slabel);
							sf.getContentPane().add(dlabel);
							sf.getContentPane().add(fbutton);

							fbutton.addActionListener(new ActionListener() {         
								@Override
								public void actionPerformed(ActionEvent e) {
									// txt파일에 저장
									//gasm.stopOilM();
									sf.setVisible(false);
									new WorkNetV();

								}
							});

							sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							sf.setVisible(true);
						}
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}


				if(!t2.isAlive()){
					gasm.stopOilM();
				}
=======
				
				jframe.setVisible(false);
				System.out.println("123124rqwdasfasdfjnsjdgndsjgn");
				GasOilV.GasOilM2 gasv = gasm.new GasOilM2();
				Thread t1 = new Thread(gasv);
				
				t1.start();
				
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-/
				
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
