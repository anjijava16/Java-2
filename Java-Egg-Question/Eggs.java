import java.util.Scanner; 
/**
 *This class will be used for Lab 2 Question 1
 *@author 12527157
 *@author Richard Corden
 *@version v1.0
 *
 */
public class Eggs
    {
        public static void main (String args [])
            {
                Scanner scan = new Scanner(System.in);
                int Eggs=0,Gross=0,Dozen=0,Single=0,temp=0;
                System.out.print("Please enter the number of eggs you have: ");
                Eggs=scan.nextInt();
                
                Gross=Eggs/144; //Gets the number of gross by dividing by 144 
                temp=Eggs%144;  //Mod leaves the remaining eggs
                Dozen=temp/12;  //Gets the number of dozen by dividing by 12
                Single=temp%12; //Mod 12 will show how many single eggs are left
               
                System.out.print("You have " + Gross + " gross, "+Dozen + " dozen and " +Single+" single eggs");
            }
        }
               
