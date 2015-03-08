/** 
 *  @author Josh Hug
 */
import java.util.LinkedList;
//Use this to add things: add(int index, E element) 
//                        remove(int index)

public class DelegationStack<Zerp> {
    LinkedList<Zerp> secretList;

    public DelegationStack() {
        secretList = new LinkedList<Zerp>();
    }

    public void push(Zerp x) {
        secretList.add(0, x);
    }

    public Zerp pop() {
        return remove(0);
    }
} 