// Card class represents a playing card.
//v.3
public class Card 
{
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)
   private int faIval;
   private int suIval;
   //no-arg constructor
   public Card()
   {
		this.face = "";
		this.suit = ""; 
		this.faIval = 0;
		this.suIval = 0;
   }
   // four-argument constructor initializes card's face and suit
   public Card(String face, String suit, int faIval,int suIval)
   {
      this.face = face;
      this.suit = suit; 
      this.faIval = faIval;
      this.suIval = suIval;
   } 
   public int getfaIval()
   {
	   return faIval;
   }
   public int getsuIval()
   {
	   return suIval;
   }
   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } 
} // end class Card

