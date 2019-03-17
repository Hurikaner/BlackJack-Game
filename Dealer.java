//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;

public class Dealer extends AbstractPlayer
{
	Deck deck = new Deck();
	
	public Dealer()
	{
	}
	
	public void shuffle()
	{
		deck.shuffle();
	}
	
	public Card deal()
	{
		return deck.nextCard();
	}
	
	public boolean hit()
	{
		if (super.getHandValue()<=16)
		{
			return true;
		}
		return false;
	}
}





	//constructors





	//method to shuffle






	//method to deal a card





	//hit method goes here
