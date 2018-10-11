/**
 * Klasa wykorzystująca obiekty klasy Time.
 */
public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(11, 59, 59.9);
        System.out.println(time);

        // nie można uzyskać dostępu do prywatnych zmiennych innej klasy
        // System.out.println(time.hour);

        String s = time.toString();
        System.out.println(s);

        Time time1 = new Time(9, 30, 0.0);
        Time time2 = time1;
        Time time3 = new Time(9, 30, 0.0);

        System.out.println(time1 == time2);
        System.out.println(time1 == time3);
        System.out.println(time1.equals(time2));
        System.out.println(time1.equals(time3));

        Time startTime = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        Time endTime = Time.add(startTime, runningTime);

        // użycie metody instancji
        endTime = startTime.add(runningTime);
    }

}
