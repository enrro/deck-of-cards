import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestOfGame extends DeckOfCards{
	static DeckOfCards my_deck=new DeckOfCards();
	
	//Menu options
	public static String Menu(BufferedReader br) throws Exception{ 
        System.out.println("Please, chose one option");
        System.out.println("1) Shuffle");
        System.out.println("2) Show number of cards");
        System.out.println("3) Give me a card");
        System.out.println("4) Show all cards");
        System.out.println("5) Exit");
  
        String option = br.readLine();
        return option;
   }
	
	//Main
	public static void main(String[]args) throws Exception{
		//Init 
	    InputStreamReader isr = new  InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(isr);
	    
	   //Welcome message
	    System.out.println("HI, Please write your name");
	    String name_player = br.readLine();
	    System.out.println("Hello "+name_player);
	    String menu_option = Menu(br);
	    
	    //conditions (what to do)
	    while(menu_option.equals("5") == false){

	        if(menu_option.equals("1")){
	            
	            my_deck.shuffle();
	 		    menu_option = Menu(br);
	 		    
	 		}
	 				
	 		else if(menu_option.equals("2")){
	 			System.out.println("the number of cards is: ");
	 			my_deck.cardsLeft();
	 			menu_option = Menu(br);
	 		}
	        
	 		else if(menu_option.equals("3")){
	 			my_deck.dealCard();
	 			menu_option = Menu(br);
	 		}
	        
	 		
	 		else{
	 		menu_option = Menu(br);
	 		}
	 		
	 	}

	}
}
