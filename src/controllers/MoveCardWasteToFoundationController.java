package controllers;

import entities.Card;
import entities.Foundation;


public class MoveCardWasteToFoundationController {
	private Card card;
	private Foundation foundation;


	public MoveCardWasteToFoundationController(Card card, Foundation foundation) {
		this.card = card;
		this.foundation = foundation;
		if(isValidMove()){
			if(foundation.isEmpty())
				foundation.setFigure(card.getFigure());
			foundation.addCard(card);
		}
	}

	private boolean isValidMove() {
		return (card.getValue() ==1 && foundation.isEmpty()) ||
				(foundation.getLastCard().getValue()+1==card.getValue()
				&& foundation.getFigure()== card.getFigure()) ;
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
