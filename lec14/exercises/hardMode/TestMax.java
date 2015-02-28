import org.junit.Test;
import static org.junit.Assert.*;

/** Tests VesselHelper
 *  @author Josh Hug
 */

public class TestMax {
    @Test
    public void testMax() {
        Vessel<Integer> v1 = new Vessel<Integer>();
        Vessel<Integer> v2 = new Vessel<Integer>();
        v1.put(1);
        v2.put(2);
        assertEquals((Integer) 2, VesselHelper.max(v1, v2));
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestMax.class);
    }
}   