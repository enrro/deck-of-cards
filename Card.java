public class Card {
	private int rank;
	private int suit;
	
	public Card(){
		this.rank = 1;
		this.suit = 1;
	}
	
	public Card(short rank, short suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){
		String string_rank = "";
		String string_suit = "";
		switch(this.rank){
			case 1: 
				string_rank= "Ace";
				break;
			case 2: 
				string_rank= "Two";
				break;
			case 3: 
				string_rank= "Three";
				break;
			case 4: 
				string_rank="Four";
				break;
			case 5: 
				string_rank= "Five";
				break;
			case 6: 
				string_rank= "Six";
				break;
			case 7: 
				string_rank= "Seven";
				break;
			case 8: 
				string_rank= "Eight";
				break;
			case 9: 
				string_rank= "Nine";
				break;
			case 10: 
				string_rank= "Ten";
				break;
			case 11: 
				string_rank= "Jack";
				break;
			case 12: 
				string_rank= "Queen";
				break;
			case 13: 
				string_rank= "King";
				break;
			default:
				string_rank = "cosa";
		}
		switch(this.suit){
<<<<<<< HEAD
			case 1: suit= "Clubs";
			case 2: suit= "Diamonds";
			case 3: suit= "Hearts";
			case 4: suit= "Spades";
			case 5: suit= "rofl";
			case 6: suit= "stack";
			case 7: suit= "adt";
=======
			case 1: 
				string_suit= "Clubs";
				break;
			case 2: 
				string_suit= "Diamonds";
				break;
			case 3: 
				string_suit= "Hearts";
				break;
			case 4: 
				string_suit= "Spades";
				break;
			default:
				string_suit = "cosa";
				break;
>>>>>>> origin/master
		}
		return string_rank+" of "+ string_suit;
	}
}
