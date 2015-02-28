/** Does stuff with vessels in a contrived manner to draw out
 *  annoying themes with Generics. 
 *  @author Josh Hug
 */

/* Methods can have type parameters too!
 * Specify them BEFORE the return type of the method. */

public class VesselHelper {
    /* Remove the item from the vessel and return it. */
    public static Integer remove(Vessel<Integer> v) {
        Integer rVal = v.peek();
        v.put(null); // displace the occupant.
        return rVal;
    }

    public static Integer max(Vessel<Integer> x, Vessel<Integer> y) {
        Integer xVal = x.peek();
        Integer yVal = y.peek();
        if (xVal.compareTo(yVal) > 0) {
            return xVal;
        }
        return yVal;
    }

    public static double ratio(Vessel<Integer> x, Vessel<Integer> y) {
        Integer xVal = x.peek();
        Integer yVal = y.peek();
        return ((double) xVal) / ((double) yVal);
    }
} 