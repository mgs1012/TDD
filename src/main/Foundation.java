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
		return (card.getValue() ==1 && isEmpty()) ||
				(getLastCard().getValue()+1==card.getValue()
				&& getLastCard().getFigure()== card.getFigure()) ;

	}

	public Card getLastCard() {
		return foundationCards.lastElement();
	}

	public boolean isCompleted() {
		return foundationCards.size() == 13;
	}
	public boolean isEmpty(){
		return foundationCards.isEmpty();
	}

	public int getSizeFundation() {
		return foundationCards.size();
	}
	public void addCard(Card card){
		foundationCards.add(card);
	}

}
