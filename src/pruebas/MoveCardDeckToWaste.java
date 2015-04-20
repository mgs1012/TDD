package pruebas;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import main.Card;
import main.Figure;
import main.MoveCardDeckToWasteController;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardDeckToWaste {
	private MoveCardDeckToWasteController moveCardDeckToWasteController;
	private ArrayList<Card> wasteCards;
	private ArrayList<Card> deckCards;
	@Before
	public void before() {
		deckCards = new ArrayList<Card>();
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
		for (int i = 0; i < deckCards.size(); i=i+3) {
			assertEquals(3,moveCardDeckToWasteController.getWaste().size());
		}
	}
	
	

}
