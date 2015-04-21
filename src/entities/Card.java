package entities;

public class Card {
	private int value;
	private Figure figure;
	private boolean isCovered;
	
	public Card (int value, Figure figure){
		this.value = value;
		this.figure = figure;
		this.isCovered = true;
	}

	public boolean isCovered() {
		return isCovered;
	}

	public void setCovered(boolean isCovered) {
		this.isCovered = isCovered;
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
	public String toString() {
		return "Carta: " + value + " " + figure.toString();
	}

}
