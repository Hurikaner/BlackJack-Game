//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package BlackJack;
import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	private Player player;
	private Dealer dealer;

	public BlackJack()
	{
		player = new Player();
		dealer = new Dealer();
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "Y";
		do
		{
			dealer.resetHand();
			player.resetHand();
			dealer.shuffle();
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
			out.println("Current hand : " + player);
			while(player.hit()==true)
			{
				player.addCardToHand(dealer.deal());
				out.println("PLAYER /nHand Value :: " + player.getHandValue() + "/nHand size :: " + player.getHandSize());
				out.println(player);
			}
			out.println(dealer);
			while(dealer.hit()==true)
			{
				dealer.addCardToHand(dealer.deal());
				out.println("DEALER /nHand Value :: " + dealer.getHandValue() + "/nHand size :: " + dealer.getHandSize());
				out.println(dealer);
			}
			if(player.getHandValue()>dealer.getHandValue()&&player.getHandValue()<21)
			{
				player.setWinCount(1);
				out.println("Player has bigger hand value!");
			}
			else
			{
				dealer.setWinCount(1);
				out.println("Dealer has bigger hand value!");
			}
			out.println("Dealer has won " + dealer.getWinCount() + " times /nPlayer has won " + player.getWinCount() + " times");
			out.println("Do you want to play again? [Y,y,N,n] :: ");
			choice = keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
		
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}