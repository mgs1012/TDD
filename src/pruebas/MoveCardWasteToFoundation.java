package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import main.Card;
import main.Figure;
import main.MoveCardWasteToFoundationController;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardWasteToFoundation {
	private MoveCardWasteToFoundationController moveCardWasteToFoundation;
	private int lenghtFoundation;
	@Before
	public void before() {
		moveCardWasteToFoundation = new MoveCardWasteToFoundationController(new Card(1,Figure.DIAMONDS),moveCardWasteToFoundation.getFoundation(0));
		lenghtFoundation = moveCardWasteToFoundation.getFoundation(0).getSize();
	}

	@Test
	public void moverCardWasteToFoundationTest(){
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
