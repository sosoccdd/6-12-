package iCold.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iCold.model.dao.IColdFunction;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodFighterV extends JFrame {

	IColdFunction i;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	CardLayout card;
	int ctn = 0;

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

		getContentPane().add("one", panel1);
		getContentPane().add("two", panel2);
		getContentPane().add("three", panel3);

	}

	class panel1 extends JPanel implements MouseListener {
		private JLabel img1;
		private FoodFighterV l;

		panel1(FoodFighterV l) {
			this.l = l;

			setLayout(null);

			img1 = new JLabel(new ImageIcon("image/그림28.png"));

			img1.setBounds(0, 0, 300, 300);
			add(img1);
			repaint();

			addMouseListener(this);

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			this.setVisible(false);
			l.card.show(l.getContentPane(), "two");
			l.ctn += 1;

			if (l.ctn > 30) {
				this.setVisible(false);
				l.card.show(l.getContentPane(), "three");
				l.ctn = 0;
				i.addCoin(3);
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

		panel2(FoodFighterV l) {
			this.l = l;

			setLayout(null);

			img1 = new JLabel(new ImageIcon("image/그림29.png"));
			img1.setBounds(0, 0, 300, 300);
			add(img1);
			repaint();

			addMouseListener(this);

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			this.setVisible(false);
			l.card.show(l.getContentPane(), "one");
			l.ctn += 1;

			if (l.ctn > 30) {
				this.setVisible(false);
				l.card.show(l.getContentPane(), "three");
				l.ctn = 0;
				i.addCoin(3);
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

		
		panel3(FoodFighterV f) {
			this.f=f;
			setLayout(null);
			JLabel suc = new JLabel("성공!");
			suc.setBounds(10, 10, 300, 300);
			add(suc);
			
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

}