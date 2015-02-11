/** 
 *  @author Josh Hug
 */

public class SList {
    protected IntNode sentinel;
    /* Do not change anything below this line. */

    protected int size;

    public SList() {
        size = 0;
        sentinel = new IntNode(999, null);
    }

    public SList(int x) {
        sentinel = new IntNode(x, null);
        size = 1;
    }

    public void insertBack(int x) {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }

        // p is the LAST node at this point
        p.next = new IntNode(x, null);
        size = size + 1;
    }

    public void insertFront(int x) {
        System.out.println("The SList version was called.");

        IntNode oldFront = sentinel.next;
        sentinel.next = new IntNode(x, oldFront);
        size = size + 1;
    }

    public int getFront() {
        return sentinel.next.item;
    }

    public int getBack() {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }

        // p is the LAST node at this point
        return p.item;
    }

    public int size() {
        return size;
    }

} 