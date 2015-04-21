package pruebas;


import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveCardTableauToFoundationController;
import entities.Card;
import entities.Figure;
import entities.Foundation;

public class MoveCardTableauToFoundationTest {
	private MoveCardTableauToFoundationController moveCardTableauToFoundationController;
	private Foundation foundation;
	private Stack<Card> tableu;
	
	@Before
	public void before() {
		foundation = new Foundation();
		tableu = new Stack<Card>();
		for (int i = 1; i < 4; i++) {
			foundation.addCard(new Card(i, Figure.CLUBS));
		}
		System.out.println(" foundation test: "+ foundation.getLastCard().toString());
		for (int i = 3; i < 7; i++) {
			tableu.add(new Card(i, Figure.DIAMONDS));
		}
		Card card = new Card(4, Figure.CLUBS);
		card.setCovered(false);
		tableu.add(card);
		System.out.println(tableu.size());
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController(tableu, foundation);
	}
	@Test
	public void moveCardTableauToFoundationTest(){
		assertEquals(tableu.size(),moveCardTableauToFoundationController.getTableauSize());
		assertEquals(4,moveCardTableauToFoundationController.getFoundationSize());
	}
	@Test
	public void isEmpytyFoundation(){
		assertFalse(!moveCardTableauToFoundationController.getFoundation().isEmpty());
	}
	@Test
	public void isWrongMove(){
		moveCardTableauToFoundationController= new MoveCardTableauToFoundationController();
		assertFalse(moveCardTableauToFoundationController.isValidMove(tableu, foundation));
	}


}
