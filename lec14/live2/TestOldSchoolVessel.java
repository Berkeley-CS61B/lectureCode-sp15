import org.junit.Test;
import static org.junit.Assert.*;

/** Test the old school vessel class.
 *  @author Josh Hug
 */

public class TestOldSchoolVessel {
    @Test
    public void testBasics() {
        OldSchoolVessel osv = new OldSchoolVessel();
        Integer x = new Integer(5);
        osv.put(x);
        /* Is Object an Integer?
           Maybe not, so don't allow. */
        Integer contents = (Integer) osv.peek(); 
        System.out.println(contents);
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestOldSchoolVessel.class);
    }
} 