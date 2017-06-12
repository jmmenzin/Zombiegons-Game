   import java.awt.image.BufferedImage;
   import javax.imageio.ImageIO;
   import java.io.*;
   public class Grenade extends Weapon
   {
       public Grenade() throws IOException
      {
         ammo=3;
         max=3;
         type=3;
         damage=50;
         speed=1;
         recoil=0;
         image = ImageIO.read(new File("Grenade.png"));
      }
   }
