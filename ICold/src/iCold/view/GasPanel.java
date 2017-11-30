package iCold.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasPanel extends JPanel{

	JFrame jr;
	JPanel mainpanel;
	Graphics g;
	JLabel sonlabel;
	JLabel oillabel;
	JLabel allabel;
	JLabel gagelabel;
	JLabel coinlabel;
	JLabel backgr;
	int a=0;
	int gagecount = 0;
	static int coincount = 0;

	ImageIcon oilimage = new ImageIcon("image\\oil.png");
	ImageIcon batang = new ImageIcon("image\\batang.jpg");
	ImageIcon al = new ImageIcon("image\\default.png");
	ImageIcon son1 = new ImageIcon("image\\son1.png");
	ImageIcon son2 = new ImageIcon("image\\son2.png");
	ImageIcon oil_e = new ImageIcon("image\\oil_e.png");
	ImageIcon money = new ImageIcon("image\\money.png");
	ImageIcon son1_mo = new ImageIcon("image\\son1_money.png");
	ImageIcon son2_mo = new ImageIcon("image\\son2_money.png");
	ImageIcon alget = new ImageIcon("image\\money_get.png");
	ImageIcon  oil[];
	ImageIcon coin = new ImageIcon("image\\coin1.png");
	ImageIcon icon = new ImageIcon("image\\timerim");
	JLabel time;
	int mTime = 1000;


	public GasPanel(){}



	public GasPanel(JFrame jr){
		this.jr = jr;
		mainpanel = new JPanel();
		
		mainpanel.setVisible(true);
		mainpanel.setLayout(null);
		mainpanel.setLocation(0, 0);
		mainpanel.setSize(1000, 700);
		

		
		
		
		
		
		/*g= this.getGraphics();
		g.drawRect(10, 120, 300, 400);*/
		

		//paint();
		/*ImageIcon icon = new ImageIcon("image\\timerim");
		time = new JLabel(icon);
		time.setSize(150, 150);
		time.setLocation(600, 20);
		mainpanel.add(time);*/



		/*JPanel background = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(batang.getImage(), 0, 0, null);
				setOpaque(true);
				super.paintComponent(g);
			}
		};

		 */		
		//background();

		/*ImageIcon timegage = new ImageIcon("image\\timegage");
		time = new JLabel(timegage);
		time.setSize(900, 600);
		time.setLocation(10, 10);

		panel.add(time);
		 */






		sonLabel();
		oilLabel();
		alLabel();

		jr.add(mainpanel);

		System.out.println("플레이 시작");

		oil = new ImageIcon[4];

		oil[0] = new ImageIcon("image\\oil_1.png");
		oil[1] = new ImageIcon("image\\oil_2.png");
		oil[2] = new ImageIcon("image\\oil_3.png");
		oil[3] = new ImageIcon("image\\oil_f.png");

		JLabel gagelabel = new JLabel(oil_e);
		gagelabel.setSize(100, 100);
		gagelabel.setLocation(180, 350);

		JLabel coinlabel = new JLabel(coin);
		coinlabel.setSize(150, 150);
		coinlabel.setLocation(350, 80);

		sonlabel.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
			}			
			@Override
			public void mousePressed(MouseEvent e) {
				sonlabel.setLocation(200, 350);

				if(sonlabel.getIcon()==son1_mo || sonlabel.getIcon()==son2_mo){
					if(sonlabel.getIcon()==son1_mo){
						sonlabel.setIcon(son1);
						allabel.setIcon(alget);
					}else{
						sonlabel.setIcon(son2);
						allabel.setIcon(alget);
					}
				}
			}			
			@Override
			public void mouseExited(MouseEvent e) {				
			}			
			@Override
			public void mouseEntered(MouseEvent e) {				
			}			
			@Override
			public void mouseClicked(MouseEvent e) {				
			}
		});


		oillabel.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
			}			
			@Override
			public void mousePressed(MouseEvent e) {				
				mainpanel.add(gagelabel);
				jr.revalidate();             //JPanel 리프레시
				jr.repaint();
			}			
			@Override
			public void mouseExited(MouseEvent e) {				
			}			
			@Override
			public void mouseEntered(MouseEvent e) {				
			}			
			@Override
			public void mouseClicked(MouseEvent e) {				
			}
		});

		jr.addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) {				
			}			
			@Override
			public void keyReleased(KeyEvent e) {			
			}			
			@Override
			public void keyPressed(KeyEvent e) {				
				if(gagelabel.isVisible()){
					System.out.println(gagecount);
					if(e.getKeyChar() == ' '){
						gagecount++;						
						if(gagecount>4){															
							if(sonlabel.getIcon()==son1){
								sonlabel.setIcon(son1_mo);
							}else{
								sonlabel.setIcon(son2_mo);
							}
						}else{
							gagelabel.setIcon(oil[gagecount-1]);
						}

					}
				}
			}
		});

		allabel.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {			
			}			
			@Override
			public void mousePressed(MouseEvent e) {
				if(allabel.getIcon() == alget){
					allabel.setIcon(al);
					mainpanel.add(coinlabel);
					mainpanel.remove(gagelabel);
					mainpanel.remove(sonlabel);
					jr.revalidate();             //JPanel 리프레시
					jr.repaint();
				}	

			}			
			@Override
			public void mouseExited(MouseEvent e) {		
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});


		coinlabel.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
			}			
			@Override
			public void mousePressed(MouseEvent e) {
				mainpanel.remove(coinlabel);
				jr.revalidate();             //JPanel 리프레시
				jr.repaint();
				gagecount = 0;

				//				coincount+=50;
				a+=3;
				setCoincount(a);
				//			System.out.println("획득 금액 : " + coincount);
				sonlabel.setLocation(500, 220);
				int ran = (int) (Math.random()*4+1);
				System.out.println("랜덤값 : " + ran);
				if(ran>2){
					sonlabel.setIcon(son1);
				}else{
					sonlabel.setIcon(son2);
				}				
				mainpanel.add(sonlabel);
				gagelabel.setIcon(oil_e);

			}			
			@Override
			public void mouseExited(MouseEvent e) {
			}			
			@Override
			public void mouseEntered(MouseEvent e) {
			}			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
	
	@Override
	public void paint(Graphics g){

		super.paint(g);
		g.fillRect(20, 30, 100, 200);
		g.setColor(Color.BLUE);
		repaint();
	}
	


	public void alLabel() {		
		allabel = new JLabel(al);
		allabel.setSize(150, 180);
		allabel.setLocation(350, 200);			
		mainpanel.add(allabel);		
		mainpanel.repaint();
	}

	public void oilLabel() {		
		oillabel = new JLabel(oilimage);
		oillabel.setSize(200, 200);
		oillabel.setLocation(220, 200);	
		mainpanel.add(oillabel);						
	}
	public void sonLabel() {		

		sonlabel = new JLabel(son1);		
		sonlabel.setSize(220, 250);
		sonlabel.setLocation(500, 220);			
		mainpanel.add(sonlabel);		
	}

	/*public void timelable(){


		Point point = time.getLocation();

		for (int j = 600; j <=0; j--) {
			time.setLocation(point.x-j, point.y);
			mainpanel.repaint();
		}		



	}*/

	public void background(){
		JPanel backgr = new JPanel(){
			public void paintComponent(Graphics g){

				g.drawImage(batang.getImage(), 0, 0, null);				
			}
		};

		mainpanel.add(backgr);

	}

	public void setCoincount(int coincount) {
		this.coincount = coincount;
	}
	public static int getCoincount() {
		return coincount;
	}

	public int getCoin(){
		return this.coincount;
	}





}










