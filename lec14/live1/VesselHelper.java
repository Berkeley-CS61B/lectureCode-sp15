/** Does stuff with vessels in a contrived manner to draw out
 *  annoying themes with Generics.
 *  @author Josh Hug
 */

/* Methods can have type parameters too!
 * Specify them BEFORE the return type of the method. */

public class VesselHelper {
    /* Remove the item from the vessel and return it. */
    public static <Slaggathor> Slaggathor remove(Vessel<Slaggathor> v) {
        Slaggathor rVal = v.peek();
        v.put(null); // displace the occupant.
        return rVal;
    }

    public static <ZX extends Comparable> ZX max(Vessel<ZX> x, Vessel<ZX> y) {
        ZX xVal = x.peek();
        ZX yVal = y.peek();
        if (xVal.compareTo(yVal) > 0) {
            return xVal;
        }
        return yVal;
    }

    public static <T1 extends Number, T2 extends Number> 
    double ratio(Vessel<T1> x, Vessel<T2> y) {
        T1 xVal = x.peek();
        T2 yVal = y.peek();
        return xVal.doubleValue() / yVal.doubleValue();
    }
} 