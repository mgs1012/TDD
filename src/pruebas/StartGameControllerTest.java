package pruebas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
//	
//	@Test
//	public void sizeFoundationTest(){
//		for(int sizeFoundation : StartGameController.sizeFoundation()){
//			assertEquals(0, sizeFoundation);
//		}
//	}
//	@Test
//	public void sizeDeckTest{
//		assertEquals(0, StartGameController.sizeDeck());
//	}
//
//	@Test
//	public void sizeTableuTest(){
//		ArrayList<Integer> sizeTableaus = StartGameController.sizeCoverCardsTableaus();
//		for (int i = 0; i < sizeTableaus.size(); i++) {
//			assertEquals(new Integer(i+1), sizeTableaus.get(i));
//		}
//		ArrayList<Stack<Card>> uncoveredCardStackTableau = StartGameController.uncoveredCardStackTableau();
//	}
}
