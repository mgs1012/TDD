package main;

import java.util.ArrayList;

public class Foundation {
	private Figure figure;
	
	private ArrayList<Card> foundationCards;

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
		// TODO Auto-generated method stub
		return new Card(1,Figure.DIAMONDS);
	}

	public boolean isCompleted() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getSizeFundation() {
		return foundationCards.size();
	}

}
