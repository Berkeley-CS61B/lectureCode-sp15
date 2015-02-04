/** A much more user friendly and reasonable
 *  class representing a list of numbers
 *  @author Josh Hug
 */

public class SList {
    public IntNode front;
    public int size;

    public SList() {
        size = 0;
        front = new IntNode(89724, null);
    }

    public SList(int x) {
        front = new IntNode(98712, null);
        front.next = new IntNode(x, null);
        size = 1;
    }

    public void insertBack(int x) {
        IntNode p = front;

        // step p along until p.next == null
        // because this means that p is the last
        // item.
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
        size = size + 1;
    }

    // start with:
    // [???] -> [53]

    // want to insert: 16
    // a new node is created!! [16] --> [53]


    public void insertFront(int x) {
        IntNode oldFrontItem = front.next;
        IntNode newFrontItem = new IntNode(x, oldFrontItem);
        front.next = newFrontItem;
        size = size + 1;
    }

    /** Returns number of items in this SList. */
    public int size() {
        return size;
    }

    /** Returns front item in list. */
    public int getFront() {
        return front.next.item;
    }

    /** Returns back item in list. */
    public int getBack() {
        IntNode p = front;

        // step p along until p.next == null
        // because this means that p is the last
        // item.
        while (p.next != null) {
            p = p.next;
        }

        return p.item;
    }

    //SizeExercise.java
} 