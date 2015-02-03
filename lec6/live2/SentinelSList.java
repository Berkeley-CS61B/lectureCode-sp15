/** SentinelSList Sentinel 
 *  @author Josh Hug
 */

public class SentinelSList {
    private IntNode front;
    private int size;

    public void insertBack(int x) {
        /*if (front == null) {
            front = new IntNode(x, null);
            size = 1;
            return;
        }*/

        IntNode p = front;
        while (p.next != null) {
            p = p.next;
        }

        // p is the LAST node at this point
        p.next = new IntNode(x, null);
        size = size + 1;
    }

    public int getBack() {
        IntNode p = front;
        while (p.next != null) {
            p = p.next;
        }

        // p is the LAST node at this point
        return p.item;
    }

    public int size() {
        return size;
    }

    /* Return the size of the sublist starting
     * at IntNode x */
    /*private int size(IntNode x) {
        if (x == null)
            return 0;
        return 1 + size(x.next);
    }*/

    public SentinelSList(int x) {
        front = new IntNode(16, null);
        front.next = new IntNode(x, null);
        size = 1;
    }

    public SentinelSList() {
        size = 0;
        front = new IntNode(4, null);
    }

    public int getFront() {
        return front.next.item;
    }

    public void insertFront(int x) {
        front.next = new IntNode(x, front.next);
        size = size + 1;
    }

} 