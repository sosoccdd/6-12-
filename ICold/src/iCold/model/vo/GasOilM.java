package iCold.model.vo;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*import gasOilM.GasOilM;
import gasOilM.GasOilT;*/
import iCold.view.GasOilV;
import iCold.view.WorkNetV;

public class GasOilM extends GasOilV implements Runnable{

	int won;
	JFrame sf = new JFrame();
	
	public GasOilM(){
		
/*		GasOilM gasm = new GasOilM();
		Thread t1 = new Thread(new GasOilM());
		Thread t2 = new Thread(gasm);
		//Thread t3 = new Thread(new GasThreadTest());

		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		if(!t2.isAlive()){
			gasm.stopOilM();
		}
		*/
		
		
		
	}


	@Override
	public void run(){
		try {
			for(int i = 0; i<=100; i++){
				System.out.println(i);
				Thread.sleep(100);
				if(i==100){
					JFrame sf = new JFrame();
					sf.setTitle("시간 종료");
					sf.setBounds(1000, 1000, 1000, 700);
					sf.setLayout(null);
					Dimension frameSize = sf.getSize();
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					sf.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

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
							new WorkNetV();

						}
					});

					sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sf.setVisible(true);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	
	/*if(!jr.isAlive()){
		gasm.stopOilM();
	}*/


}
}