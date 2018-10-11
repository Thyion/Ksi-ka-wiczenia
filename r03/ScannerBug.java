import java.util.Scanner;

/**
 * Pokazuje typowy problem związany z używaniem klasy Scanner.
 */
public class ScannerBug {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.print("Jak się nazywasz? ");
        name = in.nextLine();
        System.out.print("Ile masz lat? ");
        age = in.nextInt();
        System.out.printf("Witaj, %s, lat %d\n", name, age);

        System.out.print("Ile masz lat? ");
        age = in.nextInt();
        System.out.print("Jak się nazywasz? ");
        name = in.nextLine();
        System.out.printf("Witaj, %s, lat %d\n", name, age);
    }

}
