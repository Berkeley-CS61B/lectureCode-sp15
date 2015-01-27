/** 
 *  @author Josh Hug
 */

public class IntListOps {
    /** Returns list identical to L, but with
     * each item incremented by x. Not changing
     * L in any way */
    public static IntList incrList(IntList L, int x) {
        if (L == null)
            return null;
        
        int desiredHead = L.head + x;
        IntList desiredTail = incrList(L.tail, x); ///the rest of the list incremented by x
        return new IntList(desiredHead, desiredTail);
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L.tail = new IntList(614, null);
        IntListOps slops = new IntListOps();
        System.out.println(IntListOps.incrList(L, 5));
    }
} 