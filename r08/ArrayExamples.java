import java.util.Arrays;

/**
 * Pokazuje zastosowanie tablic.
 */
public class ArrayExamples {

    /**
     * Przykłady z rozdziału 8.
     */
    public static void main(String[] args) {
        int size = 10;
        int[] counts = new int[4];
        double[] values = new double[size];

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        // przechodzenie z wykorzystaniem pętli while
        int j = 0;
        while (j < 4) {
            System.out.println(counts[j]);
            j++;
        }

        // przechodzenie z wykorzystaniem pętli for
        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }

        int[] array = {1, 2, 3, 4};
        printArray(array);

        // wyświetlanie tablicy jako obiektu
        System.out.println(array);

        // wyświetlanie z wykorzystaniem klasy Arrays
        System.out.println(Arrays.toString(array));

        // kopiowanie tablicy
        double[] a = {1.0, 2.0, 3.0};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // kopiowanie z wykorzystaniem klasy Arrays
        double[] c = Arrays.copyOf(a, a.length);

        // przechodzenie
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 2.0);
        }

        // wyszukiwanie
        int index = search(a, 2.0);
        System.out.println("indeks = " + index);

        // redukcja
        double total = sum(a);
        System.out.println("suma = " + total);
    }

    /**
     * Wyświetla elementy tablicy.
     */
    public static void printArray(int[] array) {
        System.out.print("{" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }

    /**
     * Zwraca indeks elementu target w tablicy lub  -1, jeśli nie został on znaleziony.
     */
    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Zwraca sumę wszystkich elementów w tablicy.
     */
    public static double sum(double[] a) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

}
