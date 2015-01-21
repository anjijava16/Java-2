import java.util.Scanner; //Import a scanner
/**
 * This class will be used for the practical 1 question 1
 * @author 12527157
 * @author Richard Corden
 * @version v 1.0
 * @version 1/10/13
 */
public class moon 
{
    public static void main (String args [])
        {
            double distance =381550000000.0; //distance to the moon in MM
            double P = 0; //Thickness of paper
            Scanner scan= new Scanner (System.in); // Create a scanner
            int counter =0; // Counts number of folds
            System.out.print("Please enter the thickness of your paper in millimeters: ");
            P=scan.nextDouble();
            
                while(P<=distance)//While the thickness of the paper is less than the distance of the moon
                    {
                        P =P*2; //Thickness doubles 
                        counter++;//adds one to the number of folds needed
                    }
            System.out.print("The number of folds needed is " + counter);
          }
}
                    