

import java.util.ArrayList;

public class Hand {
	
	ArrayList<Card> cards;
	int number;
	
	public Hand(){
		this.cards = new ArrayList<Card>();
		this.number = 0;
	}
	
	public ArrayList<Card> getCards() {
		 
		 return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		
		this.cards = cards;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
