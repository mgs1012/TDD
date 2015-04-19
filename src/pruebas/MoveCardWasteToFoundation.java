package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import main.Card;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardWasteToFoundation {
	private StartGameController startGameController;
	@Before
	public void before() {
		startGameController = new StartGameController();
	}
	
	@Test
	public void isValidCardInFoundation(){
		assertTrue(startGameController.getFoundation(0).isValidCard(new Card(1,"rojo")));
		assertEquals(0,startGameController.sizeWaste());
	}
	
	@Test
	public void isNotCompletedFoundation(){
		assertFalse(startGameController.getFoundation(0).isCompleted());
	}

	
}
