   import java.awt.image.BufferedImage;
   import javax.imageio.ImageIO;
   import java.io.*;
    public class MachineGun extends Weapon
   {
       public MachineGun() throws IOException
      {
         ammo=100;
         type=1;
         max=100;
         damage=15;
         speed=5;
         recoil=2;
         image = ImageIO.read(new File("MachineGun.png"));
      }
   }