package iCold.view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasBack extends JPanel{
	
	JFrame jr;
	JPanel panel;
	
	public GasBack(JFrame jr){
		//������ �޾ƿ� �������� ����. JPanel�� ��ӹ޾Ƽ� �ڽ��� ������ ���
		this.jr = jr;
		this.setLayout(null);
		//�������� ���� ����� �г��� �����ϱ� ���� �߰��� �������� �����Ͽ� GasPanelŬ������ ����
		GasPanel gp = new GasPanel(jr);
		//������ �����Ӱ� �г��� Thread�� ������ GasTimer�� ������ ����
		GasTimer timer = new GasTimer(jr, gp);
		Thread t1 = timer;
		//Thread�� ������ timer ����
		t1.start();
		
	}

}
