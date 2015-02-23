import org.junit.Test;
import static org.junit.Assert.*;

/** Tets Vessel Helper class
 *  @author Josh Hug
 */

public class TestVesselHelper {
    @Test
    public void testRemove() {
        Vessel<Double> v = new Vessel<Double>();
        v.put(3.0);
        double x = VesselHelper.remove(v);
        assertEquals(3.0, x, 1e-5);
        assertEquals(null, v.peek());
    }

    @Test
    public void testMax() {
        Vessel<Double> v1 = new Vessel<Double>();
        v1.put(3.0);
        Vessel<Double> v2 = new Vessel<Double>();
        v2.put(5.0);

        double bigger = VesselHelper.max(v1, v2);
        assertEquals(5.0, bigger, 1e-5);

        Vessel<String> sv1 = new Vessel<String>();
        sv1.put("ketchupFriend");
        Vessel<String> sv2 = new Vessel<String>();
        sv2.put("staticShock");

        String biggerS = VesselHelper.max(sv1, sv2);
        assertEquals("staticShock", biggerS);
    }


    @Test
    public void testRatio() {
        Vessel<Integer> v1 = new Vessel<Integer>();
        Vessel<Double> v2 = new Vessel<Double>();
        v1.put(15);
        v2.put(5.0);
        double r = VesselHelper.ratio(v1, v2);
        assertEquals(3.0, r, 1e-5);

    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestVesselHelper.class);
    }
} 