package GUI;

import java.util.Random;
import javax.swing.ImageIcon;

public class DeckofCards {
	private Card[] deck;
	private Random rand;
	public static final int TOTAL_CARDS = 52;
	boolean[] vis;

	public DeckofCards() {
		rand = new Random();
		generateDeck();
	}

	public DeckofCards(boolean shuffleDeck) {
		rand = new Random();
		vis = new boolean[TOTAL_CARDS];
		generateDeck();
		shuffleDeck();
	}

	private void generateDeck() {
		deck = new Card[52];
		String[] arr = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		int cur = 0;
		for (int i = 1; i <= 13; i++) {
			String s = "/images/";
			if (i == 1) {
				s += 14 + "C.gif";
			} else {
				s += i + "C.gif";
			}
			deck[cur] = new Card(i, "C", arr[i - 1], new ImageIcon(getClass().getResource(s)));
			cur++;
		}
		for (int i = 1; i <= 13; i++) {
			String s = "/images/";
			if (i == 1) {
				s += 14 + "H.gif";
			} else {
				s += i + "H.gif";
			}
			deck[cur] = new Card(i, "H", arr[i - 1], new ImageIcon(getClass().getResource(s)));
			cur++;
		}
		for (int i = 1; i <= 13; i++) {
			String s = "/images/";
			if (i == 1) {
				s += 14 + "S.gif";
			} else {
				s += i + "S.gif";
			}
			deck[cur] = new Card(i, "S", arr[i - 1], new ImageIcon(getClass().getResource(s)));
			cur++;
		}
		for (int i = 1; i <= 13; i++) {
			String s = "/images/";
			if (i == 1) {
				s += 14 + "D.gif";
			} else {
				s += i + "D.gif";
			}
			deck[cur] = new Card(i, "D", arr[i - 1], new ImageIcon(getClass().getResource(s)));
			cur++;
		}
	}

	public void shuffleDeck() {
		for (int i = 0; i < 1000; i++) {
			int x = rand.nextInt(TOTAL_CARDS), y = rand.nextInt(TOTAL_CARDS);
			Card z = deck[x];
			deck[x] = deck[y];
			deck[y] = z;
		}
	}

	public Card dealCard() {
		int x;
		while (true) {
			x = rand.nextInt(TOTAL_CARDS);
			if (!vis[x]) {
				break;
			}
		}
		vis[x] = true;
		return deck[x];
	}
}
