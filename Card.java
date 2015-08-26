//COMENTARIO LEL
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
			break;
			case 2: rank= "Two";
			break;
			case 3: rank= "Three";
			break;
			case 4: rank="Four";
			break;
			case 5: rank= "Five";
			break;
			case 6: rank= "Six";
			break;
			case 7: rank= "Seven";
			break;
			case 8: rank= "Eight";
			break;
			case 9: rank= "Nine";
			break;
			case 10: rank= "Ten";
			break;
			case 11: rank= "Jack";
			break;
			case 12: rank= "Queen";
			break;
			case 13: rank= "King";
			break;
		}
		switch(this.suit){
			case 1: suit= "Clubs";
			break;
			case 2: suit= "Diamonds";
			break;
			case 3: suit= "Hearts";
			break;
			case 4: suit= "Spades";
			break;
		}
		return rank+" of "+suit;
	}
}
