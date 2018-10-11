import java.util.Scanner;

/**
 * Przykłady z rozdziału 5.
 */
public class Conditional {

    public static void main(String[] args) {
        String fruit1 = "Jabłko";
        String fruit2 = "Pomarańcza";
        System.out.println(fruit1.equals(fruit2));

        int x = 17;
        int n = 18;

        if (x > 0) {
            System.out.println("x jest dodatnie");
        }

        if (x % 2 == 0) {
            System.out.println("x jest parzyste");
        } else {
            System.out.println("x jest nieparzyste");
        }

        if (x > 0) {
            System.out.println("x jest dodatnie");
        } else if (x < 0) {
            System.out.println("x jest ujemne");
        } else {
            System.out.println("x jest zerem");
        }

        if (x == 0) {
            System.out.println("x jest zerem");
        } else {
            if (x > 0) {
                System.out.println("x jest dodatnie");
            } else {
                System.out.println("x jest ujemne");
            }
        }

        boolean evenFlag = (n % 2 == 0);    // true, gdy n jest parzyste
        boolean positiveFlag = (x > 0);     // true, gdy n jest dodatnie

        if (evenFlag) {
            System.out.println("Wartość zmiennej n była parzysta, gdy było to sprawdzane");
        }

        if (!evenFlag) {
            System.out.println("Wartość zmiennej n była nieparzysta, gdy było to sprawdzane");
        }
    }

}
