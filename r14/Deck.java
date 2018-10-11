/**
 * Talia kart do gry.
 */
public class Deck extends CardCollection {

    /**
     * Konstruuje standardową talię 52 kart.
     */
    public Deck(String label) {
        super(label);

        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                addCard(new Card(rank, suit));
            }
        }
    }

}
