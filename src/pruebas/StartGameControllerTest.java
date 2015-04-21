package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import controllers.StartGameController;
import entities.Card;

public class StartGameControllerTest {
	private StartGameController startGameController;
	@Before
	public void before() {
		startGameController = new StartGameController();
	}
	
	@Test
	public void sizeWasteTest(){
		assertEquals(0,startGameController.sizeWaste());
	}
	
	@Test
	public void sizeFoundationTest(){
		for(int sizeFoundation : startGameController.sizeFoundation()){
			assertEquals(0, sizeFoundation);
		}
	}
	
	@Test
	public void sizeDeckTest(){
		assertEquals(24, startGameController.sizeDeck());
	}

	@Test
	public void sizeTableuTest(){
		ArrayList<Integer> sizeTableaus = startGameController.sizeCoverCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardStackTableau = startGameController.uncoveredCardStackTableau();

		for (int i = 0; i < sizeTableaus.size(); i++) {
			assertEquals(new Integer(i), sizeTableaus.get(i));
		}
		for (Stack<Card> uncoveredCardsStack : uncoveredCardStackTableau) {
			assertEquals(1, uncoveredCardsStack.size());
			assertTrue(!uncoveredCardsStack.peek().isCovered());
		}
	}
}
