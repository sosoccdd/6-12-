package iCold.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.LabelUI;

public class GasOilV extends JFrame implements Runnable{
	int count = 0;
	int coincount = 0;
	JFrame jr = new JFrame("주유소 게임");

	public GasOilV(){}

	//GasOil 스레드
	@Override
	public void run() {
		this.gasOilPlay();
		
		
	}
	
	public void stopOilM(){
		jr.setVisible(false);
	}
	
	
	public int getCoincount(){
		return coincount;
	}
	
	
	public void gasOilPlay(){
		
		jr.setBounds(1000, 1000, 1000, 700);
		jr.setLayout(null);
		Dimension frameSize = jr.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jr.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		ImageIcon oilimage = new ImageIcon("image\\oil.png");
		//ImageIcon back = new ImageIcon("images\\back.jpg");
		ImageIcon al = new ImageIcon("image\\default.png");
		ImageIcon son1 = new ImageIcon("image\\son1.png");
		ImageIcon son2 = new ImageIcon("image\\son2.png");
		ImageIcon oil_e = new ImageIcon("image\\oil_e.png");
		ImageIcon money = new ImageIcon("image\\money.png");
		ImageIcon son1_mo = new ImageIcon("image\\son1_money.png");
		ImageIcon son2_mo = new ImageIcon("image\\son2_money.png");
		ImageIcon alget = new ImageIcon("image\\money_get.png");
		//ImageIcon  = new ImageIcon("images\\money.jpg");
		ImageIcon  oil[] = new ImageIcon[4];
		oil[0] = new ImageIcon("image\\oil_1.png");
		oil[1] = new ImageIcon("image\\oil_2.png");
		oil[2] = new ImageIcon("image\\oil_3.png");
		oil[3] = new ImageIcon("image\\oil_f.png");

		ImageIcon coin = new ImageIcon("image\\coin1.png");

		JPanel oilpanel = new JPanel();
		JLabel oillabel = new JLabel(oilimage);
		oilpanel.add(oillabel);
		oilpanel.setSize(150, 150);
		oilpanel.setLocation(200, 300);

		JPanel alpanel = new JPanel();
		JLabel allabel = new JLabel(al);
		alpanel.add(allabel);
		alpanel.setSize(150, 180);
		alpanel.setLocation(350, 300);

		JPanel sonpanel = new JPanel();
		JLabel sonlabel1 = new JLabel(son1);
		sonpanel.add(sonlabel1);
		sonpanel.setSize(220, 250);
		sonpanel.setLocation(550, 300);

		JPanel coinpanel = new JPanel();
		JLabel coinlabel = new JLabel(coin);
		coinpanel.add(coinlabel);
		coinpanel.setSize(200, 200);
		coinpanel.setLocation(250, 150);

		JPanel gagepanel = new JPanel();
		JLabel gagelabel = new JLabel(oil_e);
		gagepanel.add(gagelabel);
		gagepanel.setSize(70, 100);
		gagepanel.setLocation(180, 450);

		JPanel totalpanel = new JPanel();
		JLabel totallabel = new JLabel("획 득 : " + coincount);		
		totallabel.setSize(100, 50);
		totallabel.setLocation(100, 50);
		JLabel totallabel2 = new JLabel("전체 코인 : " + "나중에 합침");	
		totallabel2.setSize(100, 50);
		totallabel2.setLocation(200, 50);
		JButton totalbutton = new JButton();
		totalbutton.setSize(100,100);
		totalbutton.setLocation(300, 50);

		totalpanel.setSize(250, 250);
		totalpanel.setLocation(250, 250);		

		totalpanel.add(totallabel);
		totalpanel.add(totallabel2);
		totalpanel.add(totalbutton);

		jr.add(oilpanel);
		jr.add(alpanel);

		jr.add(sonpanel);

		do{
			oilpanel.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){								
					jr.add(gagepanel);					
					jr.revalidate();             //JPanel 리프레시
					jr.repaint();
				}
			});

			jr.addKeyListener(new KeyAdapter() {			
				@Override
				public void keyPressed(KeyEvent e){				
					if(gagepanel.isVisible()){

						while(count <= 4){						
							if(count==4){
								sonlabel1.setIcon(son1_mo);
								break;
							}
							if(e.getKeyChar() == ' '){
								count++;
								gagelabel.setIcon(oil[count-1]);
								break;
							}
						}
					}
				}
			});

			sonpanel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e){
					sonpanel.setSize(220, 250);
					sonpanel.setLocation(240, 450);
					if(count != 0){									
						sonlabel1.setIcon(son1);
						allabel.setIcon(alget);
					}					
				}
			});

			alpanel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e){
					if(allabel.getIcon() == alget){
						allabel.setIcon(al);
						jr.add(coinpanel);
						jr.remove(gagepanel);
						jr.remove(sonpanel);
						jr.revalidate();             //JPanel 리프레시
						jr.repaint();

					}				
				}
			});

			coinpanel.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					jr.remove(coinpanel);
					jr.revalidate();             //JPanel 리프레시
					jr.repaint();
					count = 0;
					coincount+=50;
					System.out.println(coincount);
					sonpanel.setSize(220, 250);
					sonpanel.setLocation(550, 300);						
					gagelabel.setIcon(oil_e);
					jr.add(sonpanel);	

				}
			});	

		}while(coincount>300);
		
		//jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);
		
		System.out.println("주유소 종료");
	
		
	}



}



