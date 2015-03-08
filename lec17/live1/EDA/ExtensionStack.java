/** 
 *  @author Josh Hug
 */
import java.util.LinkedList;

/* Extension! */
public class ExtensionStack<Zerp> extends LinkedList<Zerp>{
    // LinkedList has the following handy operations:
    // add(int index, E element) puts elmeent E in position index
    // remove(int index): removes item and returns at position

    public void put(Zerp x) {
        this.add(0, x);
    }

    public Zerp pop() {
        /* Invariant: Top item is always in position 0. */
        return this.remove(0);
    }
} 