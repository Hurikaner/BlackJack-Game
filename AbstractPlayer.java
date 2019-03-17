//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;
import java.util.ArrayList;
import BlackJack.Card;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand;
   private int winCount;

   public AbstractPlayer()
   {
   		hand = new ArrayList<Card>();
   		winCount = 0;
   }

   public  void addCardToHand( Card temp )
   {
		hand.add(temp);
   }

   public  void resetHand( )
   {
		int length = hand.size();
		for(int i = hand.size()-1; i > -1; i--)
		{
			hand.remove(i);
		}
   }

   public  void setWinCount( int numwins )
   {
		winCount += numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
      int total=0;
		for(int i = 0; i < hand.size(); i++)
		{
			total += hand.get(i).getFace();
		}
      return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString();
   }
}