import org.junit.Test;
import static org.junit.Assert.*;

/** Tests goal one for hard mode exercises for lecture 14
 *  @author Josh Hug
 */

public class TestGoalOne {
    @Test
    public void testVessel() {
        Vessel<Integer> vi = new Vessel<Integer>();
        int x = 5;
        vi.put(x); //autoboxes into an Integer, Integer is-an Object
        int y = vi.peek(); // no unboxing, returns an Object
        assertEquals(5, y);
        assertEquals((Integer) 5, vi.peek());

        Vessel<String> vst = new Vessel<String>();
        vst.put("hello");
        assertEquals("hello", vst.peek());
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestGoalOne.class);
    }
} 