package main;

import java.util.ArrayList;

public class MoveCardWasteToFoundationController {
	private Card card;
	private Foundation foundation;
	
	
	public MoveCardWasteToFoundationController(Card card, Foundation foundation) {
		this.card = card;
		this.foundation = foundation;
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

	public Foundation getFoundation() {
		return foundation;
	}

	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}

}
