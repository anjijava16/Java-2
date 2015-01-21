public class CryptoMessage

{
   public static void main()
  {
    long p,g,gmodp,key,guess,cone,ctwo,message,oneover;
    p = 24852977l;
    g =2744l;
    gmodp = 8414508l;
    key =0l;
    cone = 15268076l;
    ctwo = 743675l;
      
      for(long i=01;i<=p;i++)
      {
        guess = modPow(g,i,p); //g to power of the key, modded by the public key. 
        
        if(guess == gmodp)//If the guess equals gmodp
        {
         key = i; //The key is i 
         System.out.println("The key is: " + key);
         break;//break out of loop
        }
        
      }
      oneover = modPow(cone,p-1-key,p); //Get's 1/c1^x
      message = modMult(oneover,ctwo,p); //gets the message by doing 1/c1^x by c2 mod 29. 
      
      System.out.println("The message is: " + message);
  }
  


//Code provided by college.
 public static long modPow(long number, long power, long modulus){ 
	  //raises a number to a power with the given modulus //when raising a number to a power, the number quickly becomes too large to handle 
      //you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range 
       //however you want the algorithm to work quickly - having a multiplication loop would result in an O(n) algorithm! 
      //the trick is to use recursion - keep breaking the problem down into smaller pieces and use the modMult method to join them back together 
     if(power==0) 
       return 1; 
       else if (power%2==0)
     { 
       long halfpower=modPow(number, power/2, modulus); 
       return modMult(halfpower,halfpower,modulus); 
     }
    else
     { 
        long halfpower=modPow(number, power/2, modulus); 
        long firstbit = modMult(halfpower,halfpower,modulus); 
       return modMult(firstbit,number,modulus); 
     } 
 } 
 
 //Code provided by college.
 public static long modMult(long first, long second, long modulus){ 
   //multiplies the first number by the second number with the given modulus 
   //a long can have a maximum of 19 digits. Therefore, if you're multiplying two ten digits numbers the usual way, things will go wrong 
   //you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range 
   //however you want the algorithm to work quickly - having an addition loop would result in an O(n) algorithm! 
   //the trick is to use recursion - keep breaking down the multiplication into smaller pieces and mod each of the pieces individually 
   if(second==0) 
     return 0; 
     else if (second%2==0) { 
     long half=modMult(first, second/2, modulus); 
     return (half+half)%modulus; 
     }
     else
     { 
     long half=modMult(first, second/2, modulus); 
     return (half+half+first)%modulus; 
     } 
 } 

}
