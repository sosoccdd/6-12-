package iCold.model.vo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import iCold.view.GasOilV;

public class GasOilStart extends Thread{
	
	public static void main(String[] args) {
		
		GasOilV gsv = new GasOilV();
		
		//Thread t1 = new Thread(gsm);
		Thread t2 = new Thread(gsv);
		
		t2.setDaemon(true);
		t2.start();
		
		try {
			for(int i = 0; i<=100; i++){
				System.out.println(i);
				Thread.sleep(100);
				if(i==100){
					JFrame sf = new JFrame();
					sf.setTitle("시간 종료");
					sf.setBounds(300, 300, 500, 500);
					sf.setLayout(null);

					int sum = 0;

					JLabel slabel = new JLabel("획득 : " + "2222" + " 원");
					slabel.setSize(100, 100);
					slabel.setLocation(100, 50);
					JLabel dlabel = new JLabel("합계 : " + sum + " 원");
					dlabel.setSize(100, 100);
					dlabel.setLocation(100, 150);		
					JButton fbutton = new JButton("돌아가기");
					fbutton.setSize(70, 70);
					fbutton.setLocation(100, 350);

					sf.add(slabel);
					sf.add(dlabel);
					sf.add(fbutton);

					fbutton.addActionListener(new ActionListener() {			
						@Override
						public void actionPerformed(ActionEvent e) {
							// txt파일에 저장
							//gasm.stopOilM();
							sf.setVisible(false);

						}
					});

					sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sf.setVisible(true);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(!t2.isAlive()){
			gsv.stopOilM();
		}

		
		
		
		

	}

}
