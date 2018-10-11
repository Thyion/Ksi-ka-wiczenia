public class Exercise {

    public static void zoop() {
        baffle();
        System.out.print("Ty chcesz ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("Nie, ja będę ");
        zoop();
        System.out.print("Ja będę ");
        baffle();
    }

    public static void baffle() {
        System.out.print("pracować");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }

}
