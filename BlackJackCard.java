//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;

public class BlackJackCard extends Card
{
  	public BlackJackCard()
  	{
  		super();
  	}

	public BlackJackCard(int f)
	{
		super(f);
	}
	
	public BlackJackCard(String s)
	{
		super(s);
	}
	
	public BlackJackCard(int f, String s)
	{
		super(f,s);
	}

  	public int getValue()
  	{
  		if(super.getFace() == 1)
  		{
  			return 11;
  		}
  		if(super.getFace() >= 10)
  		{
  			return 10;
  		}
		return super.getFace();
  	}
  	
 }