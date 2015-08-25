
public class DeckOfCards implements DeckOfCardsInterface {

	private Card[] deck;	
	private int position;
	
	public DeckOfCards(){
		this.deck=new Card[52];
		int num=0;
		for(short j=0;j<4;j++){
			for(short i=0;i<13;i++){
				this.deck[num]=new Card(i,j);		//falta el hacer el constructor de la carta para aceptar los argumentos
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
		return this.deck.length - this.position;
	}

	@Override
	public Card dealCard() {
		this.position++;
		return this.deck[this.position];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
