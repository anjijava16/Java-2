public class Card 
{
    private String Suit;
    private int Value;
    
    public Card(int value, String suit)
    {
        Suit = suit;
        Value = value;
    }
    public int getValue()
    {
       return Value;
    }

    public String getSuit()
    {
        return Suit;
    }
}
    