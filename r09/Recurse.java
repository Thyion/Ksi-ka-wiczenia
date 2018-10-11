/**
 * Ćwiczenie z rekurencji.
 */
public class Recurse {

    /**
     * Zwraca pierwszy znak podanego łańcucha znakowego.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Zwraca wszystkie znaki podanego łańcucha znakowego oprócz pierwszego.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Zwraca wszystkie znaki podanego łańcucha znakowego oprócz pierwszego i ostatniego.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Zwraca długość podanego łańcucha znakowego.
     */
    public static int length(String s) {
        return s.length();
    }

}
