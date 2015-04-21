package pruebas;

import org.junit.Before;

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
	
}
