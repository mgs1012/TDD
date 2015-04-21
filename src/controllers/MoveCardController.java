package controllers;

import java.util.Stack;

import entities.Card;

public class MoveCardController {
	
	private Stack<Card> deckStack;
	private Stack<Card> wasteStack;
	
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
	
	public void moveCard(Stack<Card> stackFrom, Stack<Card> stackTo){
		stackTo.push(stackFrom.pop());
	}
}
