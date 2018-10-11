/**
 * Przykład z klasą BigInteger.
 */
public class Pow {

    /**
     * Potęgowanie liczb całkowitych.
     */
    public static int pow(int x, int n) {
        if (n == 0) return 1;

        // znajdź wartość x do potęgi n/2 w sposób rekurencyjny
        int t = pow(x, n / 2);

        // jeśli n jest parzyste, wynikiem jest t do kwadratu
        // jeśli n jest nieparzyste, wynikiem jest t do kwadratu przemnożone przez x
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }

}
