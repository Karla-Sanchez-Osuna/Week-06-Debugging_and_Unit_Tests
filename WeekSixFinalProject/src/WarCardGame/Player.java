package WarCardGame;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.Line;

public class Player {

	//Fields
	public List<Card> hand = new ArrayList<Card>();
	public int score;
	public String name;
		
	//constructor
	public Player() {
		score = 0;
	}
	public Player(String name, List<Card> hand, int score) {
			this.name = name;
			this.hand = hand;
			this.score = 0;
	
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementScore () {
		score++;
	
	}

	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
