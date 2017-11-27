package iCold.view;

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
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;

import iCold.model.dao.IColdFunction;




public class BungeoppangV extends JFrame{
	IColdFunction function = new IColdFunction();
	JFrame jframe=new JFrame("∫ÿæÓªß ≈∏¿ÃƒÔ");
	ImageIcon p1;
	ImageIcon p2;
	ImageIcon p3;
	ImageIcon p4;
	ImageIcon p5;
	ImageIcon p6;
	Timer[] time1;
	Timer[] time2;
	Timer[] time3;	
	Timer[] time4;
	Timer end; 
	int set_time = 1000;
	JButton bnt[];
	int coin;
	JLabel lblNewLabel;
	public BungeoppangV(){

		time1= new Timer[10];
		time2= new Timer[10];
		time3= new Timer[10];
		time4= new Timer[10];
		end = new Timer();
		
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		p1 = new ImageIcon("image\\∫Û∆«.png");
		p2 = new ImageIcon("image\\π›¡◊2.png");
		p3 = new ImageIcon("image\\¿Õ¿Ω2.png");
		p4 = new ImageIcon("image\\¿Õ¿Ω1.png");
		p5 = new ImageIcon("image\\øœº∫.png");
		p6 = new ImageIcon("image\\≈Ω1.png");
		time1[9] = new Timer();
		time2[9] = new Timer();
		time3[9] = new Timer();
		time4[9] = new Timer();
		
		bnt = new JButton[9];
		for (int i = 0; i < 9; i++) {
			bnt[i] = new JButton(p1);
			bnt[i].setSize(181, 131);
		}

		bnt[0].setLocation(83, 147);
		bnt[1].setLocation(262, 147);
		bnt[2].setLocation(440, 147);
		bnt[3].setLocation(83, 275);
		bnt[4].setLocation(262, 275);
		bnt[5].setLocation(440, 275);
		bnt[6].setLocation(83, 405);
		bnt[7].setLocation(262, 405);		
		bnt[8].setLocation(440, 405);


		bnt[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[0].getIcon() == p1)
				{
					bnt[0].setIcon(p2);
					time1[0] = new Timer();
					time2[0] = new Timer();
					time3[0] = new Timer();
					time4[0] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[0].getIcon()==p2){
								bnt[0].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[0].getIcon()==p3){
								bnt[0].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[0].getIcon()==p4){
								bnt[0].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[0].getIcon()==p5){
								bnt[0].setIcon(p6);
							}

						}
					};
					time1[0].schedule(bnt1_time1, set_time);
					time2[0].schedule(bnt1_time2, set_time*2);
					time3[0].schedule(bnt1_time3, set_time*4);
					time4[0].schedule(bnt1_time4, set_time*6);


				}else if(bnt[0].getIcon() == p2||bnt[0].getIcon() == p3||bnt[0].getIcon() == p4||bnt[0].getIcon() == p6){
					
					bnt[0].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[0].getIcon() == p5){
					bnt[0].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[1].getIcon() == p1)
				{
					bnt[1].setIcon(p2);
					time1[1] = new Timer();
					time2[1] = new Timer();
					time3[1] = new Timer();
					time4[1] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[1].getIcon()==p2){
								bnt[1].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[1].getIcon()==p3){
								bnt[1].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[1].getIcon()==p4){
								bnt[1].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[1].getIcon()==p5){
								bnt[1].setIcon(p6);
							}

						}
					};
					time1[1].schedule(bnt1_time1, set_time);
					time2[1].schedule(bnt1_time2, set_time*2);
					time3[1].schedule(bnt1_time3, set_time*4);
					time4[1].schedule(bnt1_time4, set_time*6);


				}else if(bnt[1].getIcon() == p2||bnt[1].getIcon() == p3||bnt[1].getIcon() == p4||bnt[1].getIcon() == p6){
					
					bnt[1].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[1].getIcon() == p5){
					bnt[1].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[2].getIcon() == p1)
				{
					bnt[2].setIcon(p2);
					time1[2] = new Timer();
					time2[2] = new Timer();
					time3[2] = new Timer();
					time4[2] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[2].getIcon()==p2){
								bnt[2].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[2].getIcon()==p3){
								bnt[2].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[2].getIcon()==p4){
								bnt[2].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[2].getIcon()==p5){
								bnt[2].setIcon(p6);
							}

						}
					};
					time1[2].schedule(bnt1_time1, set_time);
					time2[2].schedule(bnt1_time2, set_time*2);
					time3[2].schedule(bnt1_time3, set_time*4);
					time4[2].schedule(bnt1_time4, set_time*6);


				}else if(bnt[2].getIcon() == p2||bnt[2].getIcon() == p3||bnt[2].getIcon() == p4||bnt[2].getIcon() == p6){
					
					bnt[2].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[2].getIcon() == p5){
					bnt[2].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[3].getIcon() == p1)
				{
					bnt[3].setIcon(p2);
					time1[3] = new Timer();
					time2[3] = new Timer();
					time3[3] = new Timer();
					time4[3] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[3].getIcon()==p2){
								bnt[3].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[3].getIcon()==p3){
								bnt[3].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[3].getIcon()==p4){
								bnt[3].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[3].getIcon()==p5){
								bnt[3].setIcon(p6);
							}

						}
					};
					time1[3].schedule(bnt1_time1, set_time);
					time2[3].schedule(bnt1_time2, set_time*2);
					time3[3].schedule(bnt1_time3, set_time*4);
					time4[3].schedule(bnt1_time4, set_time*6);


				}else if(bnt[3].getIcon() == p2||bnt[3].getIcon() == p3||bnt[3].getIcon() == p4||bnt[3].getIcon() == p6){
					
					bnt[3].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[3].getIcon() == p5){
					bnt[3].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[4].getIcon() == p1)
				{
					bnt[4].setIcon(p2);
					time1[4] = new Timer();
					time2[4] = new Timer();
					time3[4] = new Timer();
					time4[4] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[4].getIcon()==p2){
								bnt[4].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[4].getIcon()==p3){
								bnt[4].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[4].getIcon()==p4){
								bnt[4].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[4].getIcon()==p5){
								bnt[4].setIcon(p6);
							}

						}
					};
					time1[4].schedule(bnt1_time1, set_time);
					time2[4].schedule(bnt1_time2, set_time*2);
					time3[4].schedule(bnt1_time3, set_time*4);
					time4[4].schedule(bnt1_time4, set_time*6);


				}else if(bnt[4].getIcon() == p2||bnt[4].getIcon() == p3||bnt[4].getIcon() == p4||bnt[4].getIcon() == p6){
					
					bnt[4].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[4].getIcon() == p5){
					bnt[4].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[5].getIcon() == p1)
				{
					bnt[5].setIcon(p2);
					time1[5] = new Timer();
					time2[5] = new Timer();
					time3[5] = new Timer();
					time4[5] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[5].getIcon()==p2){
								bnt[5].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[5].getIcon()==p3){
								bnt[5].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[5].getIcon()==p4){
								bnt[5].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[5].getIcon()==p5){
								bnt[5].setIcon(p6);
							}

						}
					};
					time1[5].schedule(bnt1_time1, set_time);
					time2[5].schedule(bnt1_time2, set_time*2);
					time3[5].schedule(bnt1_time3, set_time*4);
					time4[5].schedule(bnt1_time4, set_time*6);


				}else if(bnt[5].getIcon() == p2||bnt[5].getIcon() == p3||bnt[5].getIcon() == p4||bnt[5].getIcon() == p6){
					
					bnt[5].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}else if(bnt[5].getIcon() == p5){
					bnt[5].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[6].getIcon() == p1)
				{
					bnt[6].setIcon(p2);
					time1[6] = new Timer();
					time2[6] = new Timer();
					time3[6] = new Timer();
					time4[6] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[6].getIcon()==p2){
								bnt[6].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[6].getIcon()==p3){
								bnt[6].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[6].getIcon()==p4){
								bnt[6].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[6].getIcon()==p5){
								bnt[6].setIcon(p6);
							}

						}
					};
					time1[6].schedule(bnt1_time1, set_time);
					time2[6].schedule(bnt1_time2, set_time*2);
					time3[6].schedule(bnt1_time3, set_time*4);
					time4[6].schedule(bnt1_time4, set_time*6);


				}else if(bnt[6].getIcon() == p2||bnt[6].getIcon() == p3||bnt[6].getIcon() == p4||bnt[6].getIcon() == p6){
					
					bnt[6].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[6].getIcon() == p5){
					bnt[6].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[7].getIcon() == p1)
				{
					bnt[7].setIcon(p2);
					time1[7] = new Timer();
					time2[7] = new Timer();
					time3[7] = new Timer();
					time4[7] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[7].getIcon()==p2){
								bnt[7].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[7].getIcon()==p3){
								bnt[7].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[7].getIcon()==p4){
								bnt[7].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[7].getIcon()==p5){
								bnt[7].setIcon(p6);
							}

						}
					};
					time1[7].schedule(bnt1_time1, set_time);
					time2[7].schedule(bnt1_time2, set_time*2);
					time3[7].schedule(bnt1_time3, set_time*4);
					time4[7].schedule(bnt1_time4, set_time*6);


				}else if(bnt[7].getIcon() == p2||bnt[7].getIcon() == p3||bnt[7].getIcon() == p4||bnt[7].getIcon() == p6){
					
					bnt[7].setIcon(p1);
					coin--;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[7].getIcon() == p5){
					bnt[7].setIcon(p1);
					coin++;
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		bnt[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bnt[8].getIcon() == p1)
				{
					bnt[8].setIcon(p2);
					time1[8] = new Timer();
					time2[8] = new Timer();
					time3[8] = new Timer();
					time4[8] = new Timer();
					TimerTask bnt1_time1 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[8].getIcon()==p2){
								bnt[8].setIcon(p3);
							}
						}
					};
					TimerTask bnt1_time2 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[8].getIcon()==p3){
								bnt[8].setIcon(p4);
							}

						}
					};
					TimerTask bnt1_time3 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[8].getIcon()==p4){
								bnt[8].setIcon(p5);
							}

						}
					};
					TimerTask bnt1_time4 = new TimerTask() {

						@Override
						public void run() {
							if(bnt[8].getIcon()==p5){
								bnt[8].setIcon(p6);
							}

						}
					};
					time1[8].schedule(bnt1_time1, set_time);
					time2[8].schedule(bnt1_time2, set_time*2);
					time3[8].schedule(bnt1_time3, set_time*4);
					time4[8].schedule(bnt1_time4, set_time*6);


				}else if(bnt[8].getIcon() == p2||bnt[8].getIcon() == p3||bnt[8].getIcon() == p4||bnt[8].getIcon() == p6){
					
					bnt[8].setIcon(p1);
					coin--;
					setCoin(coin);
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
					
				}else if(bnt[8].getIcon() == p5){
					bnt[8].setIcon(p1);
					coin++;
					setCoin(coin);
					lblNewLabel.setText("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
				}

			}
		});
		


		lblNewLabel = new JLabel("»πµÊƒ⁄¿Œ : "+coin+" ∞≥ ");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 20));
		lblNewLabel.setBounds(675, 283, 260, 123);

		for (int i = 0; i < bnt.length; i++) {
			jframe.add(bnt[i]);
		}	
		jframe.add(lblNewLabel);
		
		TimerTask time1 = new TimerTask() {

			@Override
			public void run() {
				jframe.setVisible(false);
				frame();
			}
		};
		end.schedule(time1, set_time*10);
		

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




	}
	public void frame(){
		JFrame jframe2 = new JFrame("∫ÿæÓªß ≈∏¿ÃƒÔ ∞·∞˙");
		jframe2.setBounds(1000, 1000, 1000, 700);
		jframe2.setLayout(null);
		Dimension frameSize = jframe2.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe2.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		
		JLabel TitleLabel = new JLabel("∫ÿæÓªß ≈∏¿ÃƒÔ ∞‘¿” ∞·∞˙");
		TitleLabel.setFont(new Font("±º∏≤", Font.BOLD, 50));
		TitleLabel.setLocation(158, 104);
		TitleLabel.setSize(618, 100);
		
		JLabel coinLabel = new JLabel("»πµÊƒ⁄¿Œ : "+getCoin()+" ∞≥");
		coinLabel.setFont(new Font("±º∏≤", Font.BOLD, 40));
		coinLabel.setLocation(299, 236);
		coinLabel.setSize(338, 92);
		function.addCoin(coin);
		JLabel sumLabel = new JLabel("«’∞Ë : "+function.coinDisplay()+" ∞≥");
		sumLabel.setFont(new Font("±º∏≤", Font.BOLD, 40));
		sumLabel.setLocation(299, 379);
		sumLabel.setSize(338, 116);
		
		JButton Worknet = new JButton("∞ÌøÎ≥Îµø∫Œ");
		Worknet.setFont(new Font("±º∏≤", Font.BOLD, 40));
		Worknet.setLocation(299, 505);
		Worknet.setSize(315, 92);
		Worknet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jframe2.setVisible(false);
				new WorkNetV();
				
			}
		});
		jframe2.getContentPane().add(TitleLabel);
		jframe2.getContentPane().add(coinLabel);
		jframe2.getContentPane().add(sumLabel);
		jframe2.getContentPane().add(Worknet);
		jframe2.setVisible(true);
		jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public int getCoin() {
		return coin;
	}
}
