import org.junit.Test;
import static org.junit.Assert.*;

/** tests OldSchoolVessel
 *  @author Josh Hug
 */

public class OldSchoolVesselTest {
    @Test
    public void testVessel() {
        OldSchoolVessel osv = new OldSchoolVessel();
        int x = 5;
        osv.put(x); //autoboxes into an Integer, Integer is-an Object
        int y = (Integer) osv.peek(); // no unboxing, returns an Object
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(OldSchoolVesselTest.class);
    }
}   