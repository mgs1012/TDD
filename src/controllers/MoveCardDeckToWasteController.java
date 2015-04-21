package controllers;

import java.util.Stack;

import entities.Card;

public class MoveCardDeckToWasteController{

	private Stack<Card> wasteCards;
	private Stack<Card> deckCards;
	
	public MoveCardDeckToWasteController(Stack<Card> deckCards) {
		this.deckCards = deckCards;
		this.wasteCards = new Stack<Card>();
		for (int i = 0; i < 3; i++) {
			if(!deckCards.isEmpty()){
				Card card = deckCards.pop();
				card.setCovered(false);
				wasteCards.add(card);
			}
		}
	}

	public Stack<Card> getWaste() {
		return wasteCards;
	}
	public Stack<Card> getDeckCards(){
		return deckCards;
	}


}
