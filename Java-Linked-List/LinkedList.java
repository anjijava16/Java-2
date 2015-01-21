import java.util.*;
public class LinkedList
{
    private Link first;
    private Link tail;
    public LinkedList()
    {
        first = null;
    }
    public void insertTail(String inString)
    {
        if(first == null)
        {
            first = new Link(inString);
            
        }
        else
        {
            if(tail == null)
            {
                tail = first;
            }
            Link newLink = new Link(inString);
            tail.next = newLink;
            tail = newLink;
        
        }
    }
    public Link deleteHead()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void Display()
    {
      Link current = first;
      while(current!=null)
      {
         System.out.print(current.data + " ");
         current = current.next;
      }
    }
}