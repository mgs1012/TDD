package controllers;

import java.util.Stack;

import entities.Card;
import entities.Foundation;
import entities.TableauPile;

public class MoveCardController {
	
	private Stack<Card> deckStack;
	private Stack<Card> wasteStack;
	private Foundation foundation;
	private TableauPile tableauPile;
		
	public MoveCardController(Stack<Card> deckStack,Stack<Card> wasteStack ){
		
		this.deckStack = deckStack;
		this.wasteStack = wasteStack;
		
	}

	public Stack<Card> getDeckStack() {
		return deckStack;
	}

	public Stack<Card> getWasteStack() {
		return wasteStack;
	}
	
	protected Foundation getFoundation(){
		return this.foundation;
	}
	protected TableauPile getTableauPile() {
		return this.tableauPile;
	}

	public void moveCardDeckToWasteController(Stack<Card> deckCards) {
		this.deckStack = deckCards;
		this.wasteStack = new Stack<Card>();
		for (int i = 0; i < 3; i++) {
			if(!deckCards.isEmpty()){
				Card card = deckCards.pop();
				card.setCovered(false);
				wasteStack.add(card);
			}
		}
	}
}
