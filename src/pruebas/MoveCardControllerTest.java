package pruebas;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardController;
import controllers.MoveCardDeckToWasteController;
import controllers.MoveCardTableauToFoundationController;
import controllers.StartGameController;
import entities.Card;
import entities.Figure;
import entities.Foundation;

public class MoveCardControllerTest {
	
	MoveCardController moveCardController;	
	StartGameController startGameController;

	private Stack<Card> wasteCards;
	private Stack<Card> deckCards;
	private Foundation foundation;
	private Stack<Card> tableau;
	
	@Before
	public void before(){				
		startGameController = new StartGameController();	
		moveCardController = new MoveCardController(deckCards, wasteCards);
		
		deckCards = new Stack<Card>();
		for (int i = 0; i < 5; i++) {
			deckCards.add(new Card(i, Figure.DIAMONDS));
		}
		moveCardController.moveCardDeckToWasteController(deckCards);
		wasteCards = moveCardController.getWasteStack();
		
		foundation = new Foundation();
		tableau = new Stack<Card>();
		for (int i = 1; i < 4; i++) {
			foundation.addCard(new Card(i, Figure.CLUBS));
		}
		for (int i = 3; i < 7; i++) {
			tableau.add(new Card(i, Figure.DIAMONDS));
		}
		Card card = new Card(4, Figure.CLUBS);
		card.setCovered(false);
		tableau.add(card);
		moveCardController.moveCardTableauToFoundation(tableau, foundation);
		
	}

	@Test
	public void moveCardDeckToWasteTest(){	
		moveCardController.moveCardDeckToWasteController(deckCards);
		wasteCards = moveCardController.getWasteStack();
	}
	
	@Test
	public void isNotEmptyWaste(){
		assertTrue(!wasteCards.isEmpty());
	}

	@Test
	public void sizeWaste(){
		assertEquals(3,moveCardController.getWasteStack().size());

	}
	@Test
	public void sizeDeck(){
		assertEquals(2,moveCardController.getDeckStack().size());
	}

	@Test
	public void moveCardTableauToFoundation(){
		
	}

}
