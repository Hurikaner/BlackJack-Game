//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;
import static java.lang.System.*;
import java.util.Scanner;

public class Player extends AbstractPlayer
{
	public Player()
	{
	}

	public boolean hit()
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Hit?");
		if(keyboard.next().equals("y")||keyboard.next().equals("Y"))
		{
			return true;
		}
		return false;
	}
}



	//constructors





	//hit method goes here

