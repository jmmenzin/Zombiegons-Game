   import java.awt.Graphics; 
   import java.awt.Color; 
   import java.util.*;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   import javax.swing.JFrame;
   import java.awt.Color;
   import java.awt.Dimension;
   import java.awt.event.MouseMotionListener;
   import java.awt.event.MouseEvent;
   import java.awt.GridLayout;
   import java.awt.geom.AffineTransform;


   public class Shot 
   { 
   // variables 
      public int x_pos; 
      public int y_pos; 
      public int xdes;
      public int ydes;
      public int rise;
      public int run;
      public double slope;
      public int divideby = 1;
   // size of the shot 
      private final int radius = 10; 
   
   // constructor 
      public Shot(int x, int y) 
      { 
         x_pos = x; 
         y_pos = y; 
      }
      public Shot(int x, int y, int xd, int yd)
      {
         x_pos = x; 
         y_pos = y;
         xdes=xd;
         ydes=yd;
         rise=yd-y;
         run=xd-x;
         slope=(rise/run);
         while(slope%2!=0)
         {
            slope=slope*2;
            divideby++;
         }
      }
   
   // returns y - position, needed for testing if shot has left the game area 
      public int getYPos() 
      { 
         return y_pos; 
      } 
      public int getXPos()
      {
         return x_pos;
      }
   
   // moving shot in y - direction 
      public void moveShot(int speed) 
      { 
         
         y_pos+=speed;
         x_pos+=speed;
         // if(rise>0&&slope<0)
            // y_pos += ((speed*-1*slope)/divideby);
         // if(rise>0&&slope>0)
            // y_pos += ((speed*slope)/divideby);
         // if(rise<0&&slope<0)
            // y_pos -= ((speed*-1*slope)/divideby);
         // if(rise<0&&slope>0)
            // y_pos -= ((speed*slope)/divideby);
      // 
         // if(run>0)
            // x_pos += speed; 
         // if(run<0)
            // x_pos-=speed;
      } 
   
   // draw the shot to the screen 
      public void drawShot(Graphics myBuffer) 
      { 
         ImageIcon bullet = new ImageIcon("player.png");         
         myBuffer.drawImage(bullet.getImage(), getXPos(), getYPos(), 10,10, null); 
      } 
      
   }