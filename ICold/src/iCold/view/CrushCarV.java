package iCold.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
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
import java.io.File;



import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import iCold.model.dao.IColdFunction;
import iCold.model.vo.CrushCarM;


public class CrushCarV extends JFrame{

   //IColdFunction function = new IColdFunction();
   public static JFrame frame = new JFrame("Crush car");
   public static Clip clip;
   static AudioInputStream backmusic;
   public CrushCarV() {
      
      frame.setContentPane(new CrushCarM());
      frame.pack();
      frame.add(CrushCarM.label);
      
      
      
      
      frame.setLayout(null);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      try
      {
          backmusic = AudioSystem.getAudioInputStream(new File("Sound\\sd3-306.wav"));
//       AudioInputStream punchSound = AudioSystem.getAudioInputStream(new File("Sound\\Ÿ����_Ǫ��.wav"));
         clip = AudioSystem.getClip();
//         clip.stop();
         clip.open(backmusic);
//   clip.open(punchSound);
         clip.start();
         
      }
      catch (Exception ex)
      {
      } 
      
    
      
   }
   public static void stop() {
	 
	   clip.stop();	
	   clip.close();
   }

}