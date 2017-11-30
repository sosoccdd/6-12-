package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import iCold.model.dao.IColdFunction;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodFighterV extends JFrame{

	IColdFunction i; 
	JPanel panel0;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	
	JLabel dish;
	CardLayout card;
	int ctn = 1;
	int getCoin = 0;
	JButton getCoinl;
	
	
	Timer goodDay;
	Timer nowGo;
	Timer start;
	Timer end;
	

	TimerTask goodDayT;
	TimerTask nowGoT;
	
	TimerTask startT;
	TimerTask endT;
	
	

	public FoodFighterV() {
		i = new IColdFunction();
		
		
		setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

		card = new CardLayout();

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(card);
		setResizable(false);

		
		panel1 = new panel1(this);
		panel2 = new panel2(this);
		panel3 = new panel3(this);
		
		panel4 = new panel4();
		panel5 = new panel5();
		panel6 = new panel6();
		
		

		getContentPane().setBackground(Color.white);
		
		getContentPane().add("intro",panel4);
		getContentPane().add("intro1",panel5);
		getContentPane().add("intro2",panel6);
		
		
		getContentPane().add("one", panel1);
		getContentPane().add("two", panel2);
		getContentPane().add("three", panel3);
		
		
		
		goodDayT = new TimerTask() {
			
			@Override
			public void run() {
				card.show(getContentPane(), "intro1");
				goodDayT.cancel();
			}
		};
		
		nowGoT = new TimerTask() {
			@Override
			public void run() {
				try {
				Thread.sleep(3001);
				}catch(Exception e) {
					e.printStackTrace();
				}
				card.show(getContentPane(), "intro2");
				nowGoT.cancel();
			}
		};
		
		
		startT = new TimerTask() {
			@Override
			public void run() {
				try {
					Thread.sleep(5002);
				}catch(Exception e) {
					e.printStackTrace();
				}
				card.show(getContentPane(), "one");
				startT.cancel();
			}
		};
		
		endT = new TimerTask() {
			@Override
			public void run() {
				try {
					Thread.sleep(8003);
				}catch(Exception e) {
					e.printStackTrace();
				}
				//panel3 = new JPanel();
				card.show(getContentPane(), "three");
				getCoin = (int)ctn/20;
				getCoinl = new JButton("코인"+getCoin+"개 획득!");
				getCoinl.setFont(new Font("굴림",Font.BOLD,40));
				getCoinl.setBounds(350, 200, 300, 185);
				i.addCoin(getCoin);
				panel3.add(getCoinl);
				
				
				
				endT.cancel();
			}
		};
		
		goodDay = new Timer();
		nowGo = new Timer();
		start = new Timer();
		end = new Timer();
		
		goodDay.scheduleAtFixedRate(goodDayT, 3000,1000);
		nowGo.scheduleAtFixedRate(nowGoT, 2000, 1000);
		start.scheduleAtFixedRate(startT, 2000, 1000);
		end.scheduleAtFixedRate(endT, 15000, 1000);
		
		
	}
		

	class panel1 extends JPanel implements MouseListener {
		private JLabel img1;
		private FoodFighterV l;
		public JLabel dish;
		private int num = 1;
		private Image backgroundI = new ImageIcon("image/그림16.png").getImage().getScaledInstance(990, 660 , 0);
		private ImageIcon backgroundIc = new ImageIcon(backgroundI);

		panel1(FoodFighterV l) {
			this.l = l;

			setBackground(Color.WHITE);
			setLayout(null);

			img1 = new JLabel(new ImageIcon("image/그림28.png"));

			img1.setBounds(320, 185, 300, 300);
			add(img1);
			repaint();

			addMouseListener(this);
			
			

		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundIc.getImage(), 0, 0, null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//this.setVisible(false);
			l.card.show(l.getContentPane(), "two");
			l.ctn += 1;

			
			if(ctn%5==0) {
				dish = new JLabel(new ImageIcon("image/그림31.png"));
				dish.setBounds(595,340-(num++*20),200,200);
				repaint();
				add(dish);
			}
			
			
		

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	class panel2 extends JPanel implements MouseListener {
		private JLabel img1;
		private FoodFighterV l;
		public JLabel dish;
		private int num=1;
		private Image backgroundI = new ImageIcon("image/그림16.png").getImage().getScaledInstance(990, 660 , 0);
		private ImageIcon backgroundIc = new ImageIcon(backgroundI);

		panel2(FoodFighterV l) {
			this.l = l;

			setBackground(Color.WHITE);
			setLayout(null);

			img1 = new JLabel(new ImageIcon("image/그림29.png"));
			img1.setBounds(320, 185, 300, 300);
			add(img1);
			repaint();

			addMouseListener(this);
			
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundIc.getImage(), 0, 0, null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			//this.setVisible(false);
			l.card.show(l.getContentPane(), "one");
			l.ctn += 1;

			
			
			if(ctn%5==0) {
				dish = new JLabel(new ImageIcon("image/그림31.png"));
				dish.setBounds(595,340-(num++*20),200,200);
				repaint();
				add(dish);
			}
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class panel3 extends JPanel {
		private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
		private ImageIcon backIcon2 = new ImageIcon(backIcon);
		private FoodFighterV f;
		public JLabel suc;
		private Image background = new ImageIcon("image/foofabackground.png").getImage().getScaledInstance(990, 660, 0);
		private ImageIcon backgroundIc = new ImageIcon(background);
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundIc.getImage(),0,0,null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
		
		panel3(FoodFighterV f) {
			this.f=f;
			setLayout(null);
			suc=null;
			
			JButton back = new JButton(new ImageIcon(backIcon));
			back.setBounds(10,10,100,50);
			add(back);
			
			back.addActionListener(new ActionListener() {
				

				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					f.setVisible(false);
					
					new WorkNetV();
					
				}
				
			});

		}

	}
	
	class panel4 extends JPanel{
		JLabel pressIt;
		Image pressItI;
		ImageIcon pressItIc;
		
		panel4(){
			pressItI = new ImageIcon("image/Pressit.png").getImage().getScaledInstance(990,660,0);
		    pressItIc = new ImageIcon(pressItI);
			
			pressIt = new JLabel(new ImageIcon(pressItI));
			
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(pressItIc.getImage(),0,0,null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
	}
	
	class panel5 extends JPanel{
		JLabel goodDay;
		Image goodDayI;
		ImageIcon goodDayIc;
		
		panel5(){
			goodDayI = new ImageIcon("image/goodDay.png").getImage().getScaledInstance(990,660,0);
			goodDayIc = new ImageIcon(goodDayI);
			
			goodDay = new JLabel(new ImageIcon(goodDayI));
			
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(goodDayIc.getImage(),0,0,null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
	}
	
	class panel6 extends JPanel{
		JLabel nowGo;
		Image nowGoI;
		ImageIcon nowGoIc;
		
		panel6(){
			nowGoI = new ImageIcon("image/nowGo.png").getImage().getScaledInstance(990,660,0);
			nowGoIc = new ImageIcon(nowGoI);
			nowGo = new JLabel(new ImageIcon(nowGoI));
			
			
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(nowGoIc.getImage(),0,0,null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
	}

}