package WarCardGame;

public class Card {

	// name (e.g. Ace of Diamonds, or Two of Hearts)
	String name;
	
	//  value (contains a value from 2-14 representing cards 2-Ace)
	int value;
	
	public	Card(int value, String	suit) {
		
		this.value = value;
		
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
			
		}
		name += " of " + suit;
	}
	
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	
	public void describe() {
		System.out.println(name);
		}
}// end of class
	

