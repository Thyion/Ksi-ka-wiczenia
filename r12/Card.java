/**
 * Standardowa karta do gry.
 */
public class Card {

    public static final String[] RANKS = {
        null, "as", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "walet", "dama", "król"};

    public static final String[] SUITS = {
        "trefl", "karo", "kier", "pik"};

    private final int rank;

    private final int suit;

    /**
     * Konstruuje kartę o podanej randze i kolorzes.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Zwraca ujemną liczbę całkowitą, jeśli karta wskazywana przez this
     * poprzedza podaną kartę, zero, jeśli te dwie karty są równe lub dodatnią
     * liczbę całkowitą, jeśli karta wskazywana przez this następuje po podanej.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Zwraca wartość true, jeśli podana karta ma tę samą wartość
     * ORAZ ten sam kolor; w przeciwnym razie zwraca wartość false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Umożliwia odczytanie wartości karty.
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Umożliwia odczytanie koloru karty.
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Zwraca indeks karty w uporządkowanej talii 52 kart.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

    /**
     * Zwraca tekstową reprezentację karty.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

}
