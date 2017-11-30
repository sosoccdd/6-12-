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

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iCold.model.dao.IColdFunction;
import iCold.model.vo.CrushCarM;


public class CrushCarV extends JFrame{
	//IColdFunction function = new IColdFunction();
	public static JFrame frame = new JFrame("Crush car");
	public static Clip clip;
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
         AudioInputStream backmusic = AudioSystem.getAudioInputStream(new File("Sound\\sd3-306.wav"));
//       AudioInputStream punchSound = AudioSystem.getAudioInputStream(new File("Sound\\Å¸°ÝÀ½_Çª¾ï.wav"));
         clip = AudioSystem.getClip();
         clip.stop();
         clip.open(backmusic);
//   clip.open(punchSound);
         clip.start();;
         
      }
      catch (Exception ex)
      {
      } 
      
      
   }

}
