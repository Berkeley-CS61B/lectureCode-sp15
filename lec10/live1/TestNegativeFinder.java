import org.junit.Test;
import static org.junit.Assert.*;

/** FIXME
 *  @author Josh Hug
 */

public class TestNegativeFinder {

    @Test
    public void testHasNegative() {
        XList L = new SList();
        L.insertBack(100);
        L.insertBack(55);
        assertFalse(NegativeFinder.hasNegative(L));
        L.insertBack(-5);
        assertTrue(NegativeFinder.hasNegative(L));
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestNegativeFinder.class);
    }
}       