package ut;
/*
 *	the suit of the card
 */
public enum Suit 
{
	Clubs,Diamonds,Hearts,Spades;
	public Suit getsuit(int i)
	{

        switch(i){
            case 1: return Clubs;
            case 2: return Diamonds;
            case 3: return Hearts;
            case 4: return Spades;
            default: return null;
        }

    }
}
