package pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardController;
import controllers.StartGameController;

public class MoveCardControllerTest {
	
	MoveCardController moveCardController;
	
	StartGameController startGameController;

	
	@Before
	public void before(){		
		moveCardController = new MoveCardController(startGameController.getDeck(), startGameController.getWaste());
		
		startGameController = new StartGameController();	
	}
	
	@Test
	public void moveCard(){
		assertFalse(moveCardController.getWasteStack().contains(moveCardController.getDeckStack().elementAt(0)));
	}

}
