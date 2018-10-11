import java.util.ArrayList;
import java.util.Random;

/**
 * Kolekcja kart do gry.
 */
public class CardCollection {

    private String label;
    private ArrayList<Card> cards;

    /**
     * Konstruuje pustą kolekcję.
     */
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }

    /**
     * Zwraca etykietę kolekcji kart.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Dodaje podaną kartę do kolekcji.
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Usuwa i zwraca kartę o podanym indeksie.
     */
    public Card popCard(int i) {
        return cards.remove(i);
    }

    /**
     * Usuwa i zwraca ostatnią kartę.
     */
    public Card popCard() {
        int i = size() - 1;
        return popCard(i);
    }

    /**
     * Zwraca liczbę kart.
     */
    public int size() {
        return cards.size();
    }

    /**
     * True, jeśli kolekcja jest pusta, false w innym przypadku.
     */
    public boolean empty() {
        return cards.size() == 0;
    }

    /**
     * Przenosi n kart z kolekcji wskazywanej przez this do podanej kolekcji.
     */
    public void deal(CardCollection that, int n) {
        for (int i = 0; i < n; i++) {
            Card card = popCard();
            that.addCard(card);
        }
    }

    /**
     * Przenosi wszystkie pozostałe karty do podanej kolekcji.
     */
    public void dealAll(CardCollection that) {
        int n = size();
        deal(that, n);
    }

    /**
     * Zwraca kartę o podanym indeksie.
     */
    public Card getCard(int i) {
        return cards.get(i);
    }

    /**
     * Zwraca ostatnią kartę.
     */
    public Card last() {
        int i = size() - 1;
        return cards.get(i);
    }

    /**
     * Zamienia miejscami karty, których indeksy to i oraz j.
     */
    public void swapCards(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    /**
     * Losowo tasuje tablicę kart.
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapCards(i, j);
        }
    }

    /**
     * Zwraca tekstową reprezentację kolekcji kart.
     */
    public String toString() {
        return label + ": " + cards.toString();
    }

}
