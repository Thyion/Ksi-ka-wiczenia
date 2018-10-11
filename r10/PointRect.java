import java.awt.Point;
import java.awt.Rectangle;

/**
 * Prezentuje zastosowanie klas Point oraz Rectangle.
 */
public class PointRect {

    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);
        System.out.println(blank);

        int x = blank.x;
        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;

        Rectangle box = new Rectangle(0, 0, 100, 200);
        moveRect(box, 50, 100);
        System.out.println(box);
        box.translate(50, 100);

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;

        System.out.println(box2.width);
        box1.grow(50, 50);
        System.out.println(box2.width);
    }

    /**
     * Wyświetla attributy obiektu klasy Point.
     */
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    /**
     * Oblicza odległość pomiędzy dwoma punktami.
     */
    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Znajduje środek prostokątu reprezentowanego przez obiekt klasy Rectangle i zwraca nowy obiekt klasy Point.
     */
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    /**
     * Przenosi prostokąt reprezentowany przez obiekt klasy Rectangle, modyfikując jego atrybuty x oraz y.
     */
    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    /**
     * Ćwiczenie ze zwracaniem obiektów.
     */
    public static void exercise2() {
        Point blank = new Point(5, 8);

        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);

        double dist = distance(center, blank);
        System.out.println(dist);
    }

    /**
     * Ćwiczenie z aliasami.
     */
    public static void exercise3() {
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    }

}
