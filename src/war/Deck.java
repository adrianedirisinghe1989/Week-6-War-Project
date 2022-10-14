package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>(); 
	
	public List<Card> getCards(){
		return cards;
	}
	
	public void setCards(List<Card>cards) {
		this.cards= cards;
	}
	
	public Deck() {

		buildDeck(cards);
	}

	private List<Card> createSuits(int value, String suit){
		List<Card> cardSuits= new ArrayList<Card>();
		
		for(int i=0; i<4; i++) {
			Card newCard = new Card();
			newCard.setValue(value);
			
			if(i==0) {
				newCard.setName(suit+ "of Spades");
				cardSuits.add(newCard);
			}else if(i==1) {
				newCard.setName(suit+ "of Diamonds");
				cardSuits.add(newCard);
			}else if(i==2) {
				newCard.setName(suit+ "of Hearts");
				cardSuits.add(newCard);
			}else if(i==3) {
				newCard.setName(suit+ "of Clubs");
				cardSuits.add(newCard);
			
			}		
	}
		return cardSuits;	
}
	private void buildDeck(List<Card>cards) {
		for( int i=2; i<=14; i++) {
			
			if(i==2) {
				cards.addAll(createSuits(i,"Two"));
			}else if( i==3) {
				cards.addAll(createSuits(i,"Three"));
			}else if( i==4) {
				cards.addAll(createSuits(i,"Four"));
			}else if( i==5) {
				cards.addAll(createSuits(i,"Five"));
			}else if (i==6) {
				cards.addAll(createSuits(i,"Six"));
			}else if (i==7) {
				cards.addAll(createSuits(i,"Seven"));
			}else if (i==8) {
				cards.addAll(createSuits(i,"Eight"));
			}else if (i==9) {
			cards.addAll(createSuits(i,"Nine"));
			}else if (i==10) {
				cards.addAll(createSuits(i,"Ten"));
			}else if (i==11) {
				cards.addAll(createSuits(i,"Jack"));
			}else if (i==12) {
				cards.addAll(createSuits(i,"Queen"));
			}else if (i==13) {
				cards.addAll(createSuits(i,"King"));
			}else if (i==14) {
				cards.addAll(createSuits(i,"Ace"));
			}

		}	
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
//		Card drawnCard = cards.get(0);
//		cards.remove(drawnCard);
//		return drawnCard;
		
		Card drawTopCard = new Card();
		if(cards.size()==0) {
			System.out.println("The Deck is Empty");
			return null;
		}else {
			drawTopCard = cards.get(0);
			cards.remove(0);
			return drawTopCard;
		}
	
	}
}
