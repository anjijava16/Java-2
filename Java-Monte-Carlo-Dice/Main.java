/**
 * @author 12527157
 * @version v1.0
 * @version 18/10/13
 */
public class Main 
    {
        public static void main (String args [])
        {
            Dice [] DiceArray = new Dice [5];
            int [] Totals = new int [26];
            
            DiceArray[0] = new Dice ();
            DiceArray[1] = new Dice ();
            DiceArray[2] = new Dice ();
            DiceArray[3] = new Dice ();
            DiceArray[4] = new Dice ();
            
            int total = 0;
            for(int i=0;i<1000000;i++)
            {
              DiceArray[0].roll();
              DiceArray[1].roll();
              DiceArray[2].roll();
              DiceArray[3].roll();
              DiceArray[4].roll();
             
             total=(DiceArray[0].getValue()+ DiceArray[1].getValue()+ DiceArray[2].getValue()+DiceArray[3].getValue()+DiceArray[4].getValue());  
                
           
                
                
               Totals[total-5]+=1;
            }
            for(int i=0;i<=Totals.length-1;i++)
            {
                System.out.println(Totals[i]);
            }
        }
    }