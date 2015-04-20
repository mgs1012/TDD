package main;

import java.util.ArrayList;

public class MoveCardWasteToFoundationController {
	private Card card;
	private int foundationPosition;
	
	
	public MoveCardWasteToFoundationController(Card card, int foundationPosition) {
		this.card = card;
		this.foundationPosition = foundationPosition;
	}

	public Foundation getFoundation(int i) {
		ArrayList<Foundation> foundationList =new ArrayList<Foundation>(4);
		for (int j = 0; j < 4; j++) {
			foundationList.add(new Foundation());
		}
		return foundationList.get(i);
		
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public int getFoundationPosition() {
		return foundationPosition;
	}

	public void setFoundationPosition(int foundationPosition) {
		this.foundationPosition = foundationPosition;
	}

}
