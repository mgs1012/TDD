package pruebas;

import static org.junit.Assert.assertTrue;

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
	@Before
	public void before() {
		ArrayList<Card> deckCards = new ArrayList<Card>();
		
		for (int i = 0; i < 5; i++) {
			deckCards.add(new Card(i, Figure.DIAMONDS));
		}
		moveCardDeckToWasteController = new MoveCardDeckToWasteController(deckCards);
		wasteCards = moveCardDeckToWasteController.getWaste();
	}
	
	@Test
	public void isNotEmptyWaste(){
		System.out.println(wasteCards.size());
		assertTrue(!wasteCards.isEmpty());
	}
	

}
