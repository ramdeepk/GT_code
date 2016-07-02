public class Card {
	private String rank, suit;

	public String toString() {
		return rank + " of " + suit;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public static void main(String[] args) {
		Card y = new Card();
		y.rank = "gay";
		y.suit = "motherfucker";

		System.out.println(y);
	}
}