/**
 * @author 12527157
 * @version v1.0
 * @version 18/10/13
 */
public class Dice 
{
        private int DiceTotal = 0;
        
        public Dice()
        {
            DiceTotal = 0;
        }
        
        public void roll()
        {
            DiceTotal = (int)((Math.random()*6)+1); 
        }
        
        public int getValue()
        {
           return DiceTotal;
        }
}