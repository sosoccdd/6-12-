package iCold.view;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import iCold.model.dao.IColdFunction;;

public class RandomBoxV {


	static class MainFrame extends JFrame{

		CardLayout card = new CardLayout();
		IColdFunction f = new IColdFunction();
		
		MainFrame(){
			setBounds(1000, 1000, 1000, 700);
			Dimension frameSize = getSize();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);
			setVisible(true);
			
			
			getContentPane().setLayout(card);
			getContentPane().add("one", new BoxPanel(this));
			getContentPane().add("five", new Rejected(this));
			getContentPane().add("two", new SuitPanel(this));
			getContentPane().add("three", new CoinBoxPanel(this));
			getContentPane().add("four", new FashionTerrorPanel(this));
			
		}
		

		public CardLayout getCardLayout() {
			return card;
		}
		
		
	}
	
	public static class Rejected extends JPanel {
		private MainFrame F;
		private JButton announce;
		private JLabel oops;
		private JButton previous;
		public Image backgroundI = new ImageIcon("image/�׸�9.png").getImage().getScaledInstance(970, 640, 0);
		public ImageIcon backgroundIc = new ImageIcon(backgroundI);
		private Image backIcon = new ImageIcon("Image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
		private Image oopsI = new ImageIcon("image/oops.png").getImage().getScaledInstance(970, 640 , 0);
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundIc.getImage(), 0, 0, null);
			this.setOpaque(false);
			
			super.paintComponent(g);
		}
		
		Rejected(MainFrame f){
			F = f;
			setLayout(null);
			announce = new JButton("������ �����մϴ�");
			announce.setBounds(255,510,500,90);
			announce.setFont(new Font("����", Font.BOLD, 40));
			this.add(announce);
			
			oops = new JLabel(new ImageIcon(oopsI));
			oops.setBounds(100, 120, 800, 400);
			add(oops);
			
			previous = new JButton(new ImageIcon(backIcon));
		    previous.setBounds(10,10,100,50);
			this.add(previous);
			
			previous.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					F.getCardLayout().show(F.getContentPane(),"one");
					
				}
				
				
				
			});
			
		}
	}

	 public static class BoxPanel extends JPanel {
			private MainFrame F;
			private Image randomBoxImage1;
			private JLabel randomBoxImage2;
			private JLabel randomBoxText;
			private JTextField wallet;
			private JButton guessWhat;
			private JButton quit;
			private Image background = new ImageIcon("image/BoxPanel.png").getImage().getScaledInstance(970, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
			
			IColdFunction i = new IColdFunction();

			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(background2.getImage(), 0, 0, null);
				this.setOpaque(false);
				
				super.paintComponent(g);
			}

				
				
			
     			BoxPanel(MainFrame f){
				F = f;
				setLayout(null);
				//setSize(500, 500);
				setBackground(new Color(255,255,255));
				
				randomBoxImage1 = new ImageIcon("images/randomBox.jpg").getImage().getScaledInstance(600, 600, 0);
				randomBoxImage2 = new JLabel(new ImageIcon(randomBoxImage1));
				randomBoxImage2.setBounds(200,150,600,600);
				add(randomBoxImage2);
				
				wallet = new JTextField();
				wallet.setBounds(10, 70, 100, 50);
				wallet.setText(i.coinDisplay()+"����");
				wallet.setFont(new Font("����", Font.BOLD, 25));
				
				
				
				add(wallet);
				
						
				quit = new JButton(new ImageIcon(backIcon));
				quit.setBounds(10,10,100,50);
				add(quit);
				
				quit.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						f.setVisible(false);
						new ClothRoomV();
					}
					
					
				});
				
				guessWhat = new JButton(new ImageIcon("image/guessWhat.jpg"));
				guessWhat.setBounds(255,510,500,90);
				add(guessWhat);
				
				guessWhat.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						if(Integer.parseInt((i.coinDisplay()))<3) {
							F.getCardLayout().show(F.getContentPane(), "five");
						}
						else {
						int num = new Random().nextInt(85);
						i.subCoin(3);
						wallet.setText(i.coinDisplay()+"����");
						
						char[] cr = new char[i.clothDisplay().length()];
						cr = i.clothDisplay().toCharArray();
						
						ArrayList ar = new ArrayList();
						
						for (int i = 0; i < cr.length; i++) {
							ar.add(i, cr[i]);
						}
						
						
						if(num<60) {
						    F.getCardLayout().show(F.getContentPane(), "four");
						 
						}
						
						else if(num<75) {
							F.getCardLayout().show(F.getContentPane(), "three");
							i.addCoin(10);
							wallet.setText(i.coinDisplay()+"����");
						}
						
						else if(num<85) {
							if(ar.contains('6')) {
								F.getCardLayout().show(F.getContentPane(), "three");
								i.addCoin(10);
								wallet.setText(i.coinDisplay()+"����");
							}
							else {
							F.getCardLayout().show(F.getContentPane(), "two");

							/*
							//char[] cr = new char[i.clothDisplay().length()];
							cr = i.clothDisplay().toCharArray();
							
							//ArrayList ar = new ArrayList();
							
							for (int i = 0; i < cr.length; i++) {
								ar.add(i, cr[i]);
							}*/
							if(!(ar.contains('6')))
								i.addCloth("6");

							i.addCloth("6");
							}

						}
						}
					}
				});
				
			
				
				
			}
			
			
			
		}
	
	 public static class SuitPanel extends JPanel{
			private MainFrame F;
			private JButton getSuit;
			private JLabel announce;
			private JLabel SuitImage;
			private JButton previous;
			private Image background = new ImageIcon("image/�׸�9.png").getImage().getScaledInstance(970, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
			private Image suitI = new ImageIcon("image/yeah.png").getImage().getScaledInstance(970, 640, 0);
			
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(background2.getImage(), 0, 0, null);
				this.setOpaque(false);
				
				super.paintComponent(g);
			}
			
			public SuitPanel(MainFrame f) {
				setBackground(Color.WHITE);
				F = f;
				setSize(330, 80);
				setLayout(null);
				
				getSuit = new JButton("���� ������+1");
				getSuit.setFont(new Font("����", Font.BOLD, 50));
				getSuit.setBounds(255,510,500,90);
				add(getSuit);
				
				SuitImage = new JLabel(new ImageIcon("image/yeah.png"));
				SuitImage.setBounds(70, 120, 800, 400);
				add(SuitImage);
				
				previous = new JButton(new ImageIcon(backIcon));
				previous.setBounds(10,10,100,50);
				add(previous);
				
				previous.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						F.getCardLayout().show(F.getContentPane(), "one");
					}
				});
			}
	 }
						
					
					
			
				
			
			
			
			
			

	 public static class CoinBoxPanel extends JPanel{
			private MainFrame F;
			private JButton getCoinBox;
			private JLabel announce;
			private JLabel coinImage;
			private JButton previous;
			private Image background = new ImageIcon("image/�׸�9.png").getImage().getScaledInstance(970, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
			private Image wowI = new ImageIcon("image/wow.png").getImage().getScaledInstance(970, 640, 0);
			
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(background2.getImage(), 0, 0, null);
				this.setOpaque(false);
				
				super.paintComponent(g);
			}
			
			public CoinBoxPanel(MainFrame f) {
				F = f;
				setBackground(Color.WHITE);
				setSize(330, 80);
				setLayout(null);
				
				getCoinBox = new JButton("����+7");
				getCoinBox.setFont(new Font("����", Font.BOLD, 40));
				getCoinBox.setBounds(255,510,500,90);
				add(getCoinBox);
				
				coinImage = new JLabel(new ImageIcon(wowI));
				coinImage.setBounds(10, 120, 1000, 400);
				add(coinImage);
				
				previous = new JButton(new ImageIcon(backIcon));
				previous.setBounds(10,10,100,50);
				add(previous);
				
				
				
				
				
				previous.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						F.getCardLayout().show(F.getContentPane(), "one");
						
					}
					
					
				});
			
			
			
			}

			
			
			
		}
	 
	 public static class FashionTerrorPanel extends JPanel{
			private MainFrame F;
			private JButton getShit;
			private JLabel announce;
			private JLabel omg;
			private JButton previous;
			private Image backgroundI = new ImageIcon("image/�׸�9.png").getImage().getScaledInstance(970, 640, 0);
			private ImageIcon backgroundIc = new ImageIcon(backgroundI);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
			private Image omgI = new ImageIcon("image/omg.png").getImage().getScaledInstance(970, 640, 0);
			
			
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(backgroundIc.getImage(), 0, 0, null);
				this.setOpaque(false);
				
				super.paintComponent(g);
			}
			
			public FashionTerrorPanel(MainFrame f) {
				F = f;
				setBackground(Color.WHITE);
				setSize(330, 80);
				setLayout(null);
				
				getShit = new JButton("����-3");
				getShit.setFont(new Font("����", Font.BOLD, 40));
				getShit.setBounds(255,510,500,90);
				add(getShit);
				
				omg = new JLabel(new ImageIcon(omgI));
				omg.setBounds(100, 120, 800, 400);
				add(omg);
				
				
				previous = new JButton(new ImageIcon(backIcon));
				previous.setBounds(10,10,100,50);
				add(previous);
				
				previous.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						F.getCardLayout().show(F.getContentPane(), "one");
						
					}
					
					
				});
			
			
			
			}

			
			
			
		}
	 
}
