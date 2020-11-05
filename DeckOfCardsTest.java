//v.3
public class DeckOfCardsTest
{
   // execute application
   public static void main(String[] args)
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      // print all 52 Cards in the order in which they are dealt
      for (int i = 1; i <= 52; i++)
      {
         // deal and display a Card
    	 if(i == 1)
    		 System.out.println("Cards of player one:");
         System.out.printf("%-19s", myDeckOfCards.dealCard());
		 if (i % 4 == 0) // output a newline after every fourth card
		    System.out.println();
		 if(i == 27)
		 {
			 System.out.println("");
			 System.out.println("Cards of player two:");
		 }
      }
      if(myDeckOfCards.whoWinsTheGame)
    	  System.out.println("Winner : player one");
      else
    	  System.out.println("Winner : player two");
   } 
} // end class DeckOfCardsTest


