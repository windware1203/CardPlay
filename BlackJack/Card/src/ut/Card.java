package ut;

public class Card 
{
	private final String face; 
   	private final String suit; 
   	
   	//no-arg constructor
   	public Card()
   	{
		this.face = "";
		this.suit = "";
	}
   	// four-argument constructor initializes card's face and suit
 	  public Card(String face, String suit, int faIval,int suIval)
  	 {
 	    	this.face = face;
  	    	this.suit = suit; 
	  }
}
