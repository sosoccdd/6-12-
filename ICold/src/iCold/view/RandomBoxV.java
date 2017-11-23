package iCold.view;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
			getContentPane().add("two", new SuitPanel(this));
			getContentPane().add("three", new CoinBoxPanel(this));
			getContentPane().add("four", new FashionTerrorPanel(this));
			
		}
		

		public CardLayout getCardLayout() {
			return card;
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
			IColdFunction i = new IColdFunction();

			BoxPanel(MainFrame f){
				F = f;
				setLayout(null);
				//setSize(500, 500);
				setBackground(new Color(255,255,255));
				
			    randomBoxText = new JLabel("RandomBox");
				randomBoxText.setBounds(450, 10, 100, 100);
				add(randomBoxText);
				
				randomBoxImage1 = new ImageIcon("images/randomBox.jpg").getImage().getScaledInstance(600, 600, 0);
				randomBoxImage2 = new JLabel(new ImageIcon(randomBoxImage1));
				randomBoxImage2.setBounds(200,150,600,600);
				add(randomBoxImage2);
				
				wallet = new JTextField();
				wallet.setBounds(10, 70, 100, 50);
				wallet.setText(i.coinDisplay()+"코인");
				add(wallet);
				
						
				quit = new JButton("종료하기");
				quit.setBounds(10,10,100,50);
				add(quit);
				
				quit.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						new ClothRoomV();
						
					}
					
					
				});
				
				guessWhat = new JButton("guessWhat?");
				guessWhat.setAlignmentX(Component.CENTER_ALIGNMENT);
				guessWhat.setBounds(255,500,500,100);
				add(guessWhat);
				
				guessWhat.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						if(Integer.parseInt((i.coinDisplay()))<3) {
							F.getCardLayout().show(F.getContentPane(), "one");
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
							i.addCloth(10);
						}
						}
					}
				});
				
				
				
				
			}
		}
	
	 public static class SuitPanel extends JPanel{
			private MainFrame F;
			private JLabel getSuit;
			private JLabel announce;
			private JButton previous;
			
			public SuitPanel(MainFrame f) {
				F = f;
				setSize(330, 80);
				setLayout(null);
				
				getSuit = new JLabel("수트 등장!");
				getSuit.setBounds(450, 10, 100, 100);
				add(getSuit);
				
				announce = new JLabel("-3코인");
				announce.setBounds(450, 30, 100, 100);
				add(announce);
				
				previous = new JButton("돌아가기");
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
			private JLabel getCoinBox;
			private JLabel announce;
			private JLabel announce2;
			private JButton previous;
			
			
			public CoinBoxPanel(MainFrame f) {
				F = f;
				setSize(330, 80);
				setLayout(null);
				
				getCoinBox = new JLabel("코인 박스 등장!");
				getCoinBox.setBounds(450, 10, 100, 100);
				add(getCoinBox);
				
				announce = new JLabel("+7코인");
				announce.setBounds(450, 30, 100, 100);
				add(announce);
				
				
				
				previous = new JButton("돌아가기");
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
			private JLabel getShit;
			private JLabel announce;
			private JButton previous;
			
			public FashionTerrorPanel(MainFrame f) {
				F = f;
				setSize(330, 80);
				setLayout(null);
				
				getShit = new JLabel("구찌 티셔츠 등장!");
				getShit.setBounds(450, 10, 100, 100);
				add(getShit);
				
				announce = new JLabel("-3코인");
				announce.setBounds(450, 30, 100, 100);
				add(announce);
				
				previous = new JButton("돌아가기");
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
