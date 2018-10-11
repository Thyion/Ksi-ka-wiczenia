/**
 * Pokazuje zastosowania klasy String.
 */
public class StringsThings {

    public static void main(String[] args) {

        // Znaki

        String fruit = "banan";
        char letter0 = fruit.charAt(0);

        if (letter0 == 'a') {
            System.out.println('?');
        }

        System.out.print("Alfabet łaciński: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Alfabet grecki: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        // Obiekty klasy String są niezmienne

        String name = "Alan Turing";
        String upperName = name.toUpperCase();

        String text = "Programowanie komputerów jest zabawne!";
        text = text.replace("Programowanie komputerów", "Pk");

        // Przechodzenie przez łańcuchy znakowe

        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }

        for (char letter : fruit.toCharArray()) {
            System.out.println(letter);
        }

        int length = fruit.length();
        char last = fruit.charAt(length - 1);  // dobrze

        System.out.println(reverse(fruit));

        // Podłańcuchy znakowe

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
        System.out.println(fruit.substring(5));

        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 4));
        System.out.println(fruit.substring(5, 5));

        // Metoda indexOf

        int index = fruit.indexOf('a');
        int index2 = fruit.indexOf('a', 2);

        // String comparison

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1.equals(name2)) {
            System.out.println("Nazwiska są takie same.");
        }

        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("Nazwiska są takie same.");
        } else if (diff < 0) {
            System.out.println("name1 występuje przed name2.");
        } else if (diff > 0) {
            System.out.println("name2 występuje przed name1.");
        }

        // Klasy opakowujące

        String str = "12345";
        int num = Integer.parseInt(str);

        num = 12345;
        str = Integer.toString(num);
    }

    /**
     * Odwraca łańcuch znakowy, zwraca nowy obiekt klasy String.
     */
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

}
