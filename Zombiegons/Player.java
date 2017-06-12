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


public class Player extends Character
   {
      public int health = 100;
      public int speed = 6;
      public int x;
      public int y;
      public double Angle;
      public int Xbound=755;
      public int Ybound=535;
      //Stores the weapons the Player has acquired 
      public Stack<Weapon> weapon;
      //Stores this player's scores on each level
      public ArrayList scores = new ArrayList();
      public double direction;
      public Player(int newX, int newY)
      {
         x=newX;
         y=newY;
         Pistol l = new Pistol();
         weapon = new Stack<Weapon>();
         weapon.push(l);
      }
      public Stack<Weapon> getWeapons()
      {
      //Returns the Player's stored weapons
         return weapon;
      }
      public int getWspeed()
      {
         return weapon.peek().getSpeed();
      }
      public void draw(Graphics myBuffer) 
      {   
         ImageIcon player = new ImageIcon("player.png");
         if(player.getImage()!=null)
            myBuffer.drawImage(player.getImage(), getX(), getY(), 30,30, null);
      }
      public void drawRotate(Graphics2D myBuffer,AffineTransform tran)
      {
         ImageIcon player = new ImageIcon("machinegun.png");
         myBuffer.drawImage(player.getImage(), tran, null);
      }
      public void moveTo(int newX, int newY)
      {
      //Changes current x and y ints to the new ints
         x=newX;
         y=newY;
      }
      public int getX()
      {
      //Returns current x value
         return x;
      }
      public int getY()
      {
      //Returns current y value
         return y;
      }
      public void setY(int newY)
      {
         y=newY;
      }
      public void setX(int newX)
      {	
         x=newX;
      }
      public int damage(int hit)
      {
      //Lowers health by hit and returns new health
         health -= hit;
         return health;
      }
      public void rotate(int x, int y)
      {
      
      }
      public void moveUp()
      {
         setY(getY()-speed);
         if(getY()>=Ybound)
            setY(Ybound);
         if(getY()<=0)
            setY(0);
      }
      public void moveDown()
      {
         setY(getY()+speed);
         if(getY()>=Ybound)
            setY(Ybound);
         if(getY()<=0)
            setY(0);
      
      }
      public void moveLeft()
      {
         setX(getX()-speed);
         if(getX()>=Xbound)
            setX(Xbound);
         if(getX()<=0)
            setX(0);
      
      
      }
      public void moveRight()
      {
         setX(getX()+speed);
         if(getX()>=Xbound)
            setX(Xbound);
         if(getX()<=0)
            setX(0);
      
      }
      public void setAngle(double angle)
      {
         Angle = angle;
      }
      public double getAngle()
      {
         return Angle;
      }
      public double calcAngle(int x, int y)
      {
         int nx = x-getX();
         int ny = y-getY();
         double angle = Math.atan(nx/ny);
         setAngle(angle);
         return angle;
         
      }
      public Shot generateShot(int xd, int yd) 
      { 
         Shot shot = new Shot(getX(), getY(), xd, yd); 
      
         return shot; 
      } 
   
   }
