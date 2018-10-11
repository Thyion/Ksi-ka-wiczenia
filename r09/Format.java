/**
 * Przykład zastosowania metody String.format.
 */
public class Format {

    /**
     * Zwraca łańcuch znakowy określający czas w formacie 12-godzinnym.
     *
     * @param godzina pomiędzy 0 i 23
     * @param minuta pomiędzy 0 i 59
     */
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;  // północ
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }

    public static void main(String[] args) {
        System.out.println(timeString(0, 0));
        System.out.println(timeString(7, 30));
        System.out.println(timeString(12, 5));
        System.out.println(timeString(23, 59));
    }

}
