/** Class that triples numbers
 *  @author Josh Hug
 */

public class Tripler {
    /* Triples X. */
    /*public int triple(int x) {
        return 3 * x;
    }*/
    public int triple(int x) {
        return triple(x, 1);
    }

    /** Triples X N times. For example:
      * triple(5, 2) would be 5*3*3 = 45. */
    public int triple(int x, int n) {
        int r = x;
        for (int i = 0; i < n; i += 1) {
            r = 3 * r;
        }
        return r;
    }

} 