   import java.awt.image.BufferedImage;
   import javax.imageio.ImageIO;
   import java.io.*;
    public class Shotgun extends Weapon
   {
       public Shotgun() throws IOException
      {
         ammo=20;
         type=2;
         max=20;
         damage=25;
         speed=1;
         recoil=5;
         image = ImageIO.read(new File("Shotgun.png"));
      }
   }