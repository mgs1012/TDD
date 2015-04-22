package controllers;

import java.util.Stack;

import entities.Card;
import entities.Foundation;

public class MoveCardController {
	
	private Stack<Card> deckStack;
	private Stack<Card> wasteStack;
	private Foundation foundation;
	
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
	
}
