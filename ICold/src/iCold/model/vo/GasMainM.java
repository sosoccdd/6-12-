package iCold.model.vo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import iCold.view.GasBackV;

public class GasMainM extends JFrame{
	
	public GasMainM(){		
		//������ ����
		this.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		//�����ӿ� ���� �� �г� ���� ������ �������� ������ ����
		this.add(new GasBackV(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
