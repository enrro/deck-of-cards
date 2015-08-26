public class DeckOfCards implements DeckOfCardsInterface {

	public Card[] deck;	
	private int position;
	
	public DeckOfCards(){
		this.deck=new Card[52];
		int num=0;
		for(short j=1;j<=4;j++){
			for(short i=1;i<=13;i++){
				this.deck[num]=new Card(i,j);
				num++;
			}
		}
		num=0;
	}
	
	public void shuffle() {
		
		int rnd;
		Card temp;
		for(int i=0;i<52;i++){
			rnd= (int)(Math.random()*52);		//Genera número random entre 0 y 51
			temp= this.deck[i];				//Guarda el valor actual del naipe en un temporal
			this.deck[i]=this.deck[rnd];	//Guarda el valor de un lugar random de naipe en el lugar actual
			this.deck[rnd]=temp;				//Guarda el temporal en el lugar random
					
		}
	}

	@Override
	public int cardsLeft() {
		return position;
		
	}

	@Override
	public Card dealCard() {
		DeckOfCards dc = new DeckOfCards();
		dc.shuffle();
		
		for (int count = 0 ; count < 1 ; count ++){
			
			String tmp = dc.deck[count].toString();
			System.out.println(tmp);
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards dc = new DeckOfCards();

		for (int count = 0 ; count < 52 ; count ++){
			
			String tmp = dc.deck[count].toString();
			System.out.println(tmp);
		}
		dc.shuffle();
		System.out.println("\n despues del shufle\n");
		for (int count = 0 ; count < 52 ; count ++){
			
			String tmp = dc.deck[count].toString();
			System.out.println(tmp);
		}
	}

}