   import java.awt.image.BufferedImage;

public class Weapon
   {
      public int ammo;
      public int damage;
      public int speed;
      public int recoil;
      public int max;
      public int type;
      public BufferedImage image;
      public int x;
      public int y;
       public Weapon()
      {
      }
       public Weapon(int newX,int newY)
      {
         x=newX;
         y=newY;
      }
       public Weapon(int a, int d, int s, int r)
      {
         ammo=a;
         damage=d;
         speed=s;
         recoil = r;
      }
       public int getAmmo()
      {
         return ammo;
      }
       public void setCoord(int newx, int newy)
      {
         x=newx;
         y=newy;
      }
       public BufferedImage getImage()
      {
         return image;
      }
       public void maxAmmo()
      {
         ammo=max;
      }
       public void useAmmo()
      {
         ammo--;
      }
       public void setAmmo(int a)
      {
         ammo=a;
      }
       public int getSpeed()
      {
         return speed;
      }
       public int getDamage()
      {
         return damage;
      }
   }
