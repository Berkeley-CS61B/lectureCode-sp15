/** 
 *  @author Josh Hug
 */

public class ChattyTripler extends Tripler {

    /** Triples X N times. For example:
      * triple(5, 2) would be 5*3*3 = 45. 
      * Also tells us what it's doing as it goes. */
    @Override
    public int triple(int x, int n) {
        int r = x;
        for (int i = 0; i < n; i += 1) {
            r = triple(r);
            System.out.println(r);
        }
        return r;
    }    

    public static void main(String[] args) {
        ChattyTripler ct = new ChattyTripler();
        ct.triple(5, 2);
    }
}
