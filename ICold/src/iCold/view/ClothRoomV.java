package iCold.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

import iCold.model.dao.IColdFunction;
import iCold.model.vo.ClothStoreM;

public class ClothRoomV extends JComponent implements MouseListener, MouseMotionListener {
	ClothStoreM Store = new ClothStoreM();
	IColdFunction function = new IColdFunction();
	JLabel cloth[] = new JLabel[6];
	int what=-1;

	class cloth1 extends JLabel{
		
		JLabel cloth1;
		Image cloth2 = null;
		
		cloth1(ClothRoomV c) {
			
			try {
			File cloth = new File("image/¿Ê1.png");
			cloth2 = ImageIO.read(cloth);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		public void paintComponent(Graphics g) {
			g.drawImage(cloth2,10,10,this);
		}
		
		
		
	}
	public ClothRoomV() {

		
		JFrame jframe = new JFrame("ClothRoom");
		jframe.setLayout(null);
		jframe.getContentPane().setBackground((Color.white));
		jframe.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = jframe.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

		ImageIcon gender = new ImageIcon("image\\¿©ÀÚ.png");
		JLabel genderLabel = new JLabel(gender);
		genderLabel.setLocation(-70, 96);
		genderLabel.setSize(376, 442);

		ArrayList ar = new ArrayList();
		char cr[] = new char[function.clothDisplay().length()];
		cr = function.clothDisplay().toCharArray();

		for (int i = 0; i < cr.length; i++) {
			ar.add(i, cr[i]);
		}

		
		
		
		
		
		
		
		cloth[0] = new JLabel(new ImageIcon("image/¿Ê1.png"));
		cloth[0].setBounds(170, 230, 200, 300);
		
		cloth[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 0;
				reset();
				cloth[0].setBounds(45, 210,150,350);
			}
		});
		
		cloth[1] = new JLabel(new ImageIcon("image/¿Ê2.png"));
		cloth[1].setBounds(290, 242, 200, 300);
		cloth[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 1;
				reset();
				cloth[1].setBounds(41, 220,150,350);
			}
		});
		
		cloth[2] = new JLabel(new ImageIcon("image/¿Ê3.png"));
		cloth[2].setBounds(410, 242, 200, 300);
		cloth[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 2;
				reset();
				cloth[2].setBounds(35, 224,150,350);
			}
		});
		
		
		cloth[3] = new JLabel(new ImageIcon("image/¿Ê4.png"));
		cloth[3].setBounds(530, 220, 200, 300);
		cloth[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 3;
				reset();
				cloth[3].setBounds(39, 225,150,300);
			}
		});
		
		cloth[4] = new JLabel(new ImageIcon("image/¿Ê5.png"));
		cloth[4].setBounds(650, 225, 200, 300);
		cloth[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 4;
				reset();
				cloth[4].setBounds(40, 210,150,350);
			}
		});
		
		cloth[5] = new JLabel(new ImageIcon("image/¿Ê6.png"));
		cloth[5].setBounds(770, 215, 200, 300);
		cloth[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				what = 5;
				reset();
				cloth[5].setBounds(37, 157,150,442);
			}
		});
		
		if (ar.contains('1')) {
			jframe.add(cloth[0]);
		}
		if (ar.contains('2')) {
			jframe.add(cloth[1]);
		}
		if (ar.contains('3')) {
			jframe.add(cloth[2]);
		}
		if (ar.contains('4')) {
			jframe.add(cloth[3]);
		}
		if (ar.contains('5')) {
			jframe.add(cloth[4]);
		}
		if (ar.contains('6')) {
			jframe.add(cloth[5]);
		}

		jframe.addMouseListener(this);
		jframe.addMouseMotionListener(this);

		JButton coinButton = new JButton(function.coinDisplay() + " °³ ");
		coinButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		coinButton.setLocation(30, 30);
		coinButton.setSize(150, 50);

		JButton ClothButton = new JButton("¿Ê Àå");
		ClothButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		ClothButton.setLocation(400, 30);
		ClothButton.setSize(150, 50);

		JButton endingButton = new JButton("»ç±³Àå°¡±â");
		endingButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		endingButton.setLocation(750, 30);
		endingButton.setSize(150, 50);
		endingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				ArrayList ar = new ArrayList();
				char[] cr = new char[function.clothDisplay().toCharArray().length];
				cr = function.clothDisplay().toCharArray();

				for (int i = 0; i < cr.length; i++) {
					ar.add(i, cr[i]);
				}

				/*if (ar.contains('6')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV6();
				}

				else if (ar.contains('5')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV5();
				}

				else if (ar.contains('4')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV4();
				}

				else if (ar.contains('3')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV3();
				}

				else if (ar.contains('2')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV2();
				}

				else if (ar.contains('1')) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV1();
				}

				else {
					jframe.setVisible(false);
					new ClothRoomV();
				}*/
				
				if(what == 0) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV1();
				}
				
				else if(what == 1) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV2();
				}
				
				else if(what == 2) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV3();
				}
				
				else if(what == 3) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV4();
				}
				
				else if(what == 4) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV5();
				}
				
				else if(what == 5) {
					jframe.setVisible(false);
					new EndingStoryV.EndingStoryV6();
				}
				
			}

		});


					


		JButton nickName = new JButton(function.nameDisplay());
		nickName.setFont(new Font("±¼¸²", Font.BOLD, 20));
		nickName.setLocation(120, 550);
		nickName.setSize(150, 50);

		JButton StoreButton = new JButton("»óÁ¡");
		StoreButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		StoreButton.setLocation(400, 550);
		StoreButton.setSize(150, 50);
		StoreButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new ClothStoreV();

			}

		});
		JButton workButton = new JButton("°í¿ë³ëµ¿ºÎ");
		workButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		workButton.setLocation(599, 550);
		workButton.setSize(150, 50);
		workButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new WorkNetV();

			}

		});

		JButton randomButton = new JButton("·£´ý¹Ú½º");
		randomButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		randomButton.setLocation(785, 550);
		randomButton.setSize(150, 50);
		randomButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				jframe.setVisible(false);
				new RandomBoxV.MainFrame();

			}

		});
		jframe.add(genderLabel);
		jframe.add(coinButton);
		jframe.add(ClothButton);
		jframe.add(endingButton);
		jframe.add(nickName);
		jframe.add(StoreButton);
		jframe.add(workButton);
		jframe.add(randomButton);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

	}
	
	public void reset() {
		cloth[0].setBounds(170, 230, 200, 300);
		cloth[1].setBounds(290, 242, 200, 300);
		cloth[2].setBounds(410, 242, 200, 300);
		cloth[3].setBounds(530, 220, 200, 300);
		cloth[4].setBounds(650, 225, 200, 300);
		cloth[5].setBounds(770, 215, 200, 300);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
