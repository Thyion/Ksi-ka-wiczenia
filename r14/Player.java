/**
 * Gracz w grze szalone ósemki.
 */
public class Player {

    private String name;
    private Hand hand;

    /**
     * Konstruuje gracza z pustym układem.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }

    /**
     * Pobiera imię gracza.
     */
    public String getName() {
        return name;
    }

    /**
     * Pobiera układ gracza.
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Usuwa i zwraca prawidłową kartę z układu gracza.
     */
    public Card play(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    /**
     * Przeszukuje układ gracza w celu znalezienia pasującej karty.
     */
    public Card searchForMatch(Card prev) {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (cardMatches(card, prev)) {
                return hand.popCard(i);
            }
        }
        return null;
    }

    /**
     * Dobiera karty aż do znalezienia pasującej.
     */
    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card card = eights.draw();
            System.out.println(name + " wyciągnął " + card);
            if (cardMatches(card, prev)) {
                return card;
            }
            hand.addCard(card);
        }
    }

    /**
     * Sprawdza, czy dwie karty do siebie pasują.
     */
    public static boolean cardMatches(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return true;
        }
        if (card1.getRank() == card2.getRank()) {
            return true;
        }
        if (card1.getRank() == 8) {
            return true;
        }
        return false;
    }

    /**
     * Oblicza wynik gracza (punkty karne).
     */
    public int score() {
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            int rank = card.getRank();
            if (rank == 8) {
                sum -= 20;
            } else if (rank > 10) {
                sum -= 10;
            } else {
                sum -= rank;
            }
        }
        return sum;
    }

    /**
     * Wyświetla układ gracza.
     */
    public void display() {
        hand.display();
    }

    /**
     * Wyświetla imię i wynik gracza.
     */
    public void displayScore() {
        System.out.println(name + " ma " + score() + " punktów");
    }

}
