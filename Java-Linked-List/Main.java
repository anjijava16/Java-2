import java.util.Scanner;
public class Main
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner(System.in);
        String command = "";
        
        LinkedList link = new LinkedList();
        while(!command.equals("quit") )
        {
          System.out.println("Do you want to insert,remove,display or quit?");
          command=scan.nextLine();
          
          if(command.equals("insert") )
          {
              System.out.println("Enter a word to insert: ");
              String inString = scan.nextLine();
              link.insertTail(inString); 
              System.out.println();
          }
          else if(command.equals("remove") )
          {
             link.deleteHead();
             System.out.println();
          }
          else if(command.equals("display") )
          {
           link.Display();
           System.out.println();
          }
        }
    }
}
