package ut;
import java.util.*;
/*
 * The rules of the card game
 * */
public class CardGameRule 
{
	private int numOfplayer;
	private int tokenTable;
	ArrayList<Player> arrPlayer = new ArrayList<Player>();
	DeckOfCard deckOfCard = new DeckOfCard();
	
	public CardGameRule()
	{
		this.numOfplayer = 0;
		this.tokenTable = 0;
		arrPlayer.clear();
	}
	public CardGameRule(int numOfPlayer)
	{
		this.numOfplayer = numOfPlayer;
		this.tokenTable = 0;
		arrPlayer.clear();
	}
	/*
	*	five doors
	*	public void fiveDoor(){}
	*/
	
	/*
	*	public void tokenCount(){}
	*	putting all token on the tokenTable
	*	And the winner will get all token from the tokenTable
	*/
	public void start()
	{
		CardGameRule go = new CardGameRule(Console.getInt("nums of players"));
	}
}
