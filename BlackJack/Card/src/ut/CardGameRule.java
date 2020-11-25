package ut;
import java.util.*;
/*
 * The rules of the card game
 * */
public class CardGameRule 
{
	private int numOfplayer;
	ArrayList<Player> arrPlayer = new ArrayList<Player>();
	
	public CardGameRule()
	{
		numOfplayer = 0;
		arrPlayer.clear();
	}
	public CardGameRule(int numOfPlayer)
	{
		this.numOfplayer = numOfPlayer;
		arrPlayer.clear();
	}
	public void start()
	{
		CardGameRule go = new CardGameRule(Console.getInt("nums of players"));
	}
}
