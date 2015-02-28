

public class MainDriver {

	static final int HANDS = 52;
	static int round = 0;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		Card roundA, roundB; // card object to receive the return of draw
		boolean wins;		
		
		int player1_Score = 0, player2_Score = 0;
		
		while(round < 52){
			roundA = player1.draw();
			roundB = player2.draw();
		
			System.out.print("\n" + "PlayerA draws " + roundA + "\n" + "PlayerB draws " + roundB);
		
			
			wins = roundA.Winner(roundB);
		
			if(wins){
				player1_Score++;
				System.out.print("\n" +"PlayerA total score is " + player1_Score);
				System.out.print("\n" + "PlayerB total score is " + player2_Score);
			}
		
			else{
				player2_Score++;
				System.out.print("\n" +"PlayerA total score is " + player1_Score);
				System.out.print("\n" + "PlayerB total score is " + player2_Score);
			}
			round+=2; // each round removes 2 cards
		}
		
		//Final Score and Declaring the winner of the game
		System.out.printf("\n\nFinal score: Player 1--%d; Player 2--%d", player1_Score, player2_Score);
		
		if(player1_Score > player2_Score)
			System.out.print("\n\n" +"The winner is Player 1");
		else
			System.out.print("\n\n" +"The winner is Player 2");	
	}

}

