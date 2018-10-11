import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Napisz coś: ");
        line = in.nextLine();
        System.out.println("Napisałeś: " + line);

        System.out.print("Napisz coś jeszcze: ");
        line = in.nextLine();
        System.out.println("Napisałeś również: " + line);
    }

}
