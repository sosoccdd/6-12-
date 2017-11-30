package iCold.view;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasOilV extends JFrame implements Runnable{

	JFrame jr;
	JPanel mainpanel;

	JLabel sonlabel;
	JLabel oillabel;
	JLabel allabel;

	//ImageIcon back = new ImageIcon("image\\batang.png");
	ImageIcon oilimage = new ImageIcon("image\\oil.png");

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

	int gagecount = 0;
	int coincount = 0;



	public GasOilV(){
		
		this.jr=jr;		
		System.out.println("주유소 게임 프레임 시작");			
		jr = new JFrame("주유소 게임");
		jr.setBounds(1000, 1000, 1000, 700);
		//jr.setLayout(null);
		Dimension frameSize = jr.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jr.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		mainpanel = new JPanel();
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("image\\batang.png").getImage().getScaledInstance(1000, 800, 0)));
		background.setBounds(0, 0, 1000, 800);
		
		mainpanel.add(background);
		
		jr.add(mainpanel);

		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);
	}

	public void gasRun(){
						
		System.out.println("초기화 시작");


		mainpanel.setBounds(0, 0, 1000, 700);
		mainpanel.setLayout(null);

		sonlabel = new JLabel(son1);
		sonlabel.setSize(220, 250);
		sonlabel.setLocation(500, 220);		

		allabel = new JLabel(al);
		allabel.setSize(150, 180);
		allabel.setLocation(300, 250);		

		oillabel = new JLabel(oilimage);
		oillabel.setSize(200, 200);
		oillabel.setLocation(200, 250);			

		mainpanel.add(sonlabel);
		mainpanel.add(allabel);
		mainpanel.add(oillabel);

		jr.add(mainpanel);

		gagecount = 0;
		coincount = 0;


		this.gasPlay();

		/*	jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);*/
	}


	public void gasPlay(){
		
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
		coinlabel.setSize(250, 250);
		coinlabel.setLocation(150, 100);


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

		/*oillabel.addMouseListener(new MouseAdapter(){
			public void MouseClicked(MouseEvent e){
				mainpanel.add(gagelabel);
				jr.revalidate();             //JPanel 리프레시
				jr.repaint();
			}
		});*/

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


		/*jr.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent e){
				if(gagelabel.isVisible()){

					while( gagecount<=4 ){
						if(e.getKeyChar() == ' '){
							gagecount++;
							gagelabel.setIcon(oil[gagecount-1]);
							break;
						}
						if(gagecount==4){
							if(sonlabel.getIcon().equals(son1)){
								sonlabel.setIcon(son1_mo);
							}else{
								sonlabel.setIcon(son2_mo);
							}
							break;
						}	
					}
				}
			}
		});	*/	
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

		/*allabel.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e){
				if(allabel.getIcon() == alget){
					allabel.setIcon(al);
					mainpanel.add(coinlabel);
					mainpanel.remove(gagelabel);
					mainpanel.remove(sonlabel);
					jr.revalidate();             //JPanel 리프레시
					jr.repaint();
				}				
			}
		});*/
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

		/*coinlabel.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e){
				mainpanel.remove(coinlabel);
				jr.revalidate();             //JPanel 리프레시
				jr.repaint();
				gagecount = 0;
				coincount+=50;
				System.out.println("획득 금액 : " + coincount);
				sonlabel.setBounds(220, 250, 900, 200);
				int ran = (int) (Math.random()*4+1);
				if(ran>2){
					sonlabel.setIcon(son1);
				}else{
					sonlabel.setIcon(son2);
				}
				mainpanel.add(sonlabel);
				gagelabel.setIcon(oil_e);
			}
		});*/
		
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
				coincount+=50;
				System.out.println("획득 금액 : " + coincount);
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
		
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);

	}
	
	public void diag(){
		
		
		Dialog sd = new Dialog(jr, "게임 시간 종료");
		sd.setBounds(500, 500, 500, 700);
		sd.setLayout(new FlowLayout());
		sd.add(new JLabel("획득 코인"));
		sd.add(new JLabel("전체 코인"));

		JButton button2 = new JButton("돌아가기");
		sd.add(button2);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jr.setVisible(false);
				sd.setVisible(false);
				System.out.println("마이아");
				new WorkNetV();
			}
		});
	}

	@Override
	public void run() {
		this.gasRun();
		
	}
	

	


}





