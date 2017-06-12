   public class CircleZombie extends Character
   {
      public int health = 50;
      public int speed = 5;
      public int x;
      public int y;
       public CircleZombie(int newX, int newY)
      {
         x=newX;
         y=newY;
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
       public int damage(int hit)
      {
      //Lowers health by hit and returns new health
         health -= hit;
         return health;
      }
   }
