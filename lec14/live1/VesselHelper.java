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

    public static <ZX extends Comparable<ZX>> ZX max(Vessel<ZX> x, Vessel<ZX> y) {
        ZX xVal = x.peek();
        ZX yVal = y.peek();
        if (xVal.compareTo(yVal) > 0) {
            return xVal;
        }
        return yVal;
    }

    /* ratio is trickier */

    /* Approach below will not work unless you pass EXACTLY a Vessel<Number>.
     * For example, we could not pass in a Vessel<Integer>, because a 
     * a Vessel<Integer> is-not-a Vessel<Number>. */
    /*public static double ratio(Vessel<Number> v1, Vessel<Number> v2) {
        double d1 = v1.peek().doubleValue();
        double d2 = v2.peek().doubleValue();
        return d1 / d2;
    }    */


    /** The preferred approach. */
    public static double ratio(Vessel<? extends Number> x, Vessel<? extends Number> y) {
        Number xVal = x.peek(); // assignment allowed since ? is-a Number, 
        Number yVal = y.peek(); // even though we don't know what ? is.
        return xVal.doubleValue() / yVal.doubleValue();
    }

    /*
    This approach also works, but is a little more verbose than the version above.

    Either approach is fine on project 1.

    public static <T1 extends Number, T2 extends Number> 
    double ratio(Vessel<T1> x, Vessel<T2> y) {
        T1 xVal = x.peek();
        T2 yVal = y.peek();
        return xVal.doubleValue() / yVal.doubleValue();
    }
    */

} 