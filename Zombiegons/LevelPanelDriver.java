   import javax.swing.JFrame;
   public class LevelPanelDriver
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Zombiegons");
         frame.setSize(800,600);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new LevelPanel());
         frame.setVisible(true);
      }
   }