   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   import java.io.*;
   import java.applet.*;
   import java.awt.Graphics2D;
   import java.awt.Color;
   import java.awt.Dimension;
   import java.awt.event.MouseMotionListener;
   import java.awt.event.MouseEvent;
   import java.awt.GridLayout;
   import java.awt.geom.AffineTransform;
   import java.util.ArrayList;
   import java.awt.image.BufferStrategy;
   import java.awt.event.KeyEvent;
   import java.awt.event.KeyListener;


   public class LevelPanel extends JPanel implements MouseMotionListener
   {
      private static final int FRAMEx = 800;
      private static final int FRAMEy = 600;
      private static final Color BACKGROUND = new Color(250,250,250);
      public int levelwidth;
      public int levelheight;
      private BufferedImage myImage;
      public Graphics2D myBuffer;
      public Player p;
      private Timer t;
      private Timer t2;
      public ImageIcon background;
      public AffineTransform tran;
      public int wspeed;
      public Shot[] shots = new Shot[100];
      public int mousex;
      public int mousey;
      private ArrayList<Integer> keys = new ArrayList<Integer>();
   
      public LevelPanel()
      {
         p = new Player(400,300);
         levelwidth = 800;
         levelheight = 600;
         ImageIcon background = new ImageIcon("background.gif");
         wspeed=p.getWspeed();
         
         addKeyListener(new Key());
         setFocusable(true);
         //t = new Timer(60, new Listener());
         //t.start();
         
         addMouseMotionListener(this);
         
         
         t = new Timer(60, new Listener());
         t.start();
      
      
         // while(true) {
            // long start = System.currentTimeMillis();
            // gameLoop();
         // }
      }
         
      public void paintComponent(Graphics myBuffer)
      {
               
         ImageIcon background = new ImageIcon("background.gif");
         myBuffer.drawImage(background.getImage(),0,0, null); 
      
         repaint();
         p.draw(myBuffer);
         for(int i=0; i<shots.length; i++) 
         { 
            if(shots[i] != null) 
            { 
               shots[i].drawShot(myBuffer); 
            } 
         } 
         Toolkit.getDefaultToolkit().sync();
      }
      
      // private void gameLoop() {
      // // game logic goes here
         // //p.draw(myBuffer);
         // if(keys.contains(new Integer(37))) {
            // p.moveLeft();
         // } 
         // if(keys.contains(new Integer(39))) {
            // p.moveRight();
         // } 
         // if (keys.contains(new Integer(38))) {
            // p.moveUp();
         // } 
         // if (keys.contains(new Integer(40))) {
            // p.moveDown();
         // }
      //    
         // repaint();
      // }
   
               
      
      public class Key extends KeyAdapter
      { 
      
         public void keyPressed(KeyEvent e)
         { 
            setFocusable(true);
            if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            {
               keys.add(new Integer(e.getKeyCode()));
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT)
            {
               keys.add(new Integer(e.getKeyCode()));
            }
            if(e.getKeyCode() == KeyEvent.VK_UP)
            {
               keys.add(new Integer(e.getKeyCode()));
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN)
            {
               keys.add(new Integer(e.getKeyCode()));
            }
         }
      
      
         public void keyReleased(KeyEvent e) 
         { 
            keys.remove(new Integer(e.getKeyCode()));
         }
         // public void keyTyped(KeyEvent e)
         // {
         // }
      }
      
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {                          
            p.draw(myBuffer);
            if(keys.contains(new Integer(37))) {
               p.moveLeft();
            } 
            if(keys.contains(new Integer(39))) {
               p.moveRight();
            } 
            if (keys.contains(new Integer(38))) {
               p.moveUp();
            } 
            if (keys.contains(new Integer(40))) {
               p.moveDown();
            }
            paintComponent(myBuffer);
            repaint();
         }
      }
      
      public void eventOutput(String eventDescription, MouseEvent e) {
         System.out.println(eventDescription+ " (" + e.getX() + "," + e.getY() + ")"+ " detected on "+ e.getComponent().getClass().getName());
         mousex = e.getX();
         mousey = e.getY();  
      	// double a = p.calcAngle(e.getX(),e.getY());
         // tran.setToRotation(2);
         // p.drawRotate(myBuffer,tran); 
      
      }
      public double calcAngle(int x, int y)
      {
         int nx = x-getX();
         int ny = y-getY();
         double angle = Math.atan(nx/ny);
         
         return angle;
         
      }
   
      public void mouseMoved(MouseEvent e) {
         eventOutput("Mouse moved", e);
      }
      public void mouseDragged(MouseEvent e) {
         eventOutput("Mouse dragged", e);
      }
   }
   
   
      
