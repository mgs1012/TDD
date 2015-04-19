package main;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {

	public Object sizeWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static ArrayList<Integer> sizeCoverCardsTableaus() {
		ArrayList<Integer> sizeCoverCardsTableaus = new ArrayList<Integer>();
		return sizeCoverCardsTableaus;
	}

	public ArrayList<Integer> sizeFoundation() {
		ArrayList<Integer> sizeFoundation = new ArrayList<Integer>();
		
		return sizeFoundation;
	}

	public static Object sizeDeck() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static ArrayList<Stack<Card>> uncoveredCardStackTableau() {
		ArrayList<Stack<Card>> uncoveredCardStackTableau = new ArrayList<Stack<Card>>();
		return uncoveredCardStackTableau;
	}

	public Foundation getFoundation(int i) {
		ArrayList<Foundation> foundationList =new ArrayList<Foundation>(4);
		for (int j = 0; j < 4; j++) {
			foundationList.add(new Foundation());
		}
		return foundationList.get(i);
		
	}


}
