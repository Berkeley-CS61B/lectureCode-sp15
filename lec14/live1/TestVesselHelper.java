import org.junit.Test;
import static org.junit.Assert.*;

/** Tests VesselHelper
 *  @author Josh Hug
 */

public class TestVesselHelper {
    
    @Test
    public void testRemove() {
        Vessel<Integer> v = new Vessel<Integer>();
        v.put(5);
        int occupant = VesselHelper.remove(v);
        assertEquals(5, occupant);
        assertEquals(null, v.peek());

        Vessel<String> sV = new Vessel<String>();
        sV.put("ketchupFriend");
        String occupantString = VesselHelper.remove(sV);
        assertEquals("ketchupFriend", occupantString);
        assertEquals(null, sV.peek());
    }

    @Test
    public void testMax() {
        Vessel<Integer> v1 = new Vessel<Integer>();
        Vessel<Integer> v2 = new Vessel<Integer>();
        v1.put(1);
        v2.put(2);
        System.out.println(VesselHelper.max(v1, v2));
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestVesselHelper.class);
    }
}   