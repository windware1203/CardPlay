package ut;
public class Player 
{
	private String name;
	private int numOfWins;
	private int token;
	
	public void Player(String name)
	{
		this.name = name;
		this.numOfWins = 0;
		this.token = 0;
	}
	
	public String getName()
	{
		return name;
	}
	public void setNumOfWins(int num)
	{
		this.numOfWins = num;
	}
}
