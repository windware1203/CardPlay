package ut;

public enum Face //the face of the card
{
	Ace,Deuce,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King;
	public   Face getface(int i)
	{

        switch(i)
        {
            case 1: return Ace;
            case 2: return Deuce;
            case 3: return Three;
            case 4: return Four;
            case 5: return Five;
            case 6: return Six;
            case 7: return Seven;
            case 8: return Eight;
            case 9: return Nine;
            case 10: return Ten;
            case 11: return Jack;
            case 12: return Queen;
            case 13: return King;
            default: return null;
        }

    }
}