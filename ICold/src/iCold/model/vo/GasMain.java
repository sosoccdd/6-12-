package iCold.model.vo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import iCold.view.GasBack;

public class GasMain extends JFrame{
	
	public GasMain(){		
		//������ ����
		this.setBounds(1000, 1000, 1000, 700);
		Dimension frameSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		//�����ӿ� ���� �� �г� ���� ������ �������� ������ ����
		this.add(new GasBack(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
