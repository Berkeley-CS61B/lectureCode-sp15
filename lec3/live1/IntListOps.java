/** 
 *  @author Josh Hug
 */

public class IntListOps {
    /** returns identical to L, but with every item
    * incremented by x, L cannot change. */
    public static IntList incrList(IntList L, int x) {
        if (L == null)
            return null;
        int newHead = L.head + x;
        IntList newTail = incrList(L.tail, x);
        return new IntList(newHead, newTail);
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L.tail = new IntList(15, null);
        System.out.println(incrList(L, 5));
                
    }
} 