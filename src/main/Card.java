package main;

public class Card {
	private int value;
	private String colour;
	public Card (int value, String colour){
		this.value = value;
		this.colour = colour;
	}

	public boolean equals(Card card){
		return card.getColour() == getColour() && card.getValue() == getValue();
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean  uncovered() {
		// TODO Auto-generated method stub
		return true;
	}

}
