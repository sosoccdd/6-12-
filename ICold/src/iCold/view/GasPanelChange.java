package iCold.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iCold.model.dao.IColdFunction;

public class GasPanelChange extends JFrame{
	
	JFrame jr;
	JPanel chpanel;
	
	
	int coincount;
	int coin;
	
	public GasPanelChange(){
				
		//this.jr = jr;
		
		//GasPanel gp = new GasPanel();
		IColdFunction icf = new IColdFunction();
		
		
		
		coincount = GasPanel.getCoincount();
		
		
		
		jr = new JFrame();
		jr.setTitle("시간 종료");
		
		jr.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = jr.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jr.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		
		
		chpanel = new JPanel();
		chpanel.setLayout(null);
		chpanel.setSize(1000, 700);
		chpanel.setLocation(0, 0);
		//chpanel.setBackground(Color.BLUE);

		
		
		JLabel addlabel = new JLabel("획득 :" + coincount);
		//에드코인(화ㅣㄱ득코인변수명);
		icf.addCoin(coincount);
		addlabel.setFont((new Font("Sanscerif", Font.BOLD, 30)));
		addlabel.setLocation(200, 100);
		addlabel.setSize(200, 200);

		
		JLabel totallabel = new JLabel("합계 : " + icf.coinDisplay());
		
		totallabel.setFont((new Font("Sanscerif", Font.BOLD, 30)));
		totallabel.setLocation(200, 300);
		totallabel.setSize(200, 200);

		JButton rebutton = new JButton("돌아가기");
		rebutton.setSize(300, 100);
		rebutton.setLocation(200, 500);
		
		rebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jr.setVisible(false);
				new WorkNetV();
				
			}
		});
		
		
		
		chpanel.add(addlabel);
		chpanel.add(totallabel);
		chpanel.add(rebutton);

		jr.add(chpanel);
		
		
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);
		
	}

}
