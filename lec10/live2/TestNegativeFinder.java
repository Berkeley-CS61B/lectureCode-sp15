import org.junit.Test;
import static org.junit.Assert.*;

/** FIXME
 *  @author Josh Hug
 */

public class TestNegativeFinder {

    @Test
    public void testHasNegative() {
        XList L = new AList();
        L.insertBack(5);
        L.insertBack(9);        
        assertEquals(false, NegativeFinder.hasNegative(L));
        L.insertBack(-5);
        assertEquals(true, NegativeFinder.hasNegative(L));

    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestNegativeFinder.class);
    }
}       