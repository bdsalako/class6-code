
public class Card {
	
	private CardValue cardValue;
	private CardSuit cardSuit;
	
	public String toString(){
		return this.cardValue + " of " + this.cardSuit;
	}
	
	public CardValue getValue()
	{
		return cardValue;
	}
	
	public CardSuit getSuit()
	{
		return cardSuit;
	}
	
	Card(CardSuit cardSuit, CardValue cardValue)
	{
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}
	
	public boolean Winner(Card c)
	{	
		
		if(this.getValue().compareTo(c.getValue()) > 0)
			return true;
		
		
		if(this.getValue().compareTo(c.getValue()) < 0)
			return false;
			
		if (this.getValue().compareTo(c.getValue()) == 0)
			if(this.getSuit().compareTo(c.getSuit()) > 0)
				return true;
		
		if (this.getValue().compareTo(c.getValue()) == 0)
			if(this.getSuit().compareTo(c.getSuit()) < 0)
				return false;
		
		if (this.getValue().compareTo(c.getValue()) == 0)
			if(this.getSuit().compareTo(c.getSuit()) == 0)
				System.out.print("Same card");
					
		
		 return false;
	}

}


