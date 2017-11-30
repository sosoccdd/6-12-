package iCold.model.vo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
<<<<<<< HEAD
=======
import javax.swing.JButton;
import javax.swing.JFrame;
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import iCold.model.dao.IColdFunction;
import iCold.view.CrushCarV;
<<<<<<< HEAD
=======
//import iCold.view.CrushCarV;
import iCold.view.CrushcarendV;
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git
import iCold.view.WorkNetV;

public class CrushCarM extends JPanel implements KeyListener, ActionListener {
<<<<<<< HEAD
   IColdFunction function = new IColdFunction();
   //CrushCarV c = new CrushCarV();
   JPanel chpanel;
   private Point manBasicPosition = new Point(300, 400);
   private Image man;
   private ImageIcon car;
   private Image effect;
   public static JLabel label = new JLabel();
   int exit=0;
   static Image background ;
   int right=0;
   int punch=0;
   int cnt=0;   
   int punchs=0;
   int[] hp= {1000,1000,1000,1000,1000
         ,1000,1000,1000,1000,1000
         ,1000,1000,1000,1000,1000
         ,1000,1000,1000,1000,1000
         ,1000,1000,1000,1000,1000
         ,1000,1000,1000,1000,3000

   };





   ImageIcon images[]=new ImageIcon[6];

   Timer mTimer = new Timer(50, this);
   int mTime = 500;
   int count;
   static int coin;


   @Override
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub
      if(mTimer == arg0.getSource())
      {
         mTime-=1;
         System.out.println(mTime);
         for(int i=0 ; i<hp.length; i+=2) {
            if (hp[i]<0 && hp[i]>-9) {
               mTime+=520;
               repaint();
            }
         }
         if(mTime <= 0)
         {

            mTimer.stop();

            int a = JOptionPane.showConfirmDialog(this, "획득코인 :"+getCoin()+" 개", "경과창", JOptionPane.YES_OPTION);

            if(a==0) {
               CrushCarV.clip.stop();
               CrushCarV.frame.setVisible(false);
               new WorkNetV();
            }
         }
         repaint();
      }
   }
=======
	IColdFunction function = new IColdFunction();
	//CrushCarV c = new CrushCarV();
	JPanel chpanel;
	private Point manBasicPosition = new Point(300, 400);
	private Image man;
	private ImageIcon car;
	private Image effect;
	public static JLabel label = new JLabel();
	int exit=0;
	static Image background ;
	int right=0;
	int punch=0;
	int cnt=0;	
	int punchs=0;
	int[] hp= {1000,1000,1000,1000,1000
			,1000,1000,1000,1000,1000
			,1000,1000,1000,1000,1000
			,1000,1000,1000,1000,1000
			,1000,1000,1000,1000,1000
			,1000,1000,1000,1000,3000
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git

<<<<<<< HEAD


   public CrushCarM() {

      //setComponentZOrder( label , 0);


      background = Toolkit.getDefaultToolkit().getImage("image\\backGround.jpg");

      mTimer.start();

      images[0]=new ImageIcon("image\\destroy1.png");
      images[1]=new ImageIcon("image\\destroy2.png");
      images[2]=new ImageIcon("image\\destroy3.png");
      images[3]=new ImageIcon("image\\destroy4.png");
      images[4]=new ImageIcon("image\\destroy5.png");
      images[5]=new ImageIcon("image\\destroy6.png");



      setPreferredSize(new Dimension(1000   , 500));
      setFocusable(true);
      addKeyListener(this);
      man = Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\NomalPosition.png");
      effect = Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\Effect.gif");

      carFrame();
   }
   public void keyPressed(KeyEvent e) {


      if(hp[0]<=0) 

         label.setIcon(images[1]);
      if(hp[10]<=0)
         label.setIcon(images[2]);
      if(hp[15]<=0)
         label.setIcon(images[3]);
      if(hp[23]<=0)
         label.setIcon(images[4]);
      if(hp[29]<=0)
         label.setIcon(images[5]);




      switch (e.getKeyCode()) {

      case KeyEvent.VK_LEFT:
         manBasicPosition.x -= 10;
         man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\WalkToLeft.gif");
         cnt++;
         if (cnt>=15) {
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\RunToLeft.gif");   
            manBasicPosition.x -= 20;   
         }
         right=1;
         break;

      case KeyEvent.VK_A : 
         punch=1;
         punchs++;
         AudioInputStream punchSound;
         try { 
            Clip clip = AudioSystem.getClip();
            punchSound = AudioSystem.getAudioInputStream(new File("Sound\\타격음_푸억.wav"));
            clip.open(punchSound);
            if(punchs%3==0) 
               clip.start();

         } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
=======
	};
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git


<<<<<<< HEAD



         if(right==0) {
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\PunchToRight.gif"); break;}
         if(right==1) {
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\PunchToLeft.gif"); break;
         }
      case KeyEvent.VK_RIGHT: 
         manBasicPosition.x += 10;
         man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\WalkToRight.gif");
         right=0;
         cnt++;
         if(cnt>=15) {
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\RunToRight.gif");
            manBasicPosition.x +=20;

         }

         break;

      case KeyEvent.VK_S :
         punch=1;


         try { 
            Clip clip = AudioSystem.getClip();
            punchSound = AudioSystem.getAudioInputStream(new File("Sound\\타격음_푸억.wav"));
            clip.open(punchSound);
            if(punchs%3==0) 
               clip.start();

         } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }




         if(right==0) {


            manBasicPosition.x += 15;
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\KickToRight.gif"); 
            break;}
         if(right==1) { 
            manBasicPosition.x -= 15;
            man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\KickToLeft.gif"); 
=======
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git

<<<<<<< HEAD
            break;
         }
      }
      repaint();
   }
   public void keyReleased(KeyEvent e) {
      punch=0;
      cnt=0;
      if(right==0){
         man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\NomalPosition.png");
      }
      if(right==1) {
         man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\LeftNomalPosition.png");
      }
=======
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git


<<<<<<< HEAD
   }
   public void keyTyped(KeyEvent e) {}

   public void carFrame() {



      label.setIcon(images[0]);

      label.setBounds(550, 290, 300, 250);
      this.setLayout(null);
      //       setComponentZOrder( label , this.getComponentZOrder(label) + 1);

      label.setVisible(true);


   }

   public void paintComponent(Graphics g) {

      g.fillRect(0, 0, 1000, 1000);
      g.drawImage(background, 20   , 40, this);
      setOpaque(false);
      super.paintComponent(g);

      g.setColor(Color.ORANGE);
      g.setFont(g.getFont().deriveFont(20.0f));
      g.drawString("A,S 키 공격 , 방향키 좌우 .", 700, 40);


      g.setColor(Color.red);
      g.drawRect(0, 40, hp[0], 20);
      g.drawRect(0, 0, mTime, 20);
      g.setColor(Color.red);
      repaint();


      if(hp[1]<=0) {
         repaint();
         g.setColor(Color.BLUE);
         g.drawRect(0, 20, hp[2], 20);
         if(hp[2]<=0) {
            repaint();
            g.setColor(Color.black);
            g.drawRect(0, 20, hp[3], 20);

            if(hp[3]<=0) {
               repaint();
               g.setColor(Color.cyan);
               g.drawRect(0, 20, hp[4], 20);

               if(hp[4]<=0) {
                  repaint();
                  g.setColor(Color.DARK_GRAY);
                  g.drawRect(0, 20, hp[5], 20);
=======
	ImageIcon images[]=new ImageIcon[6];
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git

<<<<<<< HEAD
                  if(hp[5]<=0) {
                     repaint();
                     g.setColor(Color.GRAY);
                     g.drawRect(0, 20, hp[6], 20);

                     if(hp[6]<=0) {
                        repaint();
                        g.setColor(Color.green);
                        g.drawRect(0, 20, hp[7], 20);

                        if(hp[7]<=0) {
                           repaint();
                           g.setColor(Color.LIGHT_GRAY);
                           g.drawRect(0, 20, hp[8], 20);

                           if(hp[8]<=0) {
                              repaint();
                              g.setColor(Color.magenta);
                              g.drawRect(0, 20, hp[9], 20);

                              if(hp[9]<=0) {
                                 repaint();
                                 g.setColor(Color.ORANGE);
                                 g.drawRect(0, 20, hp[10], 20);

                                 if(hp[10]<=0) {
                                    repaint();
                                    g.setColor(Color.pink);
                                    g.drawRect(0, 20, hp[11], 20);
                                    if(hp[11]<=0) {
                                       repaint();
                                       g.setColor(Color.BLUE);
                                       g.drawRect(0, 20, hp[12], 20);
                                       if(hp[12]<=0) {
                                          repaint();
                                          g.setColor(Color.black);
                                          g.drawRect(0, 20, hp[13], 20);

                                          if(hp[13]<=0) {
                                             repaint();
                                             g.setColor(Color.cyan);
                                             g.drawRect(0, 20, hp[14], 20);

                                             if(hp[14]<=0) {
                                                repaint();
                                                g.setColor(Color.DARK_GRAY);
                                                g.drawRect(0, 20, hp[15], 20);

                                                if(hp[15]<=0) {
                                                   repaint();
                                                   g.setColor(Color.GRAY);
                                                   g.drawRect(0, 20, hp[16], 20);

                                                   if(hp[16]<=0) {
                                                      repaint();
                                                      g.setColor(Color.green);
                                                      g.drawRect(0, 20, hp[17], 20);

                                                      if(hp[17]<=0) {
                                                         repaint();
                                                         g.setColor(Color.LIGHT_GRAY);
                                                         g.drawRect(0, 20, hp[18], 20);

                                                         if(hp[18]<=0) {
                                                            repaint();
                                                            g.setColor(Color.magenta);
                                                            g.drawRect(0, 20, hp[19], 20);

                                                            if(hp[19]<=0) {
                                                               repaint();
                                                               g.setColor(Color.ORANGE);
                                                               g.drawRect(0, 20, hp[20], 20);

                                                               if(hp[20]<=0) {
                                                                  repaint();
                                                                  g.setColor(Color.pink);
                                                                  g.drawRect(0, 20, hp[21], 20);
                                                                  if(hp[21]<=0) {
                                                                     repaint();
                                                                     g.setColor(Color.BLUE);
                                                                     g.drawRect(0, 20, hp[22], 20);
                                                                     if(hp[22]<=0) {
                                                                        repaint();
                                                                        g.setColor(Color.black);
                                                                        g.drawRect(0, 20, hp[23], 20);

                                                                        if(hp[23]<=0) {
                                                                           repaint();
                                                                           g.setColor(Color.cyan);
                                                                           g.drawRect(0, 20, hp[24], 20);

                                                                           if(hp[24]<=0) {
                                                                              repaint();
                                                                              g.setColor(Color.DARK_GRAY);
                                                                              g.drawRect(0, 20, hp[25], 20);

                                                                              if(hp[25]<=0) {
                                                                                 repaint();
                                                                                 g.setColor(Color.GRAY);
                                                                                 g.drawRect(0, 20, hp[26], 20);

                                                                                 if(hp[26]<=0) {
                                                                                    repaint();
                                                                                    g.setColor(Color.green);
                                                                                    g.drawRect(0, 20, hp[27], 20);

                                                                                    if(hp[27]<=0) {
                                                                                       repaint();
                                                                                       g.setColor(Color.LIGHT_GRAY);
                                                                                       g.drawRect(0, 20, hp[28], 20);

                                                                                       if(hp[28]<=0) {
                                                                                          repaint();
                                                                                          g.setColor(Color.magenta);
                                                                                          g.drawRect(0, 20, hp[29], 20);

                                                                                          if(hp[29]<=0) {
                                                                                             repaint();
                                                                                             g.setColor(Color.ORANGE);
                                                                                             g.drawString("클리어하셨습니다.", 300, 400);
                                                                                             setCoin(getCoin()+2);
                                                                                          }}}}}}}}}}}}}}}}}}}   }}}}}}}}}}












      //       g.setColor(Color.white);
      //       g.drawImage(background, 200, 500, null);
      //       setOpaque(false);
      //        g.fillRect(0, 300, 1000, 600);
      g.drawImage(man, manBasicPosition.x - man.getWidth(this)/ 2, manBasicPosition.y - man.getHeight(this) / 2, this);


      if(manBasicPosition.x>470&& manBasicPosition.x<800 && punch==1 &&right==0)
      {
         g.drawImage(effect, 610, 300, this);
         g.drawImage(effect, 670, 350, this);
         g.drawImage(effect, manBasicPosition.x +100/ 2, 345, this  );
      }


      for(int i =0 ; i<30; i+=2) {

         hp[i]--;
         if(hp[i]<=0) {

            hp[i+2]--;

         }

      }

      for(int i =1 ; i<30; i+=2) {
         hp[i]-=3;
         if(hp[i]<=0) {
            hp[i+2]-=3;
         }
      }

      if(manBasicPosition.x>=600&& manBasicPosition.x<860 && punch==1 &&right==1)
      {g.drawImage(effect, manBasicPosition.x -150/ 2, 345, this  );

      for(int i =0 ; i<30; i+=2) {
         hp[i]-=3;
         if(hp[i]<=0 ) { 
            hp[i+2]-=3;
         }
      }

      for(int i =1 ; i<30; i+=2) {

         hp[i]--;
         if(hp[i]<=0 ) {
            hp[i+2]--;
         }

      }
      }
   }



   public void setCoin(int coin) {
      this.coin = coin;
   }
   public static int getCoin() {
      return coin;
   }
=======
	Timer mTimer = new Timer(50, this);
	int mTime = 500;
	int count;
	static int coin;


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(mTimer == arg0.getSource())
		{
			mTime-=1;
			System.out.println(mTime);
			for(int i=0 ; i<hp.length; i+=2) {
				if (hp[i]<0 && hp[i]>-9) {
					mTime+=520;
					repaint();
				}
			}
			if(mTime <= 0)
			{

				mTimer.stop();

				int a = JOptionPane.showConfirmDialog(this, "획득코인 :"+getCoin()+" 개", "경과창", JOptionPane.YES_OPTION);

				if(a==0) {
					CrushCarV.clip.stop();
					CrushCarV.frame.setVisible(false);
					new WorkNetV();
				}
			}
			repaint();
		}
	}



	public CrushCarM() {

		//setComponentZOrder( label , 0);


		background = Toolkit.getDefaultToolkit().getImage("image\\backGround.jpg");

		mTimer.start();

		images[0]=new ImageIcon("image\\destroy1.png");
		images[1]=new ImageIcon("image\\destroy2.png");
		images[2]=new ImageIcon("image\\destroy3.png");
		images[3]=new ImageIcon("image\\destroy4.png");
		images[4]=new ImageIcon("image\\destroy5.png");
		images[5]=new ImageIcon("image\\destroy6.png");



		setPreferredSize(new Dimension(1000	, 500));
		setFocusable(true);
		addKeyListener(this);
		man = Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\NomalPosition.png");
		effect = Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\Effect.gif");

		carFrame();
	}
	public void keyPressed(KeyEvent e) {


		if(hp[0]<=0) 

			label.setIcon(images[1]);
		if(hp[10]<=0)
			label.setIcon(images[2]);
		if(hp[15]<=0)
			label.setIcon(images[3]);
		if(hp[23]<=0)
			label.setIcon(images[4]);
		if(hp[29]<=0)
			label.setIcon(images[5]);




		switch (e.getKeyCode()) {

		case KeyEvent.VK_LEFT:
			manBasicPosition.x -= 10;
			man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\WalkToLeft.gif");
			cnt++;
			if (cnt>=15) {
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\RunToLeft.gif");	
				manBasicPosition.x -= 20;	
			}
			right=1;
			break;

		case KeyEvent.VK_A : 
			punch=1;
			punchs++;
			AudioInputStream punchSound;
			try { 
				Clip clip = AudioSystem.getClip();
				punchSound = AudioSystem.getAudioInputStream(new File("Sound\\타격음_푸억.wav"));
				clip.open(punchSound);
				if(punchs%3==0) 
					clip.start();

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}





			if(right==0) {
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\PunchToRight.gif"); break;}
			if(right==1) {
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\PunchToLeft.gif"); break;
			}
		case KeyEvent.VK_RIGHT: 
			manBasicPosition.x += 10;
			man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\WalkToRight.gif");
			right=0;
			cnt++;
			if(cnt>=15) {
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\RunToRight.gif");
				manBasicPosition.x +=20;

			}

			break;

		case KeyEvent.VK_S :
			punch=1;


			try { 
				Clip clip = AudioSystem.getClip();
				punchSound = AudioSystem.getAudioInputStream(new File("Sound\\타격음_푸억.wav"));
				clip.open(punchSound);
				if(punchs%3==0) 
					clip.start();

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}




			if(right==0) {


				manBasicPosition.x += 15;
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\KickToRight.gif"); 
				break;}
			if(right==1) { 
				manBasicPosition.x -= 15;
				man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\KickToLeft.gif"); 

				break;
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {
		punch=0;
		cnt=0;
		if(right==0){
			man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\NomalPosition.png");
		}
		if(right==1) {
			man=Toolkit.getDefaultToolkit().getImage("Images_Right\\Walk\\LeftNomalPosition.png");
		}


	}
	public void keyTyped(KeyEvent e) {}

	public void carFrame() {



		label.setIcon(images[0]);

		label.setBounds(550, 290, 300, 250);
		this.setLayout(null);
		//    	setComponentZOrder( label , this.getComponentZOrder(label) + 1);

		label.setVisible(true);


	}

	public void paintComponent(Graphics g) {

		g.fillRect(0, 0, 1000, 1000);
		g.drawImage(background, 20	, 40, this);
		setOpaque(false);
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		g.setFont(g.getFont().deriveFont(20.0f));
		g.drawString("A,S 키 공격 , 방향키 좌우 .", 700, 40);


		g.setColor(Color.red);
		g.drawRect(0, 40, hp[0], 20);
		g.drawRect(0, 0, mTime, 20);
		g.setColor(Color.red);
		repaint();


		if(hp[1]<=0) {
			repaint();
			g.setColor(Color.BLUE);
			g.drawRect(0, 20, hp[2], 20);
			if(hp[2]<=0) {
				repaint();
				g.setColor(Color.black);
				g.drawRect(0, 20, hp[3], 20);

				if(hp[3]<=0) {
					repaint();
					g.setColor(Color.cyan);
					g.drawRect(0, 20, hp[4], 20);

					if(hp[4]<=0) {
						repaint();
						g.setColor(Color.DARK_GRAY);
						g.drawRect(0, 20, hp[5], 20);

						if(hp[5]<=0) {
							repaint();
							g.setColor(Color.GRAY);
							g.drawRect(0, 20, hp[6], 20);

							if(hp[6]<=0) {
								repaint();
								g.setColor(Color.green);
								g.drawRect(0, 20, hp[7], 20);

								if(hp[7]<=0) {
									repaint();
									g.setColor(Color.LIGHT_GRAY);
									g.drawRect(0, 20, hp[8], 20);

									if(hp[8]<=0) {
										repaint();
										g.setColor(Color.magenta);
										g.drawRect(0, 20, hp[9], 20);

										if(hp[9]<=0) {
											repaint();
											g.setColor(Color.ORANGE);
											g.drawRect(0, 20, hp[10], 20);

											if(hp[10]<=0) {
												repaint();
												g.setColor(Color.pink);
												g.drawRect(0, 20, hp[11], 20);
												if(hp[11]<=0) {
													repaint();
													g.setColor(Color.BLUE);
													g.drawRect(0, 20, hp[12], 20);
													if(hp[12]<=0) {
														repaint();
														g.setColor(Color.black);
														g.drawRect(0, 20, hp[13], 20);

														if(hp[13]<=0) {
															repaint();
															g.setColor(Color.cyan);
															g.drawRect(0, 20, hp[14], 20);

															if(hp[14]<=0) {
																repaint();
																g.setColor(Color.DARK_GRAY);
																g.drawRect(0, 20, hp[15], 20);

																if(hp[15]<=0) {
																	repaint();
																	g.setColor(Color.GRAY);
																	g.drawRect(0, 20, hp[16], 20);

																	if(hp[16]<=0) {
																		repaint();
																		g.setColor(Color.green);
																		g.drawRect(0, 20, hp[17], 20);

																		if(hp[17]<=0) {
																			repaint();
																			g.setColor(Color.LIGHT_GRAY);
																			g.drawRect(0, 20, hp[18], 20);

																			if(hp[18]<=0) {
																				repaint();
																				g.setColor(Color.magenta);
																				g.drawRect(0, 20, hp[19], 20);

																				if(hp[19]<=0) {
																					repaint();
																					g.setColor(Color.ORANGE);
																					g.drawRect(0, 20, hp[20], 20);

																					if(hp[20]<=0) {
																						repaint();
																						g.setColor(Color.pink);
																						g.drawRect(0, 20, hp[21], 20);
																						if(hp[21]<=0) {
																							repaint();
																							g.setColor(Color.BLUE);
																							g.drawRect(0, 20, hp[22], 20);
																							if(hp[22]<=0) {
																								repaint();
																								g.setColor(Color.black);
																								g.drawRect(0, 20, hp[23], 20);

																								if(hp[23]<=0) {
																									repaint();
																									g.setColor(Color.cyan);
																									g.drawRect(0, 20, hp[24], 20);

																									if(hp[24]<=0) {
																										repaint();
																										g.setColor(Color.DARK_GRAY);
																										g.drawRect(0, 20, hp[25], 20);

																										if(hp[25]<=0) {
																											repaint();
																											g.setColor(Color.GRAY);
																											g.drawRect(0, 20, hp[26], 20);

																											if(hp[26]<=0) {
																												repaint();
																												g.setColor(Color.green);
																												g.drawRect(0, 20, hp[27], 20);

																												if(hp[27]<=0) {
																													repaint();
																													g.setColor(Color.LIGHT_GRAY);
																													g.drawRect(0, 20, hp[28], 20);

																													if(hp[28]<=0) {
																														repaint();
																														g.setColor(Color.magenta);
																														g.drawRect(0, 20, hp[29], 20);

																														if(hp[29]<=0) {
																															repaint();
																															g.setColor(Color.ORANGE);
																															g.drawString("클리어하셨습니다.", 300, 400);
																															setCoin(getCoin()+2);
																														}}}}}}}}}}}}}}}}}}}	}}}}}}}}}}












		//    	g.setColor(Color.white);
		//    	g.drawImage(background, 200, 500, null);
		//    	setOpaque(false);
		//        g.fillRect(0, 300, 1000, 600);
		g.drawImage(man, manBasicPosition.x - man.getWidth(this)/ 2, manBasicPosition.y - man.getHeight(this) / 2, this);


		if(manBasicPosition.x>470&& manBasicPosition.x<800 && punch==1 &&right==0)
		{
			g.drawImage(effect, 610, 300, this);
			g.drawImage(effect, 670, 350, this);
			g.drawImage(effect, manBasicPosition.x +100/ 2, 345, this  );
		}


		for(int i =0 ; i<30; i+=2) {

			hp[i]--;
			if(hp[i]<=0) {

				hp[i+2]--;

			}

		}

		for(int i =1 ; i<30; i+=2) {
			hp[i]-=3;
			if(hp[i]<=0) {
				hp[i+2]-=3;
			}
		}

		if(manBasicPosition.x>=600&& manBasicPosition.x<860 && punch==1 &&right==1)
		{g.drawImage(effect, manBasicPosition.x -150/ 2, 345, this  );

		for(int i =0 ; i<30; i+=2) {
			hp[i]-=3;
			if(hp[i]<=0 ) { 
				hp[i+2]-=3;
			}
		}

		for(int i =1 ; i<30; i+=2) {

			hp[i]--;
			if(hp[i]<=0 ) {
				hp[i+2]--;
			}

		}
		}
	}



	public void setCoin(int coin) {
		this.coin = coin;
	}
	public static int getCoin() {
		return coin;
	}
>>>>>>> branch 'master' of https://github.com/sosoccdd/6-12-.git

}