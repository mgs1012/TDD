package pruebas;


import static org.junit.Assert.assertTrue;
import main.Card;
import main.Figure;
import main.Foundation;
import main.MoveCardTableauToFoundationController;
import main.StartGameController;

import org.junit.Before;
import org.junit.Test;

public class MoveCardTableauToFoundation {
	private MoveCardTableauToFoundationController moveCardTableauToFoundationController;
	private Foundation foundation;
	@Before
	public void before() {
		foundation = new Foundation();
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController(new Card(1,Figure.DIAMONDS), foundation);
	}
	@Test
	public void moveCardTableauToFoundationTest(){
		assertTrue(startGameController.getFoundation().isValidCard(new Card(1,Figure.DIAMONDS)));
	}
	@Test
	public void isNotValidCardInFoundation(){
		assertTrue(startGameController.getFoundation().isValidCard(new Card(1,Figure.DIAMONDS)));
	}
	
	@Test
	public void isValidCardInFoundation(){
		assertTrue(startGameController.getFoundation().isValidCard(new Card(1,Figure.DIAMONDS)));
	}
	


}
