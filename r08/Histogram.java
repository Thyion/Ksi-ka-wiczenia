import java.util.Random;

/**
 * Przykładowy kod związany z histogramami.
 */
public class Histogram {

    /**
     * Zwraca tablicę losowych liczb całkowitych.
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
     * Oblicza liczbę elementów tablicy należących do przedziału <low, high).
     */
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numValues = 8;
        int[] array = randomArray(numValues);
        ArrayExamples.printArray(array);

        int[] scores = randomArray(30);
        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int f = inRange(scores, 0, 60);

        // tworzenie histogramu
        int[] counts = new int[100];
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }

        // histogram tworzony przy użyciu rozszerzonej pętli for
        counts = new int[100];
        for (int score : scores) {
            counts[score]++;
        }
    }

}
