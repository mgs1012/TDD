package pruebas;

import static org.junit.Assert.*;

import main.Card;
import main.Figure;
import main.MoveCardWasteToFoundationController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardWasteToFoundation {
	private MoveCardWasteToFoundationController moveCardWasteToFoundation;
	private int lenghtFoundation;
	@Before
	public void before() {
		//Obtener la ultima carta del Waste
		moveCardWasteToFoundation = new MoveCardWasteToFoundationController
				(new Card(1,Figure.DIAMONDS),0);
		lenghtFoundation = moveCardWasteToFoundation.getFoundation(0).getSize();
		
		System.out.println("longitud" +lenghtFoundation);
	}

	@Test
	public void moveCardWasteToFoundationTest(){
		assertEquals(lenghtFoundation,moveCardWasteToFoundation.getFoundation(0).getSize());
	}

	@Test
	public void isValidCardInFoundation(){
		assertTrue(moveCardWasteToFoundation.getFoundation(0).isValidCard(new Card(1,Figure.DIAMONDS)));
	}

	@Test
	public void isNotEmptyFoundation(){
		assertFalse(moveCardWasteToFoundation.getFoundation(0).isCompleted());
	}




}
