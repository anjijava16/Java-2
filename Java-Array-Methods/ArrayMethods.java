/**
 * 
 * @author Rcorden
 * @version v1.0
 */
 
public class ArrayMethods
{
  public static void main (String args [])
  {
      int x=0,y=0,z=0;
  }

/** 
 * This method creates an array with a 100 int values and fills these arrays from 0 to 99
 * 
 * @ param args a string that does nothing.
 * @ return none.
 */
    public static void makeIntArray ()
    {
       int [] NewArray = new int[100]; // Creates a new array, array can hold 100 integers
       int number=0;
       while (number<100)//While loop, while number less that 100, add one to number after each loop
       {
           NewArray[number] = number; //Position at number in the array equals number. 
           number++;
           
    }
}
/** This is the double array method
 * Make an int that creates a double array
 * @param none
 * @return none
 */
public static void makeDoubleArray()
{
double [] NewArray= new double[100];
int number= 1,counter=0;
while(number<101) //while number less than 101
{
NewArray[counter]=number; // poistion at counter equals number
System.out.print(NewArray[counter]+" "); //print out number at poistion of counter, i.e number, and a space
number++; // add one to 100
counter++; //add one to count

}
}
/** This is the printArray method
 * Print out the contents  of the array to the screen
 * @ param none
 * @ return none
 */
   public static void printArray()
   {
       int[] datalist={12,223,232,434,1433,0,-34,14,43,544};
       int counter =0;
       while (counter<datalist.length) // while counter is less than the length of the array
       {
           System.out.print(datalist[counter] + " " ); //System print out number at position of counter
           counter++; //add one to counter
        }
    }
/** Question four
 * This method should double the contents of each cell in question Three.
 * @param none
 * @return none
 */
public static void doubleArrayContents()
{
    int[] datalist ={12,223,232,434,1433,0,-34,14,43,544};
    int counter =0;
    while  (counter<datalist.length)// while counter is less than the length of the array
    {
        datalist[counter]=datalist[counter]*2; //position at counter is equal to number at count times two
        System.out.print(datalist[counter] + " " ); //print out number at counter
        counter++; //add one to counter
    }
}

/**Question Five
 *
 * This method should find and return the largest int value in the array.
 * @param
 * @return
 */
public static int linearSearhForLargest()
{
int [] datalist={12,223,232,434,1433,0,-34,14,43,544,103,103423,32432,235,23552};
int counter=0,result=0,number=0;
while (counter<datalist.length) // while counter is less than the array length
{
number=datalist[counter]; // number = number at poistion of counter
if(number>result) // if number at poistion of counter is bigger than result
{
result=number; // result is equal to number
counter++; // add one to counter
}
else // if number at poistion of counter is less than result
{
counter++; //add one to counter
}
}
return result;
}

/** Question Six
 * To search the contents of the array to see if the target value can be found in the array.
 * 
 * @parm target number
 * @return the index of the target number
 */
public static int arrayContainsValue(int target)
{
int [] myArray={12,223,232,434,1433,0,-34,14,43,544,234,876,1343};
int look=0;
for(int i=0; i<myArray.length;i++) //initialize int i equal to 0, i less than array length, add one to i
{
if(myArray [i]==target) // if number at poistion i equals target vaule 
{
    look=1; // look equals 1
    break;
}
else // if tagert value is not in array
{
    look=-1; //look equals -1
}
}
return look;
}

/** Question Seven
 * Your method should count the number of times that target was found in the array and the method should return this number.
 * @param target number
 * @return count
 */
public static int countOcurance(int target)
{
int[] myArray={12,223,232,434,1433,0,-34,14,43,544,234,876,1343,12,78,12};
int count=0;
for(int i=0;i<myArray.length;i++)
{if(target ==myArray[i])
{
count++;
}
}
return count;
}
}