package main;

import java.util.ArrayList;
import java.util.Stack;

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
	public ArrayList<Card> coverCards(){
		ArrayList<Card> coverCardsList = new ArrayList<Card>();
		for (int i = 0; i < tableauCards.size(); i++) {
			if (tableauCards.get(i).isCovered()) {
				coverCardsList.add(tableauCards.get(i));
			}
			
		}
		return coverCardsList;
	}

	public Stack<Card> unCoverCards(){
		Stack<Card>  coverCardsList = new Stack<Card> ();
		for (int i = 0; i < tableauCards.size(); i++) {
			if (!tableauCards.get(i).isCovered()) {
				coverCardsList.add(tableauCards.get(i));
			}
			
		}
		return coverCardsList;
	}

}
