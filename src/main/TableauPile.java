package main;

import java.util.ArrayList;

public class TableauPile {
	private ArrayList<Card> tableauCards;
	public TableauPile(){
		tableauCards = new ArrayList<Card>();
	}
	public ArrayList<Card> getTableuCards() {
		return tableauCards;
	}
	public void setTableuCards(ArrayList<Card> tableauCards) {
		this.tableauCards = tableauCards;
	}


}
