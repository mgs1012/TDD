package pruebas;

import static org.junit.Assert.*;


import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardDeckToWasteController;
import entities.Card;
import entities.Figure;

public class MoveCardDeckToWasteTest {
	
	private MoveCardDeckToWasteController moveCardDeckToWasteController;
	private Stack<Card> wasteCards;
	private Stack<Card> deckCards;
	
	@Before
	public void before() {
		deckCards = new Stack<Card>();
		for (int i = 0; i < 5; i++) {
			deckCards.add(new Card(i, Figure.DIAMONDS));
		}
		moveCardDeckToWasteController = new MoveCardDeckToWasteController(deckCards);
		wasteCards = moveCardDeckToWasteController.getWaste();
	}

	@Test
	public void isNotEmptyWaste(){
		assertTrue(!wasteCards.isEmpty());
	}

	@Test
	public void sizeWaste(){
		assertEquals(3,moveCardDeckToWasteController.getWaste().size());

	}
	@Test
	public void sizeDeck(){
		assertEquals(2,moveCardDeckToWasteController.getDeckCards().size());

	}



}
