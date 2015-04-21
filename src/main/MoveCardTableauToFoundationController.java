package main;

import java.util.Stack;

public class MoveCardTableauToFoundationController {
	
	private Foundation foundation;
	private Stack<Card> tableau;
	public MoveCardTableauToFoundationController(Stack<Card> tableau  ,Foundation foundation) {
		this.foundation = foundation;
		this.tableau = tableau;
		if(tableau.size()>0){
			Card card = tableau.lastElement();
			if(foundation.isValidCard(card)){
				foundation.addCard(card);
				System.out.println("antes de eliminar"+tableau.size());
				tableau.removeElementAt(tableau.size()-1);
				System.out.println("despues de eliminar: " + tableau.size());
			}
		}
	}

	public MoveCardTableauToFoundationController() {
		this.foundation = new Foundation();
		this.tableau = new Stack<Card>();
	}

	public int getTableauSize() {
		// TODO Auto-generated method stub
		return tableau.size();
	}

	public int getFoundationSize() {
		// TODO Auto-generated method stub
		return foundation.getSizeFundation();
	}

	public Foundation getFoundation() {
		this.foundation = new Foundation();
		return foundation;
	}

	public boolean isValidMove(Stack<Card> tableu, Foundation foundation2) {
		// TODO Auto-generated method stub
		return foundation2.isValidCard(tableu.lastElement());
	}

}
