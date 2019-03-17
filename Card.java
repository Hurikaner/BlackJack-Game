//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	public Card()
  	{
  		suit = "";
  		face = 0;
  	}
  	
  	public Card(String s)
  	{
  		suit = s;
  		face = 0;
  	}
  	
  	public Card(int f)
  	{
  		suit = "";
  		face = f;
  	}
  	
  	public Card(int f, String s)
  	{
  		suit = s;
  		face = f;
  	}

  	public String getSuit()
  	{
  		return suit;
  	}
  	
  	public int getFace()
  	{
  		return face;
  	}
	
	public void setSuit(String s)
	{
		suit = s;
	}

	public void setFace(int f)
	{
		face = f;
	}

  	public abstract int getValue();

	public boolean equals(Object obj)
	{
		Card card = (Card)obj;
		if(getSuit().equals(card.getSuit())&&getFace()==(card.getFace()))
		{
			return true;
		}
		return false;
	}

  	public String toString()
  	{
  		return FACES[face] + " of " + getSuit() + " | value = " + getValue();
  	}
  	
 }