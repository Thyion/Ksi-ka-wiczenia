public class Buzz {

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zup");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("bu-ua-ha-ha");
        }
    }

    public static void main(String[] args) {
        zippo("grzechot", 13);
    }

}
