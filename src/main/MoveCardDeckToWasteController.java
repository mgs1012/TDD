package main;

import java.util.ArrayList;

public class MoveCardDeckToWasteController {

	public MoveCardDeckToWasteController(ArrayList<Card> deckCards) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Card> getWaste() {
		ArrayList<Card> wasteCards = new ArrayList<Card>();
		for (int i = 0; i < 3; i++) {
			wasteCards.add(new Card(i, Figure.DIAMONDS));
		}
		return wasteCards;
	}

}
