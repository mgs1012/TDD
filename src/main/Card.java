package main;

public class Card {
	private int value;
	private Figure figure;
	public Card (int value, Figure figure){
		this.value = value;
		this.figure = figure;
	}

	public boolean equals(Card card){
		return card.getFigure() == getFigure() && card.getValue() == getValue();
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	public Figure getFigure() {
		return figure;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}

	public boolean  uncovered() {
		// TODO Auto-generated method stub
		return true;
	}

}
