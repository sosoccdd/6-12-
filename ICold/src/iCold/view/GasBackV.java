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
		//변수로 받아온 프레임을 선언. JPanel을 상속받아서 자신의 변수로 사용
		this.jr = jr;
		this.setLayout(null);
		//프레임의 메인 기능의 패널을 생성하기 위해 추가된 프레임을 포함하여 GasPanel클래스로 전달
		GasPanelV gp = new GasPanelV(jr);
		//생성된 프레임과 패널을 Thread로 선언한 GasTimer의 변수로 전달
		GasTimerV timer = new GasTimerV(jr, gp);
		Thread t1 = timer;
		//Thread로 선언한 timer 실행
		t1.start();
		
	}

}
