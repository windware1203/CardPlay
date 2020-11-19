package ut;
public class Player 
{
	private String name;
	private int numOfWins;
	private int token;
	
	public void Player()
	{
		this.name = "";
		this.numOfWins = 0;
		this.token = 0;
	}
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
	public int getNumOfWins()
	{
		return numOfWins;
	}
	public void setToken(int token)
	{
		this.token = token;
	}
	public int getToken()
	{
		return token;
	}
}
