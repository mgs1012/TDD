package pruebas;


import static org.junit.Assert.assertTrue;
import main.Card;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardTableauToFoundation {
	private StartGameController startGameController;
	@Before
	public void before() {
		startGameController = new StartGameController();
	}
	@Test
	public void moveCardTableauToFoundationTest(){
//		startGameController.sizeFoundation()
		assertTrue(startGameController.getFoundation(0).isValidCard(new Card(1,"rojo")));
	}
	@Test
	public void isNotValidCardInFoundation(){
		assertTrue(startGameController.getFoundation(0).isValidCard(new Card(1,"rojo")));
	}
	
	@Test
	public void isValidCardInFoundation(){
		assertTrue(startGameController.getFoundation(0).isValidCard(new Card(1,"rojo")));
	}
	


}
