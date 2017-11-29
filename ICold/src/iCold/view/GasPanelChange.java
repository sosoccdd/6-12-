package iCold.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasPanelChange extends JFrame{
	
	JFrame jr;
	JPanel chpanel;
	
	public GasPanelChange(){
				
		//this.jr = jr;
		
		jr = new JFrame();
		jr.setTitle("시간 종료");
		jr.setSize(500, 500);
		jr.setLocation(400, 400);
		
		
		chpanel = new JPanel();
		chpanel.setLayout(null);
		chpanel.setSize(500, 500);
		chpanel.setLocation(0, 0);
		//chpanel.setBackground(Color.BLUE);

		
		JLabel addlabel = new JLabel("획득 :" + "coincount");
		addlabel.setLocation(50, 100);
		addlabel.setSize(100, 100);

		
		JLabel totallabel = new JLabel("합계 : " + "total");
		totallabel.setLocation(50, 200);
		totallabel.setSize(100, 100);

		JButton rebutton = new JButton("돌아가기");
		rebutton.setLocation(50, 350);
		rebutton.setSize(100, 100);
		
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
