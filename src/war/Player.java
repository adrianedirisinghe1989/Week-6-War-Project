package war;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	
	
	 int score;
	 String name;
	
	public void score() {
		score = 0;
	}
	
	public Player(String PlayerTwo) {
		name = PlayerTwo;
		score =0;
		
	}
	public void describe() {
		System.out.println("The Player has the following cards at hand:"+ this.name);
		System.out.println(" The value of this card is:"+ this.hand);
		System.out.println();
			
		}
	
		 public Card flip() {
			 return hand.remove(0);		 
	}
		 public void draw( Deck deck) {
			 hand.add(deck.draw());		 
			 
		 }
		 public void incrementScore() {
			 score ++;	 
		 } 
		 public int getScore() {
			 return score;
			 
		 }

		public List<Card> getHand() {
			return hand;
		}

		public void setHand(List<Card> hand) {
			this.hand = hand;
		}
}
