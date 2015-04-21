package pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardWasteToFoundationController;
import entities.Card;
import entities.Figure;
import entities.Foundation;

public class MoveCardWasteToFoundationTest {
	private MoveCardWasteToFoundationController moveCardWasteToFoundation;
	private Foundation foundation;
	@Before
	public void before() {
		foundation =new Foundation();
		moveCardWasteToFoundation = new MoveCardWasteToFoundationController
				(new Card(1,Figure.DIAMONDS),foundation);
	}

	@Test
	public void moveCardWasteToFoundationTest(){
		assertEquals(foundation.getSizeFundation(),moveCardWasteToFoundation.getFoundation().getSizeFundation());
	}

	@Test
	public void isValidCardInFoundation(){
		assertTrue(moveCardWasteToFoundation.getFoundation().isValidCard(new Card(2,Figure.DIAMONDS)));
	}

	@Test
	public void isNotCompletedFoundation(){
		assertFalse(moveCardWasteToFoundation.getFoundation().isCompleted());
	}




}
