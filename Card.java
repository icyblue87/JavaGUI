package GUI;

import javax.swing.ImageIcon;

public class Card {
	private int value;
	private String suit, name;
	private ImageIcon imgCard;

	public Card() {
		this.imgCard = new ImageIcon(getClass().getResource("/images/back.png"));
		this.value = 0;
		this.name = "";
		this.suit = "";
	}

	public Card(int value, String suit, String name, ImageIcon imgCard) {
		this.imgCard = imgCard;
		this.value = value;
		this.name = name;
		this.suit = suit;
	}

	protected String getName() {
		if (value == 11) {
			this.name = "Jack";
		} else if (value == 12) {
			this.name = "Queen";
		} else if (value == 13) {
			this.name = "King";
		} else if (value == 1) {
			this.name = "Ace";
		} else {
			this.name = value + "";
		}
		return name;
	}

	public ImageIcon getImage() {
		return imgCard;
	}

	public String getSuit() {
		if (suit.equals("S")) {
			return "Spades";
		} else if (suit.equals("C")) {
			return "Clubs";
		} else if (suit.equals("D")) {
			return "Diamonds";
		} else {
			return "Hearts";
		}
	}

	public int getValue() {
		return value;
	}
}
