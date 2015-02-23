import org.junit.Test;
import static org.junit.Assert.*;

/** Test the old school vessel class.
 *  @author Josh Hug
 */

/* Actual type argument is Integer. */
public class TestVessel {
    @Test
    public void testBasics() {
        Vessel<Integer> osv = new Vessel<Integer>();
        Integer thingToPutIn = new Integer(5);
        osv.put(thingToPutIn);
        /* Is Object an Integer?
           Maybe not, so don't allow. */
        Integer contents = osv.peek();

        int x = 5;
        assertEquals((Integer) x, osv.peek());
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestVessel.class);
    }
} 