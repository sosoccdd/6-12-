package iCold.view;

<<<<<<< HEAD
import java.awt.Font;
=======
import java.awt.Dimension;
import java.awt.Toolkit;
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WorkNetV {
	public WorkNetV(){
		JFrame jframe = new JFrame("WorkNet");
		jframe.setBounds(1000, 1000, 1000, 700);
<<<<<<< HEAD
		jframe.getContentPane().setLayout(null);
		
		JButton workButton = new JButton("���뵿��");
		workButton.setFont(new Font("����", Font.BOLD, 20));
		workButton.setLocation(393, 12);
		workButton.setSize(150, 50);
		
=======
		jframe.setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-/
		ImageIcon hambergerImage = new ImageIcon("image\\Hamberger.png");
		JButton HambergerButton = new JButton(hambergerImage);
		HambergerButton.setLocation(43, 471);
		HambergerButton.setSize(203, 147);
		HambergerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new HambergerV();

			}
			
		});
		ImageIcon CrushCarImage = new ImageIcon("image\\CrushCar.png");
		JButton CrushCarButton = new JButton(CrushCarImage);
		CrushCarButton.setLocation(736, 471);
		CrushCarButton.setSize(203, 147);
		CrushCarButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new CrushCarV();

			}
			
		});
		ImageIcon GasOilImage = new ImageIcon("image\\GasOil.png");
		JButton GasOilButton = new JButton(GasOilImage);
		GasOilButton.setLocation(505, 471);
		GasOilButton.setSize(203, 147);
		GasOilButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new GasOilV();

			}
			
		});
		ImageIcon FoodFighterImage = new ImageIcon("image\\FoodFighter.png");
		JButton FoodFighterButton = new JButton(FoodFighterImage);
		FoodFighterButton.setLocation(274, 471);
		FoodFighterButton.setSize(203, 147);
		FoodFighterButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new FoodFighterV();

			}
			
		});

		jframe.getContentPane().add(workButton);
		jframe.getContentPane().add(FoodFighterButton);
		jframe.getContentPane().add(GasOilButton);
		jframe.getContentPane().add(CrushCarButton);
		jframe.getContentPane().add(HambergerButton);
				
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}

	
	
	
	
	
	
	

}
