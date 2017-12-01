package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import iCold.model.dao.IColdFunction;
import iCold.model.vo.CrushCarM;

public class CrushcarendV extends CrushCarV{
   IColdFunction function = new IColdFunction();
    public CrushcarendV(){
         
       CrushCarV.clip.stop();
       
        //CrushCarV.stop();
        
         this.frame.setVisible(false);
         JFrame jframe2 = new JFrame("차 부수기 결과");
         jframe2.setBounds(1000, 1000, 1000, 700);
         jframe2.getContentPane().setLayout(null);
         Dimension frameSize = jframe2.getSize();
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         jframe2.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);


         JLabel TitleLabel = new JLabel("차부수기 결과");
         TitleLabel.setFont(new Font("굴림", Font.BOLD, 50));
         TitleLabel.setLocation(158, 104);
         TitleLabel.setSize(618, 100);

         JLabel coinLabel = new JLabel("획득코인 : "+CrushCarM.getCoin()+" 개");
         coinLabel.setFont(new Font("굴림", Font.BOLD, 40));
         coinLabel.setLocation(299, 236);
         coinLabel.setSize(338, 92);
         function.addCoin(CrushCarM.getCoin());
         JLabel sumLabel = new JLabel("합계 : "+function.coinDisplay()+" 개");
         sumLabel.setFont(new Font("굴림", Font.BOLD, 40));
         sumLabel.setLocation(299, 379);
         sumLabel.setSize(338, 116);

         JButton Worknet = new JButton("고용노동부");
         Worknet.setFont(new Font("굴림", Font.BOLD, 40));
         Worknet.setLocation(299, 505);
         Worknet.setSize(315, 92);
         Worknet.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
               //aCrushCarM.setco
               jframe2.setVisible(false);
               CrushCarV.clip.stop();
               new WorkNetV();

            }
         });
         jframe2.getContentPane().add(TitleLabel);
         jframe2.getContentPane().add(coinLabel);
         jframe2.getContentPane().add(sumLabel);
         jframe2.getContentPane().add(Worknet);
         jframe2.setVisible(true);
         jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

}