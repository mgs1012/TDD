package pruebas;


import static org.junit.Assert.*;

import java.util.Stack;

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
	private Stack<Card> tableu;
	@Before
	public void before() {
		foundation = new Foundation();
		for (int i = 1; i < 4; i++) {
			foundation.addCard(new Card(i, Figure.CLUBS));
		}
		tableu = new Stack<Card>();
		for (int i = 3; i < 6; i++) {
			tableu.add(new Card(i, Figure.DIAMONDS));
		}
		Card card = new Card(4, Figure.CLUBS);
		card.setCovered(false);
		tableu.add(card);
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController(tableu, foundation);
	}
	@Test
	public void moveCardTableauToFoundationTest(){
		assertEquals(3,moveCardTableauToFoundationController.getTableauSize());
		assertEquals(4,moveCardTableauToFoundationController.getFoundationSize());
	}
	@Test
	public void isEmpytyFoundation(){
		foundation = new Foundation();
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController(tableu, foundation);
		assertFalse(!moveCardTableauToFoundationController.getFoundation().isEmpty());
	}
	
	public void isWrongMove(){
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController();
		assertFalse(moveCardTableauToFoundationController.isValidMove(tableu, foundation));
	}


}
