package iCold.view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GasBackV extends JPanel{
	
	JFrame jr;
	JPanel panel;
	
	public GasBackV(JFrame jr){
		//������ �޾ƿ� �������� ����. JPanel�� ��ӹ޾Ƽ� �ڽ��� ������ ���
		this.jr = jr;
		this.setLayout(null);
		//�������� ���� ����� �г��� �����ϱ� ���� �߰��� �������� �����Ͽ� GasPanelŬ������ ����
		GasPanelV gp = new GasPanelV(jr);
		//������ �����Ӱ� �г��� Thread�� ������ GasTimer�� ������ ����
		GasTimerV timer = new GasTimerV(jr, gp);
		Thread t1 = timer;
		//Thread�� ������ timer ����
		t1.start();
		
	}

}
