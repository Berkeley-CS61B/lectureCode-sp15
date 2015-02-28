import org.junit.Test;
import static org.junit.Assert.*;

/** Tests VesselHelper
 *  @author Josh Hug
 */

public class TestRatio {
    @Test
    public void testRatio() {
        Vessel<Integer> vInteger = new Vessel<Integer>();
        Vessel<Double> vDouble = new Vessel<Double>();
        vInteger.put(20);
        vDouble.put(2.0);

        assertEquals((Double) 10.0, VesselHelper.ratio(vInteger, vDouble), 1e-5);
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestRatio.class);
    }
}   