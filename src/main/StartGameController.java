package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import entities.Card;
import entities.Figure;
import entities.Foundation;
import entities.TableauPile;

public class StartGameController {
	private ArrayList<Card> waste;
	private ArrayList<Foundation> foundationList;
	private ArrayList<Card> deck;
	private ArrayList<TableauPile> tableauList ;
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
	private void initTableau() {
		tableauList = new ArrayList<TableauPile>(7);
		for (int i = 0; i < 7; i++) {
			tableauList.add(new TableauPile());
		}
		for (int i = 0; i < 7; i++) {
			while(tableauList.get(i).getTableuCards().size()<i+1){
				Random r =  new Random();
				int indice = r.nextInt(deck.size());
				Card card = deck.get(indice);
				if(tableauList.get(i).getTableuCards().size()==0){
					card.setCovered(false);
				}
				tableauList.get(i).getTableuCards().add(card);
				deck.remove(indice);
			}
		}
		for (int i = 0; i < tableauList.size(); i++) {
			System.out.println("tableu size"+tableauList.get(i).getTableuCards().size());
		}
		
		System.out.println("deck size: "+deck.size());
	}

	public int sizeWaste() {
		return waste.size();
	}

	public  ArrayList<Integer> sizeCoverCardsTableaus() {
		ArrayList<Integer> sizeCoverCardsTableaus = new ArrayList<Integer>();
		for (int i = 0; i < tableauList.size(); i++) {
			sizeCoverCardsTableaus.add(tableauList.get(i).coverCards().size());
		}
		return sizeCoverCardsTableaus;
	}

	public ArrayList<Integer> sizeFoundation() {
		ArrayList<Integer> sizeFoundation = new ArrayList<Integer>();

		return sizeFoundation;
	}

	public int sizeDeck() {
		return deck.size();
	}

	public ArrayList<Stack<Card>> uncoveredCardStackTableau() {
		ArrayList<Stack<Card>> uncoveredCardStackTableau = new ArrayList<Stack<Card>>();
		for (int i = 0; i < tableauList.size(); i++) {
			uncoveredCardStackTableau.add(tableauList.get(i).unCoverCards());
		}
		return uncoveredCardStackTableau;
	}




}
