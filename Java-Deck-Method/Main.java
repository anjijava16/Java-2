import java.util.Scanner;

public class Main
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        Deck deckone = new Deck ();
        deckone.Shuffle();
        System.out.println("How many cards do you want?");
        deckone.drawCard(scan.nextInt() );
    }
}
