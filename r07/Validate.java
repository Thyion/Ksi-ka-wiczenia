import java.util.Scanner;

/**
 * Pętla do-while, instrukcje break i continue
 */
public class Validate {

    public static double scanDouble() {
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Wprowadź liczbę: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " nie jest liczbą");
            }
        } while (!okay);
        double x = in.nextDouble();
        return x;
    }

    public static double scanDouble2() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Wprowadź liczbę: ");
            if (in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " nie jest liczbą");
        }
        double x = in.nextDouble();
        return x;
    }

    public static double addNumbers() {
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while (x != 0) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            System.out.println("Dodaję " + x);
            sum += x;
        }
        return sum;
    }

}
