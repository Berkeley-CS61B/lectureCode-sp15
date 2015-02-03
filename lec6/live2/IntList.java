/** Defines a recursive integer list.
 *  @author Josh Hug
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }

    /** Returns the number of items in this IntList */
    public int size() {
        // if (tail.null == 0) { that was weird
        if (tail == null) {
            return 1;
        }
        return 1 + tail.size();
    }

    /** Returns the size, not using recursion. */
    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size = size + 1;
            p = p.tail;
        }
        return size;
    }

    /** Return ith item of int list */
    public int get(int i) {
        if (i == 0) {
            return head;
        }
        return tail.get(i - 1);
    }

    public String toString() {
        if (tail == null)
            return Integer.toString(head);
        return Integer.toString(head) + " " + tail.toString();
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L.tail = new IntList(614, null);
        /*System.out.println(L.head);
        System.out.println(L.tail.head);
        System.out.println(L.size());*/
        System.out.println(L.iterativeSize());
        System.out.println(L.get(50));
    }
} 