package iCold.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iCold.model.vo.GasMain;

public class ChangePanel extends JDialog{
	
	JFrame jr;
	JPanel panel;
	
	//JDialog dia;
	
	
	public ChangePanel(JFrame jr, JPanel panel){
		this.jr = jr;
		this.panel = panel; 
		
		//this = new JDialog(jr, "시간 종료", true);
		this.setTitle("시간 종료");
		this.setSize(300, 300);
		this.setLocation(250, 250);
		this.setLayout(null);
		
		JLabel addlabel = new JLabel("Test");
		addlabel.setSize(80, 80);
		addlabel.setLocation(50, 50);
		
		JLabel totallabel = new JLabel("종합");
		totallabel.setSize(80, 80);
		totallabel.setLocation(50, 150);
		
		JButton button = new JButton("돌아가기");
		button.setSize(80, 80);
		button.setLocation(50, 250);
		
		this.add(addlabel);
		this.add(totallabel);
		this.add(button);
		
		jr.add(this);
		
		
	
	}
}







/*
JDialog dia = new JDialog(jr, "시간 종료", true);
dia.setSize(300, 300);
dia.setLocation(300, 300);
dia.setLayout(null);

JLabel addlabel = new JLabel("Test");
JLabel totallabel = new JLabel("종합");*/





/*jr.remove(panel);
jr.repaint(0, 0, 1000, 700);

chapanel = new JPanel();
chapanel.setLayout(null);
chapanel.setSize(1000, 700);
chapanel.setLocation(0, 0);
chapanel.setBackground(Color.BLUE);

JLabel addlabel = new JLabel("획득 :" + "coincount");
addlabel.setLocation(50, 100);
addlabel.setSize(100, 50);

JLabel totallabel = new JLabel("합계 : " + "total");
totallabel.setLocation(50, 250);
totallabel.setSize(100, 50);

JButton rebutton = new JButton("돌아가기");
rebutton.setLocation(50, 500);
rebutton.setSize(100, 100);

chapanel.add(addlabel);
chapanel.add(totallabel);
chapanel.add(rebutton);

jr.add(chapanel);
jr.repaint();


//jr.setVisible(true);*/





/*this.jr = jr;
this.panel = panel; 

dia = new JDialog(jr, "시간 종료", true);
dia.setSize(300, 300);
dia.setLocation(250, 250);
dia.setLayout(null);

JLabel addlabel = new JLabel("Test");
addlabel.setSize(80, 80);
addlabel.setLocation(50, 50);

JLabel totallabel = new JLabel("종합");
totallabel.setSize(80, 80);
totallabel.setLocation(50, 150);

JButton button = new JButton("돌아가기");
button.setSize(80, 80);
button.setLocation(50, 250);

dia.add(addlabel);
dia.add(totallabel);
dia.add(button);

jr.add(dia);*/