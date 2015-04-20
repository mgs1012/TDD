package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class StartGameController {
	private ArrayList<Card> waste;
	private ArrayList<Foundation> foundationList;
	private ArrayList<Card> deck;
	public StartGameController() {
		waste = new ArrayList<Card>();
		foundationList = new ArrayList<Foundation>();
		for (int i = 0; i < 4; i++) {
			foundationList.add(new Foundation());
		}
		deck = new ArrayList<Card>();
		initDeck();
		System.out.println("deck size"+deck.size());
		initTableau();
	}

	private void initDeck() {
		for (Figure figure :Figure.values()) {
			for (int i = 0; i < 13; i++) {
				deck.add(new Card(i, figure));
			}
		}

	}
	private ArrayList<TableauPile> initTableau() {
		ArrayList<TableauPile> tableauListAux = new ArrayList<TableauPile>(7);
		for (int i = 0; i < 7; i++) {
			tableauListAux.add(new TableauPile());
		}
		for (int i = 0; i < 7; i++) {
			Random r =  new Random();
			int indice = r.nextInt(deck.size());
			Card card = deck.get(indice);
			card.setCovered(true);
			tableauListAux.get(i).getTableuCards().add(card);
			deck.remove(indice);
		}
		System.out.println("tableu size"+tableauListAux.get(1).getTableuCards().get(0).toString());
		System.out.println("deck size: "+deck.size());
		return tableauListAux;
	}

	public int sizeWaste() {
		return waste.size();
	}

	public static ArrayList<Integer> sizeCoverCardsTableaus() {
		ArrayList<Integer> sizeCoverCardsTableaus = new ArrayList<Integer>();
		return sizeCoverCardsTableaus;
	}

	public ArrayList<Integer> sizeFoundation() {
		ArrayList<Integer> sizeFoundation = new ArrayList<Integer>();

		return sizeFoundation;
	}

	public int sizeDeck() {
		return deck.size();
	}

	public static ArrayList<Stack<Card>> uncoveredCardStackTableau() {
		ArrayList<Stack<Card>> uncoveredCardStackTableau = new ArrayList<Stack<Card>>();
		return uncoveredCardStackTableau;
	}




}
