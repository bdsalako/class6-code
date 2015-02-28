
import java.util.Random;


public class Deck
{	
	private Card[] deck = new Card[52];
	
	public Deck() {
		
		
		int i = 0; 
		
		for(CardSuit suit : CardSuit.values() ){     
			for(CardValue value : CardValue.values()){
				deck[i] = new Card(suit, value); 
				i++;
			}	
		}		
}
	
//to verify is a card is used	
public boolean verifier(Card c){
	Card[] is_it_used_Card = new Card[52];
	for(int i =0; i< 52; i++){
		if(c.equals(is_it_used_Card[i])){
			is_it_used_Card[i+1] = c;
			return true;
		}
	}
		
	
	return false;
}

public Card draw() {
		
	int index =0;
		
	for (int i = 0; i < deck.length; i++) {
		 index = (int)(Math.random() * deck.length);
		 Card temp = deck[i];
		 deck[i] = deck[index];
		 deck[index] = temp;
		 
	 }
		
	return deck[index];

}
}
