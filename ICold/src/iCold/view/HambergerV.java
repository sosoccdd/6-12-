package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iCold.model.dao.IColdFunction;

public class HambergerV extends JFrame {
	IColdFunction function = new IColdFunction();
	JFrame jframe = new JFrame("햄버거");
	int time1 = 10000;
	int coin;
	int a = 0;
	int x = 0;
	int answer = 464;// 4까지 곱하고 5 6 7 더하고 8 곱
	int answer2 = 336;
	int answer3 = 520;
	int answer4 = 240;
	int answer5 = 344;
	int answer6 = 336;
	int answer7 = 232;
	int solve = 0;
	ImageIcon icon[];
	ImageIcon ordericon[];
	JLabel bl[];
	JButton bt[];
	JLabel label[];
	//백그라운드 이미지 삽입할 메소드에 이름없는 클래스 구현
public HambergerV() {
	Hamberger();
	Timer t = new Timer();
	TimerTask time = new TimerTask() {
		
		@Override
		public void run() {
			frame();
			
		}
	};
	t.schedule(time, time1);
	setVisible(false);
	
}

	

public void Hamberger(){
		jframe.setBounds(1000, 1000, 1000, 700);
		jframe.getContentPane().setLayout(null);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

	
		
		icon = new ImageIcon[8];
		icon[0] = new ImageIcon("image\\그림49.png");
		icon[1] = new ImageIcon("image\\그림50.png");
		icon[2] = new ImageIcon("image\\그림48.png");
		icon[3] = new ImageIcon("image\\그림47.png");
		icon[4] = new ImageIcon("image\\그림46.png");
		icon[5] = new ImageIcon("image\\그림45.png");
		icon[6] = new ImageIcon("image\\그림44.png");
		icon[7] = new ImageIcon("image\\그림43.png");

		ordericon = new ImageIcon[8];
		ordericon[0] = new ImageIcon("image\\오더1.png");
		ordericon[1] = new ImageIcon("image\\오더2.png");
		ordericon[2] = new ImageIcon("image\\오더3.png");
		ordericon[3] = new ImageIcon("image\\오더4.png");
		ordericon[4] = new ImageIcon("image\\오더5.png");
		ordericon[5] = new ImageIcon("image\\오더6.png");
		ordericon[6] = new ImageIcon("image\\오더7.png");
		ordericon[7] = new ImageIcon("image\\오더8.png");

		bl = new JLabel[8];

		for (int i = 0; i < 8; i++) {
			bl[i] = new JLabel();
			bl[i].setIcon(ordericon[i]);
			bl[i].setLocation(780, -120);
			bl[i].setSize(200, 700);

		}
		jframe.add(bl[(int) (Math.random() * 7)]);
		bt = new JButton[8];

		for (int i = 0; i < 8; i++) {
			bt[i] = new JButton();
		}
		for (int i = 0; i < 8; i++) {
			bt[i].setSize(150, 100);

			jframe.add(bt[i]);
		}

		bt[0].setIcon(icon[0]);
		bt[0].setLocation(0, 0);
		bt[1].setIcon(icon[1]);
		bt[1].setLocation(0, 150);
		bt[2].setIcon(icon[2]);
		bt[2].setLocation(0, 300);
		bt[3].setIcon(icon[3]);
		bt[3].setLocation(0, 450);
		bt[4].setIcon(icon[4]);
		bt[4].setLocation(150, 0);
		bt[5].setIcon(icon[5]);
		bt[5].setLocation(150, 150);
		bt[6].setIcon(icon[6]);
		bt[6].setLocation(150, 300);
		bt[7].setIcon(icon[7]);
		bt[7].setLocation(150, 450);

		label = new JLabel[8];

		for (int i = 0; i < 8; i++) {
			label[i] = new JLabel();
		}

		label[0].setBounds(400, 100, 900, 900);
		label[1].setBounds(400, 100, 900, 800);
		label[2].setBounds(400, 100, 900, 700);
		label[3].setBounds(400, 100, 900, 600);
		label[4].setBounds(400, 100, 900, 500);
		label[5].setBounds(400, 100, 900, 400);
		label[6].setBounds(400, 100, 900, 300);
		label[7].setBounds(400, 100, 900, 200);

		for (int i = 0; i < 8; i++) {
			jframe.add(label[i]);
		}

		bt[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[0].getIcon());
				setX(getX()+1);
				setSolve(getSolve()+1);

			}
		});

		bt[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[1].getIcon());
				setX(getX()+1);
				setSolve(getSolve()*2);

			}
		});

		bt[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(x);
				label[x].setIcon(bt[2].getIcon());
				setX(getX()+1);
				setSolve(getSolve()*3);

			}
		});
		bt[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[3].getIcon());
				setX(getX()+1);
				setSolve(getSolve()*4);

			}
		});
		bt[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[4].getIcon());
				setX(getX()+1);
				setSolve(getSolve()+5);

			}
		});
		bt[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[5].getIcon());
				setX(getX()+1);
				setSolve(getSolve()+6);

			}
		});
		bt[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[6].getIcon());
				setX(getX()+1);
				setSolve(getSolve()+7);

			}
		});

		bt[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				label[x].setIcon(bt[7].getIcon());
				setX(getX()+1);
				setSolve(getSolve()*8);

			}
		});
		JButton resetbt = new JButton("메뉴제출");
		resetbt.setSize(120, 120);
		resetbt.setLocation(830, 500);		
		resetbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (solve == answer) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
		
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}else if (solve == answer2) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}else if (solve == answer3) {
				
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}else if (solve == answer4) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}else if (solve == answer5) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();

				}else if (solve == answer6) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();

				}else if (solve == answer7) {
					setCoin(getCoin()+1);
					setX(0);
					setSolve(0);
					System.out.println("성공"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}else {					
					setX(0);
					setSolve(0);
					System.out.println("실패"+getCoin());
					for (int i = 0; i < 8; i++) {
						jframe.remove(label[i]);
						
					}
					jframe.setVisible(false);
					Hamberger();
				}
			}
		});
		jframe.add(resetbt);
		

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public int getCoin() {
		return coin;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setSolve(int solve) {
		this.solve = solve;
	}
	public int getSolve() {
		return solve;
	}
	public void frame(){
		jframe.setVisible(false);
		JFrame jframe2 = new JFrame("햄버거 결과");
		
		jframe2.setBounds(1000, 1000, 1000, 700);
		jframe2.setLayout(null);
		Dimension frameSize = jframe2.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe2.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		JLabel TitleLabel = new JLabel("햄버거 게임 결과");
		TitleLabel.setFont(new Font("굴림", Font.BOLD, 50));
		TitleLabel.setLocation(158, 104);
		TitleLabel.setSize(618, 100);

		JLabel coinLabel = new JLabel("획득코인 : "+getCoin()+" 개");
		coinLabel.setFont(new Font("굴림", Font.BOLD, 40));
		coinLabel.setLocation(299, 236);
		coinLabel.setSize(338, 92);
		function.addCoin(getCoin());
		JLabel sumLabel = new JLabel("합계 : "+function.coinDisplay()+" 개");
		sumLabel.setFont(new Font("굴림", Font.BOLD, 40));
		sumLabel.setLocation(299, 379);
		sumLabel.setSize(338, 116);

		JButton Worknet = new JButton("고용노동부");
		Worknet.setFont(new Font("굴림", Font.BOLD, 40));
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



}

// 1. 햄버거 프레임 안꺼짐                                                2. 시간지나면 고용노동부프레임 반복 나옴 .
