import java.util.Scanner;
public class CoinFlip
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter how many times player one will flip the coin: ");
        int player1 = scan.nextInt();
        
        System.out.println("Enter how many times player two will flip the coin: ");
        int player2 = scan.nextInt();
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
        int perm1 = player1;
        int perm2 = player2;
        
        int count1 = 0, count2 =0;
        
        int wins = 0, lost = 0;
        for(int i=0;i<1000000;i++)
        {
            player1 = perm1;
            player2 = perm2;
            count1 = 0;
            count2 =0;
            for(int x=0;x<player1;x++)
            {
                coin1.flip();
                if(coin1.getSide() == 0)
                {
                    count1 ++;
                }
            }
             for(int y=0;y<player2;y++)
            {
                coin2.flip();
                if(coin2.getSide() == 0)
                {
                    count2 ++;
                }
            }
            if(count1>count2)
            {
                wins++;
            }
            if(count1<count2)
            {
                lost++;
            }
        }
        System.out.println("Player 1 won " + wins + " games");
        System.out.println("Player 2 won " + lost+ " games");
        System.out.println("Player 1 had a " + (double)(wins*100)/(wins + lost) + "% chance of winning");
        
        
        
    }
}