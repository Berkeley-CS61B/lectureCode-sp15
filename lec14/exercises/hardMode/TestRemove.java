import org.junit.Test;
import static org.junit.Assert.*;

/** Tests VesselHelper
 *  @author Josh Hug
 */

public class TestRemove {
    
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

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestRemove.class);
    }
}   