package ut;
import java.util.*;
/*
 * The rules of the card game
 * */
public class CardGameRule 
{
	private int numOfplayer;
	private int tokenContainer;
	ArrayList<Player> arrPlayer = new ArrayList<Player>();
	DeckOfCard deckOfCard = new DeckOfCard();
	public CardGameRule()
	{
		this.numOfplayer = 0;
		this.tokenContainer = 0;
		arrPlayer.clear();
	}
	public CardGameRule(int numOfPlayer)
	{
		this.numOfplayer = numOfPlayer;
		this.tokenContainer = 0;
		arrPlayer.clear();
	}
	public void start()
	{
		CardGameRule go = new CardGameRule(Console.getInt("nums of players"));
	}
}
