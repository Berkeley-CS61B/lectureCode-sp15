import org.junit.Test;
import static org.junit.Assert.*;

/** FIXME
 *  @author Josh Hug
 */

public class TestNegativeFinder {

    @Test
    public void testHasNegative() {
        XList L = new AList();
        L.insertBack(50);
        L.insertBack(99);
        assertFalse(NegativeFinder.hasNegative(L));
        L.insertBack(-5);
        assertTrue(NegativeFinder.hasNegative(L));

        L = new SList();
        L.insertBack(50);
        L.insertBack(99);
        assertFalse(NegativeFinder.hasNegative(L));
        L.insertBack(-5);
        assertTrue(NegativeFinder.hasNegative(L));
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestNegativeFinder.class);
    }
}       