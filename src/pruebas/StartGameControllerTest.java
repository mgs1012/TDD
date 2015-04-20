package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import main.Card;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

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
		assertEquals(45, startGameController.sizeDeck());
	}

	@Test
	public void sizeTableuTest(){
		ArrayList<Integer> sizeTableaus = StartGameController.sizeCoverCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardStackTableau = StartGameController.uncoveredCardStackTableau();

		for (int i = 0; i < sizeTableaus.size(); i++) {
			assertEquals(new Integer(i+1), sizeTableaus.get(i));
		}
		for (Stack<Card> uncoveredCardsStack : uncoveredCardStackTableau) {
			assertEquals(0, uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().uncovered());
		}
	}
}
