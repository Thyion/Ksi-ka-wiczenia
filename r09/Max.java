import java.util.Arrays;

/**
 * Prezentuje argumenty wiersza poleceń.
 */
public class Max {

    /**
     * Konwertuje elementy tablicy args na liczby całkowite i wyświetla największą z nich.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Największa liczba to " + max);
    }

}
