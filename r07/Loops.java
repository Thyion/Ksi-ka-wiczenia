/**
 * Przykłady z rozdziału 7.
 */
public class Loops {

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Odpalamy!");
    }

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {         // n jest parzyste
                n = n / 2;
            } else {                  // n jest nieparzyste
                n = n * 3 + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("countdown");
        countdown(3);

        System.out.println("sequence");
        sequence(10);
    }

}
