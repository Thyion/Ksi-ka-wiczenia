public class Exercise {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("nie ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("tylko dla", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("To ");
        zoop("śniadanie ", fork) ;
    }

    public static void ping(String strangStrung) {
        System.out.println("dowolnie " + strangStrung + "więcej ");
    }

}
