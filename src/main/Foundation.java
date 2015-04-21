package main;

import java.util.Stack;

public class Foundation {
	private Figure figure;
	
	private Stack<Card> foundationCards;
	public Foundation(){
		foundationCards = new Stack<Card>();
	}

	public Figure getFigure() {
		return figure;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}

	public boolean isValidCard(Card card) {
		return true;
		
	}

	public Card getLastCard() {
		return new Card(1,Figure.DIAMONDS);
	}

	public boolean isCompleted() {
		return foundationCards.size() == 13;
	}
	public boolean isEmpty(){
		return foundationCards.isEmpty();
	}

	public int getSizeFundation() {
		return 1;
	}
	public void addCard(Card card){
		foundationCards.add(card);
	}

}
