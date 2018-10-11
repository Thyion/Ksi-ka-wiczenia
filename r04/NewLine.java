public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("Pierwsza linia.");
        threeLine();
        System.out.println("Druga linia.");
    }

}
