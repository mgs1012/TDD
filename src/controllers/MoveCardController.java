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

}
