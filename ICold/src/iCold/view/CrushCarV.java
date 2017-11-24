package iCold.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CrushCarV   {

   JFrame jf =new JFrame();
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));   
   ArrayList<Character> alphaList  = new ArrayList<Character>();
   ArrayList<Integer> numList= new ArrayList<Integer>();
   char ch;
   int num;

   ArrayList<BufferedImage> al =new ArrayList<BufferedImage>();
   JLabel lb;
   JButton button;
   JPanel panel =new JPanel();
   ImageIcon images[] = new ImageIcon[7];

   int i = 0;
   int p = 0;
   int crushcount=0;
   public void background() throws IOException{

      images[0]=new ImageIcon("Images\\\\destroy1.png");
      images[1]=new ImageIcon("Images\\\\destroy2.png");
      images[2]=new ImageIcon("Images\\\\destroy3.png");
      images[3]=new ImageIcon("Images\\\\destroy4.png");
      images[4]=new ImageIcon("Images\\\\destroy5.png");
      images[5]=new ImageIcon("Images\\\\destroy6.png");
      images[6]=new ImageIcon("Images\\\\destroy7.png");



      jf.setBounds(300, 300, 300, 300);



      lb= new JLabel(images[0]);
      lb.setBounds(300, 300   , 300, 300);
      jf.add(lb);

      button= new JButton(images[0]);
      button.setBounds(300, 300, 300, 300);
      jf.add(button);
      jf.setVisible(true);
      for(int i =0 ; i<6 ; i++) {
         ch= (char) ((Math.random()*26)+97);
         alphaList.add(ch);
         System.out.print(ch);

      }
      for(int i =0 ; i<6 ; i++) {

         num =(int)((Math.random()*10)+1);
         numList.add(num);
         System.out.println(num);
      }

      button.addKeyListener(new Keyhow());

      for(int i=0 ; i<6 ;i++) {

         /*if (button.getKeyListeners(new keyhow())==alphaList.get(i)) {
            if(alphaList.get(i).charCount(alphaList.get(i))==numList.get(i)) {

               button.addKeyListener(new Keyhow());


            }

         }*/

      }


      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



   }

   class Keyhow implements KeyListener  {   

      @Override
      public void keyPressed(KeyEvent e)   {
         
         do {
            
            
            if(e.getKeyChar() == alphaList.get(i) ) {
               
               p++;
               
               if(p==numList.get(i)) {
               p=0;   
               System.out.println("입력이올바름");
               button.setIcon(images[i]);   
               
               i++;
               if(images[i]==images[6]) {
                  
                  System.out.println("차를 완파했습니다. ");
                  i=0;
                  break;
               }
               break;
               }
               else {
                  break;
               }
               
               }
               
            
            
            else {
               System.out.println("입력이올바르지않습니다."); 
               break; 
            }
            
         }while(i<6);
      }

      @Override
      public void keyTyped(KeyEvent e) {
         // TODO Auto-generated method stub

      }

      @Override
      public void keyReleased(KeyEvent e) {
         // TODO Auto-generated method stub

      }

   }


}
