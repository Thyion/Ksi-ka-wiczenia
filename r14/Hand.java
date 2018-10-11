/**
 * Układ kart do gry.
 */
public class Hand extends CardCollection {

    /**
     * Konstruuje pusty układ.
     */
    public Hand(String label) {
        super(label);
    }

    /**
     * Wyświetla etykietę i karty.
     */
    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
        System.out.println();
    }

}
