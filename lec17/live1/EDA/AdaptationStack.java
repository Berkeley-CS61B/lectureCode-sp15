/** 
 *  @author Josh Hug
 */
import java.util.List;

/* Adaptation! Avoid hard coding our type of List. */
public class AdaptationStack<Zerp> {
    List<Zerp> secretList;

    // LinkedList has the following handy operations:
    // add(int index, E element) puts elmeent E in position index
    // remove(int index): removes item and returns at position
    public Stack() {
        secretList = new LinkedList<Zerp>;
    }

    public Stack(List<Zerp> listToUse) {
        secretList = listToUse;
    }

    public void put(Zerp x) {
        secretList.add(0, x);
    }

    public Zerp pop() {
        /* Invariant: Top item is always in position 0. */
        return secretList.remove(0);
    }
} 