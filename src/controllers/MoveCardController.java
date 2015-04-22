package controllers;

import java.util.Stack;

import entities.Card;
import entities.Foundation;
import entities.TableauPile;

public class MoveCardController {
	
	private Stack<Card> deckStack;
	private Stack<Card> wasteStack;
	private Foundation foundation;
	private Stack<Card> tableau;
	private Card card;
		
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
	
	public int getFoundationSize() {
		return foundation.getSizeFundation();
	}
	
	public int getTableauSize() {
		return tableau.size();
	}

	public Foundation getFoundation() {
		this.foundation = new Foundation();
		return foundation;
	}

	public boolean isValidMove(Stack<Card> tableau, Foundation foundation2) {
		return foundation2.isValidCard(tableau.lastElement());
	}
	
	public Stack<Card> getTableau() {
		return this.tableau;
	}
	
	public Card getCard(){
		return this.card;
	}
	public void setCard(Card card) {
		this.card = card;
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
	
	public void moveCardTableauToFoundation(Stack<Card> tableau ,Foundation foundation){
		this.foundation = foundation;
		this.tableau = tableau;
		if(tableau.size()>0){
			Card card = tableau.lastElement();
			if(foundation.isValidCard(card)){
				foundation.addCard(card);
				tableau.removeElementAt(tableau.size()-1);
			}
		}
	}
	
	public void moveCardWasteToFoundation(Card card, Foundation foundation){
		this.card = card;
		this.foundation = foundation;
		if(isValidMove()){
			if(foundation.isEmpty())
				foundation.setFigure(card.getFigure());
			foundation.addCard(card);
		}
	}
		
		private boolean isValidMove() {
			return (card.getValue() ==1 && foundation.isEmpty()) ||
					(foundation.getLastCard().getValue()+1==card.getValue()
					&& foundation.getFigure()== card.getFigure()) ;
		}

}
