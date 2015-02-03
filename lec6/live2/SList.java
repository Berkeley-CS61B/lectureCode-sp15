/** 
 *  @author Josh Hug
 */

public class SList {
    private IntNode front;
    private int size;

    public void insertBack(int x) {
        if (front == null) {
            front = new IntNode(x, null);
            size = 1;
            return;
        }

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

    public SList(int x) {
        front = new IntNode(x, null);
        size = 1;
    }

    public SList() {
        size = 0;
        front = null;
    }

    public int getFront() {
        return front.item;
    }

    public void insertFront(int x) {
        front = new IntNode(x, front);
        size = size + 1;
    }

} 