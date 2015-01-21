/**
 *This class will be used for Lab 2 Question 2
 *@author 12527157
 *@author Richard Corden
 *@version v1.0
 *
 */
public class Eggpuzzle 
{
    public static void main (String args [])
        {
           int count=0;
            while(count>=0)
                {
                    count++;
                    if( (count%2==1)&(count%3==1)&(count%4==1)&(count%5==1)&(count%6==1)&(count%7==0) )
                    {
                        break;
                    }
                }
           System.out.print(count);
            }
}