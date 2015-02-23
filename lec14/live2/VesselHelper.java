/** 
 *  @author Josh Hug
 */

/* Methods can ALSO have formal type parameters.
 * We specifiy such paramters RIGHT BEFORE the return type of the method. 
 * Such a method is called a generic method. */

public class VesselHelper {
    
    /** Destroy the contents of v, and return what was
      * once there. */
    public static <Jabberwocky> Jabberwocky remove(Vessel<Jabberwocky> v) {
        Jabberwocky returnValue = v.peek();
        v.put(null);
        return returnValue;
    }

    public static <Plarp extends Comparable<Plarp>> Plarp max(Vessel<Plarp> v1, Vessel<Plarp> v2) {
        Plarp v1val = v1.peek();
        Plarp v2val = v2.peek();
        if (v1val.compareTo(v2val) > 0) {
            return v1val;
        }
        return v2val;
    }

    public static double ratio(Vessel<Number> v1, Vessel<Number> v2) {
        double d1 = v1.peek().doubleValue();
        double d2 = v2.peek().doubleValue();
        return d1 / d2;
    }    
} 