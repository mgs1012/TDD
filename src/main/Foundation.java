package main;

import java.util.Stack;

public class Foundation {
	private Figure figure;
	
	private Stack<Card> foundationCards;

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
		return foundationCards.isEmpty();
	}

	public int getSizeFundation() {
		return foundationCards.size();
	}

}
