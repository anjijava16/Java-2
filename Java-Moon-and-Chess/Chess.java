/**
 * This class will be used for the practical 1 question 2
 * @author 12527157
 * @author Richard Corden
 * @version v 1.0
 * @version 1/10/13
 */
public class Chess
{
    public static void main (String args [])
       {
           double total = 0.0;
           int count=1;
           double wheat=1.0;
           
           while(count<=64)
            {
                total+=wheat;
                wheat=wheat*2;
                count++;
            }
                System.out.print("The number of pieces of wheat on the board is " + total);
                
        }
}
                   