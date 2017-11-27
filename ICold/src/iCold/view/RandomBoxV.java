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
			
			System.out.println("d");
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
		private JButton previous;
		private Image backIcon = new ImageIcon("Image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
		
		
		Rejected(MainFrame f){
			F = f;
			setLayout(null);
			announce = new JButton("코인이 부족합니다!");
			announce.setFont(new Font("굴림", Font.BOLD, 50));
			announce.setBounds(240,10,500,80);
			this.add(announce);
			
			
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
			private Image background = new ImageIcon("image/BoxPanel.png").getImage().getScaledInstance(980, 640, 0);
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
				wallet.setText(i.coinDisplay()+"코인");
				wallet.setFont(new Font("굴림", Font.BOLD, 25));
				
				
				
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
						wallet.setText(i.coinDisplay()+"코인");
						
						if(num<60) {
						    F.getCardLayout().show(F.getContentPane(), "four");
						 
						}
						
						else if(num<75) {
							F.getCardLayout().show(F.getContentPane(), "three");
							i.addCoin(10);
							wallet.setText(i.coinDisplay()+"코인");
						}
						
						else if(num<85) {
							F.getCardLayout().show(F.getContentPane(), "two");
<<<<<<< HEAD
							char[] cr = new char[i.clothDisplay().length()];
							cr = i.clothDisplay().toCharArray();
							
							ArrayList ar = new ArrayList();
							
							for (int i = 0; i < cr.length; i++) {
								ar.add(i, cr[i]);
							}
							if(!(ar.contains('6')))
								i.addCloth("6");
							
=======

							i.addCloth("6");
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-
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
			private JButton SuitImage;
			private JButton previous;
			private Image background = new ImageIcon("image/BoxBackground.png").getImage().getScaledInstance(980, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
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
				
				getSuit = new JButton("히든 아이템 등장! -3코인!");
				getSuit.setFont(new Font("굴림", Font.BOLD, 50));
				getSuit.setBounds(170, 10, 700, 80);
				add(getSuit);
				
				SuitImage = new JButton(new ImageIcon("image/옷6.png"));
				SuitImage.setBounds(280, 120, 500, 400);
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
			private JButton coinImage;
			private JButton previous;
			private Image background = new ImageIcon("image/BoxBackground.png").getImage().getScaledInstance(980, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
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
				
				getCoinBox = new JButton("코인 더미 등장! +7코인");
				getCoinBox.setFont(new Font("굴림", Font.BOLD, 50));
				getCoinBox.setBounds(170, 10, 700, 80);
				add(getCoinBox);
				
				coinImage = new JButton(new ImageIcon("image/coinImage.png"));
				coinImage.setBounds(280, 120, 500, 400);
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
			private JButton bewhy;
			private JButton previous;
			private Image background = new ImageIcon("image/BoxBackground.png").getImage().getScaledInstance(980, 640, 0);
			private ImageIcon background2 = new ImageIcon(background);
			private Image backIcon = new ImageIcon("image/backIcon.png").getImage().getScaledInstance(60, 60, 0);
			private ImageIcon backIcon2 = new ImageIcon(backIcon);
			
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(background2.getImage(), 0, 0, null);
				this.setOpaque(false);
				
				super.paintComponent(g);
			}
			
			public FashionTerrorPanel(MainFrame f) {
				F = f;
				setBackground(Color.WHITE);
				setSize(330, 80);
				setLayout(null);
				
				getShit = new JButton("구찌 티셔츠 등장! -3코인");
				getShit.setFont(new Font("굴림", Font.BOLD, 50));
				getShit.setBounds(170, 10, 700, 80);
				add(getShit);
				
				bewhy = new JButton(new ImageIcon("image/비와이.png"));
				bewhy.setBounds(280, 120, 500, 400);
				add(bewhy);
				
				
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
