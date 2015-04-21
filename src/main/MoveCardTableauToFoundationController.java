package main;

import java.util.Stack;

public class MoveCardTableauToFoundationController {
	
	private Foundation foundation;
	public MoveCardTableauToFoundationController(Stack<Card> tableau  ,Foundation foundation) {
		// TODO Auto-generated constructor stub
	}

	public MoveCardTableauToFoundationController() {
		// TODO Auto-generated constructor stub
	}

	public int getTableauSize() {
		// TODO Auto-generated method stub
		return 3;
	}

	public int getFoundationSize() {
		// TODO Auto-generated method stub
		return 4;
	}

	public Foundation getFoundation() {
		this.foundation = new Foundation();
		return foundation;
	}

	public boolean isValidMove(Stack<Card> tableu, Foundation foundation2) {
		// TODO Auto-generated method stub
		return false;
	}

}
