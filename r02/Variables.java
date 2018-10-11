/**
 * Przykłady z rozdziału 2.
 */
public class Variables {

    public static void main(String[] args) {

        String message;
        int x;

        String firstName;
        String lastName;
        int hour, minute;

        message = "Witaj!";  // nadaj zmiennej message wartość "Witaj!"
        hour = 11;           // przypisz wartość 11 do zmiennej hour
        minute = 59;         // ustaw zmiennej wartość 59

        message = "123";     // dopuszczalne
        // message = 123;    // niedopuszczalne

        String message2 = "Witaj!";
        int hour2 = 11;
        int minute2 = 59;

        int a = 5;
        int b = a;     // a i b są teraz równe
        a = 3;         // a i b już nie są równe

        String firstLine = "Witaj znów!";
        System.out.println(firstLine);

        System.out.print("Wartością zmiennej firstLine jest ");
        System.out.println(firstLine);

        System.out.print("Aktualny czas to ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.print("Liczba minut, które upłynęły od północy: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Ułamek godziny, który upłynął, to: ");
        System.out.println(minute / 60);

        System.out.print("Procent godziny, który upłynął, to: ");
        System.out.println(minute * 100 / 60);

        double pi;
        pi = 3.14159;

        double minute3 = 59.0;
        System.out.print("Ułamek godziny, który upłynął, to: ");
        System.out.println(minute3 / 60.0);

        double y = 1.0 / 3.0;  // poprawne

        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        double balance = 123.45;  // potencjalny błąd zaokrąglenia
        int balance2 = 12345;     // całkowita liczba groszy

        System.out.println(1 + 2 + "Witaj");
		// wynikiem jest 3Witaj


        System.out.println("Witaj" + 1 + 2);
        // wynikiem jest Witaj12

        System.out.println(17 * 3);
        System.out.println(hour * 60 + minute);

        int percentage;
        percentage = (minute * 100) / 60;

        hour = minute + 1;  // poprawne
        // minute + 1 = hour;  // błąd kompilatora
    }

}
