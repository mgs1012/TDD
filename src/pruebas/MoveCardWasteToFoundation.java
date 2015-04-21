package pruebas;

import static org.junit.Assert.*;

import main.Card;
import main.Figure;
import main.Foundation;
import main.MoveCardWasteToFoundationController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardWasteToFoundation {
	private MoveCardWasteToFoundationController moveCardWasteToFoundation;
	private int lenghtFoundation;
	private Foundation foundation;
	@Before
	public void before() {
		//Obtener la ultima carta del Waste
		foundation =new Foundation();
		moveCardWasteToFoundation = new MoveCardWasteToFoundationController
				(new Card(1,Figure.DIAMONDS),foundation);
		lenghtFoundation = moveCardWasteToFoundation.getFoundation().getSizeFundation();
		
		System.out.println("longitud" +lenghtFoundation);
	}

	@Test
	public void moveCardWasteToFoundationTest(){
		assertEquals(lenghtFoundation,moveCardWasteToFoundation.getFoundation().getSizeFundation());
	}

	@Test
	public void isValidCardInFoundation(){
		assertTrue(moveCardWasteToFoundation.getFoundation().isValidCard(new Card(1,Figure.DIAMONDS)));
	}

	@Test
	public void isNotEmptyFoundation(){
		assertFalse(moveCardWasteToFoundation.getFoundation().isCompleted());
	}




}
