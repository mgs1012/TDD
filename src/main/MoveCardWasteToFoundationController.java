package main;


public class MoveCardWasteToFoundationController {
	private Card card;
	private Foundation foundation;
	
	
	public MoveCardWasteToFoundationController(Card card, Foundation foundation) {
		this.card = card;
		this.foundation = foundation;
	}

	public Foundation getFoundation() {
		return foundation;
		
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
