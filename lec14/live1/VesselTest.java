import org.junit.Test;
import static org.junit.Assert.*;

/** tests OldSchoolVessel
 *  @author Josh Hug
 */

/* Integer is the actual type parameter. Fills in Blarg. */

public class VesselTest {
    @Test
    public void testVessel() {
        Vessel<Integer> osv = new Vessel<Integer>();
        int x = 5;
        osv.put(x); //autoboxes into an Integer, Integer is-an Object
        int y = osv.peek(); // no unboxing, returns an Object
        assertEquals(5, y);
        assertEquals((Integer) 5, osv.peek());

        Vessel<String> vst = Vessel<String>();
        
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(VesselTest.class);
    }
}   