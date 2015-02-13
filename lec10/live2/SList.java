/** 
 *  @author Josh Hug
 */

public class SList implements XList {
    protected IntNode sentinel;
    /* Do not change anything below this line. */

    private int size;

    public SList() {
        size = 0;
        sentinel = new IntNode(999, null);
    }

    public SList(int x) {
        sentinel = new IntNode(999, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    @Override
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
        System.out.println("SList's insert front was called.");

        IntNode oldFront = sentinel.next;
        sentinel.next = new IntNode(x, oldFront);
        size = size + 1;
    }

    public int getFront() {
        return sentinel.next.item;
    }

    @Override
    public int getBack() {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }

        // p is the LAST node at this point
        return p.item;
    }


    @Override
    public int size() {
        return size;
    }

} 