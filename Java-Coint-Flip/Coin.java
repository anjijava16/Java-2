public class Coin
{
   private int side = 0;
   
   public Coin()
   {
       side = 0;
   }
   public void flip ()
   {
       side = (int)(Math.random()*2);
   }
   public int getSide()
   {
       return side;
   }
}
