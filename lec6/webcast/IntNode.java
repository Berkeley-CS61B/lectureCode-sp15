/** Defines a recursive integer list.
 *  @author Josh Hug
 */

public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int h, IntNode n) {
        item = h;
        next = n;
    }
}