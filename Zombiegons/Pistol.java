   import java.awt.image.BufferedImage;
   import javax.imageio.ImageIO;
   import java.io.*;

public class Pistol extends Weapon
   {
       public Pistol()
      {
         ammo=50;
         max=50;
         type=1;
         damage=20;
         speed=2;
         recoil=0;
         //image = ImageIO.read(new File("Pistol.png"));
      
      }
   }
