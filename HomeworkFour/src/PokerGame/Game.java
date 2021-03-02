package PokerGame;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Game {

	private final int HAND_SIZE = 5;
	private int again = 1;

	Scanner scan = new Scanner(System.in);
	Deck deck = new Deck();
	Player player = new Player();
	Card[] hand;

	public void play() {
		while (again == 1) {
			deck.fillDeck();
			deck.shuffle();
			hand = player.draw(deck);
			Arrays.sort(hand);
			this.checkHand();
			hand = this.redraw();
			this.checkHand();
			Arrays.sort(hand);
			this.evaluate();
			this.again();
		}
	}

	public void makeHand() {
		hand[0].rank = 1;
		hand[1].rank = 2;
		hand[2].rank = 3;
		hand[3].rank = 4;
		hand[4].rank = 5;

		hand[0].suit = 1;
		hand[1].suit = 1;
		hand[2].suit = 1;
		hand[3].suit = 1;
		hand[4].suit = 1;
	}

	public void checkHand() {
		for (int handCounter = 0; handCounter < HAND_SIZE; handCounter++) {
			this.display(hand[handCounter]);
		}
	}

	public Card[] redraw() {
		for (int counter = 0; counter < 5; counter++) {
			String input = JOptionPane.showInputDialog(null, "Card " + (counter + 1)
					+ " , want to redraw for a new one?" + " ( Press 1 for yes, Press 0 for no )");
			int answer = Integer.parseInt(input);
			if (answer == 1) {
				hand[counter] = player.redraw(counter, deck);
			}
		}
		deck.refreshDeckPosition();
		return hand;
	}

	public void evaluate() {
		if (this.pair() == 1) {
			JOptionPane.showMessageDialog(null, "You have a pair!");
		}
	}

	public int pair() {
		int check = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (hand[counter - 1].rank == hand[counter].rank) {
				check++;
			}
		}
		if (check == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public void again() {
		String play = JOptionPane.showInputDialog(null,
				"Do you want to play Poker again? (Press 1 for yes, Press 0 for no)");
		again = Integer.parseInt(play);
	}

	public void display(Card card) {
		if (card.rank == 1) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Ace of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Ace of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Ace of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Ace of Clubs");
			}
		}
		if (card.rank == 2) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Two of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Two of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Two of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Two of Clubs");
			}
		}
		if (card.rank == 3) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Three of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Three of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Three of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Three of Clubs");
			}
		}
		if (card.rank == 4) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Four of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Four of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Four of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Four of Clubs");
			}
		}
		if (card.rank == 5) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Five of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Five of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Five of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Five of Clubs");
			}
		}
		if (card.rank == 6) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Six of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Six of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Six of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Six of Clubs");
			}
		}
		if (card.rank == 7) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Seven of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Seven of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Seven of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Seven of Clubs");
			}
		}
		if (card.rank == 8) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Eight of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Eight of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Eight of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Eight of Clubs");
			}
		}
		if (card.rank == 9) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Nine of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Nine of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Nine of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Nine of Clubs");
			}
		}
		if (card.rank == 10) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Ten of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Ten of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Ten of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Ten of Clubs");
			}
		}
		if (card.rank == 11) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Jack of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Jack of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Jack of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Jack of Clubs");
			}
		}
		if (card.rank == 12) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "Queen of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "Queen of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "Queen of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "Queen of Clubs");
			}
		}
		if (card.rank == 13) {
			if (card.suit == 1) {
				JOptionPane.showMessageDialog(null, "King of Spades");
			}
			if (card.suit == 2) {
				JOptionPane.showMessageDialog(null, "King of Hearts");
			}
			if (card.suit == 3) {
				JOptionPane.showMessageDialog(null, "King of Diamonds");
			}
			if (card.suit == 4) {
				JOptionPane.showMessageDialog(null, "King of Clubs");
			}
		}
	}
}