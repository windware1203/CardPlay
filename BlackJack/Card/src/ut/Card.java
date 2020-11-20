package ut;

public class Card 
{
	private Face faces; 
   	private Suit suits; 
   	
   	//no argument constructor
   	public Card()
   	{
		this.faces = null;
		this.suits = null;
	}
   	// four-argument constructor initializes card's face and suit
 	 public Card(Face face, Suit suit)
  	 {
 	    	this.faces = face;
  	    	this.suits = suit; 
	 }
 	 public Face getFaces()
 	 {
 		 return faces;
 	 }
 	 public Suit getSuits()
 	 {
 		 return suits;
 	 }
}
