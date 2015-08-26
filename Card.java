
public class Card {
	private short rank,
				  suit;
	
	public Card(){
		this.rank = 1;
		this.suit = 1;
	}
	
	public Card(short rank, short suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){
		String rank = "";
		String suit = "";
		switch(this.rank){
			case 1: rank= "Ace";
			case 2: rank= "Two";
			case 3: rank= "Three";
			case 4: rank="Four";
			case 5: rank= "Five";
			case 6: rank= "Six";
			case 7: rank= "Seven";
			case 8: rank= "Eight";
			case 9: rank= "Nine";
			case 10: rank= "Ten";
			case 11: rank= "Jack";
			case 12: rank= "Queen";
			case 13: rank= "King";
		}
		switch(this.suit){
			case 1: suit= "Clubs";
			case 2: suit= "Diamonds";
			case 3: suit= "Hearts";
			case 4: suit= "Spades";
			case 5: suit= "rofl";
		}
		return rank+" of "+suit;
	}
}
