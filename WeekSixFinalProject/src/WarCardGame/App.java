package WarCardGame;

import WarGame.Deck;
import WarGame.Player;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		System.out.println("-----------------------------");
		System.out.println("New Deck has been created!");
		System.out.println("-----------------------------");
		deck.describe();
		
		
		System.out.println("\n-----------------");
		System.out.println("\nDeck Shuffled!");
		System.out.println("-----------------");
		deck.shuffle();
		deck.describe();
		System.out.println("----------------");
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		
		player1.setName("Bob");
		player2.setName("Paul");
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
	
		int round =1;
		
	
		for(int i = 0; i < 26; i++) {
			System.out.println("\n Round " + round +" of 26");
			System.out.println("---------------------------");
			round++;
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			
			System.out.println(player1.getName() + " plays: \n");
			player1Card.describe() ;
			System.out.println("\n" +player2.getName() + " plays: \n");
			player2Card.describe();

			
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("\n" + player1.getName() + " wins!");
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println("\n"+ player2.getName() + " wins!");

			} else {
				System.out.println("It's a draw!");
			}
			
			System.out.println("\n Currect Score:  " );
			System.out.println(player1.getName() +"'s Score:  " + player1.getScore());
			System.out.println(player2.getName() + "'s Score:  " + player2.getScore());
			
				
			
		} 
		System.out.println("---------------------------");
		System.out.println("Final Score: " + player1.getName() + "'s score is: " + player1.getScore() + " || " + player2.getName() + "'s score is: " + player2.getScore()); 
		
			
		System.out.println("\n End Game Results");
		System.out.println("********************");
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Congratulations " + player1.getName() + " Wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Congratulations " + player2.getName() + " Wins!");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("it's a Draw");
		}
		

		
	} // end of main

} // end of class
