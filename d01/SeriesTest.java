import junit.framework.TestCase;

/**
 * Przykładowy test JUnit z dodatku A.
 */
public class SeriesTest extends TestCase {

    public void testFibonacci() {
        assertEquals(1, Series.fibonacci(1));
        assertEquals(1, Series.fibonacci(2));
        assertEquals(2, Series.fibonacci(3));
    }

}
