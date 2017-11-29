package iCold.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import iCold.model.dao.IColdFunction;




public class BungeoppangV extends JFrame{
	IColdFunction function = new IColdFunction();
	JFrame jframe=new JFrame("ºØ¾î»§ Å¸ÀÌÄï");
	ImageIcon p1;
	ImageIcon p2;
	ImageIcon p3;
	ImageIcon p4;
	ImageIcon p5;
	ImageIcon p6;
	ImageIcon timebar1;
	ImageIcon timebar2;
	ImageIcon timebar3;
	ImageIcon timebar4;
	ImageIcon timebar5;
	ImageIcon timebar6;
	ImageIcon timebar7;
	ImageIcon timebar8;
	ImageIcon timebar9;
	ImageIcon timebar10;
	Timer[] time1;
	Timer[] time2;
	Timer[] time3;	
	Timer[] time4;
	Timer[] time;
	Timer end; 
	JLabel jj;
	int set_time = 1000;
	JButton bnt[];
	int m;
	int count;
	int coin;
	JLabel lblNewLabel;
	public BungeoppangV(){

		time1= new Timer[10];
		time2= new Timer[10];
		time3= new Timer[10];
		time4= new Timer[10];
		time = new Timer[10];
		end = new Timer();

		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		jframe.getContentPane().setBackground(Color.getHSBColor(55, 33, 55));
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		p1 = new ImageIcon("image\\ºóÆÇ.png");
		p2 = new ImageIcon("image\\¹ÝÁ×2.png");
		p3 = new ImageIcon("image\\ÀÍÀ½2.png");
		p4 = new ImageIcon("image\\ÀÍÀ½1.png");
		p5 = new ImageIcon("image\\¿Ï¼º.png");
		p6 = new ImageIcon("image\\Å½1.png");
		time1[9] = new Timer();
		time2[9] = new Timer();
		time3[9] = new Timer();
		time4[9] = new Timer();
		time[9] = new Timer();

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
					time2[0].schedule(bnt1_time2, set_time*3);
					time3[0].schedule(bnt1_time3, set_time*5);
					time4[0].schedule(bnt1_time4, set_time*7);


				}else if(bnt[0].getIcon() == p2||bnt[0].getIcon() == p3||bnt[0].getIcon() == p4||bnt[0].getIcon() == p6){

					bnt[0].setIcon(p1);

				}else if(bnt[0].getIcon() == p5){
					bnt[0].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[1].schedule(bnt1_time2, set_time*3);
					time3[1].schedule(bnt1_time3, set_time*5);
					time4[1].schedule(bnt1_time4, set_time*7);


				}else if(bnt[1].getIcon() == p2||bnt[1].getIcon() == p3||bnt[1].getIcon() == p4||bnt[1].getIcon() == p6){

					bnt[1].setIcon(p1);

				}else if(bnt[1].getIcon() == p5){
					bnt[1].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[2].schedule(bnt1_time2, set_time*3);
					time3[2].schedule(bnt1_time3, set_time*5);
					time4[2].schedule(bnt1_time4, set_time*7);


				}else if(bnt[2].getIcon() == p2||bnt[2].getIcon() == p3||bnt[2].getIcon() == p4||bnt[2].getIcon() == p6){

					bnt[2].setIcon(p1);

				}else if(bnt[2].getIcon() == p5){
					bnt[2].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[3].schedule(bnt1_time2, set_time*3);
					time3[3].schedule(bnt1_time3, set_time*5);
					time4[3].schedule(bnt1_time4, set_time*7);


				}else if(bnt[3].getIcon() == p2||bnt[3].getIcon() == p3||bnt[3].getIcon() == p4||bnt[3].getIcon() == p6){

					bnt[3].setIcon(p1);

				}else if(bnt[3].getIcon() == p5){
					bnt[3].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[4].schedule(bnt1_time2, set_time*3);
					time3[4].schedule(bnt1_time3, set_time*5);
					time4[4].schedule(bnt1_time4, set_time*7);


				}else if(bnt[4].getIcon() == p2||bnt[4].getIcon() == p3||bnt[4].getIcon() == p4||bnt[4].getIcon() == p6){

					bnt[4].setIcon(p1);

				}else if(bnt[4].getIcon() == p5){
					bnt[4].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[5].schedule(bnt1_time2, set_time*3);
					time3[5].schedule(bnt1_time3, set_time*5);
					time4[5].schedule(bnt1_time4, set_time*7);


				}else if(bnt[5].getIcon() == p2||bnt[5].getIcon() == p3||bnt[5].getIcon() == p4||bnt[5].getIcon() == p6){

					bnt[5].setIcon(p1);

				}else if(bnt[5].getIcon() == p5){
					bnt[5].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[6].schedule(bnt1_time2, set_time*3);
					time3[6].schedule(bnt1_time3, set_time*5);
					time4[6].schedule(bnt1_time4, set_time*7);


				}else if(bnt[6].getIcon() == p2||bnt[6].getIcon() == p3||bnt[6].getIcon() == p4||bnt[6].getIcon() == p6){

					bnt[6].setIcon(p1);


				}else if(bnt[6].getIcon() == p5){
					bnt[6].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[7].schedule(bnt1_time2, set_time*3);
					time3[7].schedule(bnt1_time3, set_time*5);
					time4[7].schedule(bnt1_time4, set_time*7);


				}else if(bnt[7].getIcon() == p2||bnt[7].getIcon() == p3||bnt[7].getIcon() == p4||bnt[7].getIcon() == p6){

					bnt[7].setIcon(p1);

				}else if(bnt[7].getIcon() == p5){
					bnt[7].setIcon(p1);
					coin++;
					lblNewLabel.setText(coin+" °³ ");
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
					time2[8].schedule(bnt1_time2, set_time*3);
					time3[8].schedule(bnt1_time3, set_time*5);
					time4[8].schedule(bnt1_time4, set_time*7);


				}else if(bnt[8].getIcon() == p2||bnt[8].getIcon() == p3||bnt[8].getIcon() == p4||bnt[8].getIcon() == p6){

					bnt[8].setIcon(p1);
					setCoin(coin);

				}else if(bnt[8].getIcon() == p5){
					bnt[8].setIcon(p1);
					coin++;
					setCoin(coin);
					lblNewLabel.setText(coin+" °³ ");
				}

			}
		});

		JLabel coinLabel = new JLabel("È¹µæÄÚÀÎ : " + count + "  °³");
		coinLabel.setFont(new Font("±¼¸²", Font.BOLD, 40));
		coinLabel.setLocation(119, 69);
		coinLabel.setSize(327, 75);


		ImageIcon pipi = new ImageIcon("image\\aa.png");
		JLabel pipiLable = new JLabel();
		pipiLable.setIcon(pipi);
		JPanel pipiP = new JPanel();
		pipiP.add(pipiLable);
		pipiP.setLocation(639, 39);
		pipiP.setSize(294, 435);
		pipiP.setBackground(Color.getHSBColor(55, 33, 55));
		m = (int)(Math.random()*9+1);
		jj = new JLabel("<html>ºØ¾î»§<br>&nbsp;"+m+"°³<br> ÁÖ¼¼¿ä.<br></html>");
		jj.setFont(new Font("±¼¸²", Font.BOLD, 20));
		jj.setLocation(685, 39);
		jj.setSize(200, 147);
		pipiP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(coin >= m ){
					coin-=m;
					count+=1;
					lblNewLabel.setText(coin+" °³ ");
					m = (int)(Math.random()*9+1);
					coinLabel.setText("È¹µæÄÚÀÎ : " + count + "  °³");
					jj.setText("<html>ºØ¾î»§<br>&nbsp;"+m+"°³<br> ÁÖ¼¼¿ä.<br></html>");

				}


			}

		});
		jframe.getContentPane().add(jj);
		jframe.getContentPane().add(pipiP);

		for (int i = 0; i < 9; i++) {
			time[i] = new Timer();
		}

		timebar1 = new ImageIcon("image\\¹Ù10.png");
		timebar2 = new ImageIcon("image\\¹Ù9.png");
		timebar3 = new ImageIcon("image\\¹Ù8.png");
		timebar4 = new ImageIcon("image\\¹Ù7.png");
		timebar5 = new ImageIcon("image\\¹Ù6.png");
		timebar6 = new ImageIcon("image\\¹Ù5.png");
		timebar7 = new ImageIcon("image\\¹Ù4.png");
		timebar8 = new ImageIcon("image\\¹Ù3.png");
		timebar9 = new ImageIcon("image\\¹Ù2.png");
		timebar10 = new ImageIcon("image\\¹Ù1.png");
		JLabel times = new JLabel();
		times.setIcon(timebar1);
		times.setLocation(29, 10);
		times.setSize(562, 65);
		TimerTask timemm1 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar2);

			}
		};
		TimerTask timemm2 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar3);

			}
		};
		TimerTask timemm3 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar4);

			}
		};
		TimerTask timemm4 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar5);

			}
		};
		TimerTask timemm5 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar6);

			}
		};
		TimerTask timemm6 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar7);

			}
		};
		TimerTask timemm7 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar8);

			}
		};
		TimerTask timemm8 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar9);

			}
		};
		TimerTask timemm9 = new TimerTask() {

			@Override
			public void run() {

				times.setIcon(timebar10);

			}
		};

		time[0].schedule(timemm1, set_time*5);
		time[1].schedule(timemm2, set_time*10);
		time[2].schedule(timemm3, set_time*15);
		time[3].schedule(timemm4, set_time*20);
		time[4].schedule(timemm5, set_time*25);
		time[5].schedule(timemm6, set_time*30);
		time[6].schedule(timemm7, set_time*35);
		time[7].schedule(timemm8, set_time*40);
		time[8].schedule(timemm9, set_time*50);


		jframe.getContentPane().add(times);

		jframe.getContentPane().add(coinLabel);

		ImageIcon bung = new ImageIcon("image\\bung.png");
		lblNewLabel = new JLabel(coin+" °³ ");
		lblNewLabel.setIcon(bung);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 40));
		lblNewLabel.setBounds(661, 474, 260, 123);

		for (int i = 0; i < bnt.length; i++) {
			jframe.getContentPane().add(bnt[i]);
		}	
		jframe.getContentPane().add(lblNewLabel);

		TimerTask time1 = new TimerTask() {

			@Override
			public void run() {
				jframe.setVisible(false);
				frame();
			}
		};
		end.schedule(time1, set_time*50);





		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




	}
	public void frame(){
		JFrame jframe2 = new JFrame("ºØ¾î»§ Å¸ÀÌÄï °á°ú");
		jframe2.setBounds(1000, 1000, 1000, 700);
		jframe2.getContentPane().setLayout(null);
		Dimension frameSize = jframe2.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe2.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);


		JLabel TitleLabel = new JLabel("ºØ¾î»§ Å¸ÀÌÄï °ÔÀÓ °á°ú");
		TitleLabel.setFont(new Font("±¼¸²", Font.BOLD, 50));
		TitleLabel.setLocation(158, 104);
		TitleLabel.setSize(618, 100);

		JLabel coinLabel = new JLabel("È¹µæÄÚÀÎ : "+getCount()+" °³");
		coinLabel.setFont(new Font("±¼¸²", Font.BOLD, 40));
		coinLabel.setLocation(299, 236);
		coinLabel.setSize(338, 92);
		function.addCoin(count);
		JLabel sumLabel = new JLabel("ÇÕ°è : "+function.coinDisplay()+" °³");
		sumLabel.setFont(new Font("±¼¸²", Font.BOLD, 40));
		sumLabel.setLocation(299, 379);
		sumLabel.setSize(338, 116);

		JButton Worknet = new JButton("°í¿ë³ëµ¿ºÎ");
		Worknet.setFont(new Font("±¼¸²", Font.BOLD, 40));
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
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
}
