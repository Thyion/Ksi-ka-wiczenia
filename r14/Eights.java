import java.util.Scanner;

/**
 * Symuluje grę w Szalone ósemki (ang. Crazy Eights).
 * Podstawowe zasady gry i opis punktacji znajdziesz pod adresem:
 * https://en.wikipedia.org/wiki/Crazy_Eights
 */
public class Eights {

    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    /**
     * Inicjalizuje stan gry.
     */
    public Eights() {
        Deck deck = new Deck("Talia");
        deck.shuffle();

        // rozdaje karty każdemu graczowi
        int handSize = 5;
        one = new Player("Adam");
        deck.deal(one.getHand(), handSize);

        two = new Player("Cezary");
        deck.deal(two.getHand(), handSize);

        // obraca jedną kartę figurą do góry
        discardPile = new Hand("Wyrzucone");
        deck.deal(discardPile, 1);

        // kładzie resztę talii figurami do dołu
        drawPile = new Hand("Stos ciągnięcia");
        deck.dealAll(drawPile);

        // tworzy obiekt klasy Scanner, z którego będziemy korzystać, oczekując na użytkownika
        in = new Scanner(System.in);
    }

    /**
     * Zwraca true, jeśli któryś z układów jest pusty.
     */
    public boolean isDone() {
        return one.getHand().empty() || two.getHand().empty();
    }

    /**
     * Przenosi karty ze stosu wyrzuconych do stosu ciągnięcia i tasuje.
     */
    public void reshuffle() {
        // zapisz kartę ze szczytu
        Card prev = discardPile.popCard();

        // przenieś resztę kart
        discardPile.dealAll(drawPile);

        // odłóż kartę ze szczytu na miejsce
        discardPile.addCard(prev);

        // potasuj stos ciągnięcia
        drawPile.shuffle();
    }

    /**
     * Zwraca kartę ze stosu ciągnięcia.
     */
    public Card draw() {
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }

    /**
     * Zmienia gracza.
     */
    public Player nextPlayer(Player current) {
        if (current == one) {
            return two;
        } else {
            return one;
        }
    }

    /**
     * Wyświetla stan gry.
     */
    public void displayState() {
        one.display();
        two.display();
        discardPile.display();
        System.out.print("Stos ciągnięcia: ");
        System.out.println(drawPile.size() + " kart");
    }

    /**
     * Czeka na naciśnięcie przez użytkownika klawisza Enter.
     */
    public void waitForUser() {
        in.nextLine();
    }

    /**
     * Jeden gracz wykonuje ruch.
     */
    public void takeTurn(Player player) {
        Card prev = discardPile.last();
        Card next = player.play(this, prev);
        discardPile.addCard(next);

        System.out.println(player.getName() + " gra " + next);
        System.out.println();
    }

    /**
     * Prowdzi grę.
     */
    public void playGame() {
        Player player = one;

        // gra toczy się do czasu, aż wyłoniony zostanie zwycięzca
        while (!isDone()) {
            displayState();
            waitForUser();
            takeTurn(player);
            player = nextPlayer(player);
        }

        // ostateczny wynik zostaje wyświetlony na ekranie
        one.displayScore();
        two.displayScore();
    }

    /**
     * Tworzy grę i rozpoczyna ją.
     */
    public static void main(String[] args) {
        Eights game = new Eights();
        game.playGame();
    }

}
