public class Deck 
{
    private Card [] deck = new Card [52];

    public Deck()
    {
        for(int x=0; x<52; x++)
        {
            if(x<13)
            {
                deck[x] = new Card(x+1, "Clubs");
            }
            else if( (x>=13)&&(x<26) )
            {
                deck[x] = new Card(x-12, "Spades");
            }
            else if( (x>=26)&&(x<39) )
            {
                deck[x] = new Card(x-25, "Hearts");
            }
            else if( (x>=39) && (x<52) )
            {
                deck[x] = new Card(x-38, "Diamonds");
            }
            
        }
    }
    
    
    public void Shuffle()
    {
        Card temp = new Card (1,"aa");
        
        for(int i=0;i<52;i++)
        {
           int r = (int)( Math.random()*52);
           temp = deck[i];
           deck[i] = deck[r];
           deck[r] = temp;
        }
    
    }
    public void drawCard(int num)
    {
        for(int i=0;i<num;i++)
        {
        if(deck[i].getValue() == 1)
        {
            System.out.println("Ace of" + " " + deck[i].getSuit() );
        }
        else if(deck[i].getValue() == 11)
        {
            System.out.println("Jack of" + " " + deck[i].getSuit() );
        }
        else if(deck[i].getValue() == 12)
        {
            System.out.println("Queen of" +  " " + deck[i].getSuit() );
        }
        else if(deck[i].getValue() == 13)
        {
            System.out.println("King of" + " " + deck[i].getSuit() );
        }
        else
        {
        System.out.println(deck[i].getValue() +" of " + deck[i].getSuit() );
        }
    }
   }
}
