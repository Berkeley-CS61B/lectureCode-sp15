/** 
 *  @author Josh Hug
 */
import java.util.LinkedList;
//Use this to add things: add(int index, E element) 
//                        remove(int index)

public class ExtensionStack<Zerp> extends LinkedList<Zerp> {
    public void push(Zerp x) {
        this.add(0, x);
    }

    public Zerp pop() {
        return this.remove(0);
    }

    public static void main(String[] args) {
        ExtensionStack<Integer> es = new ExtensionStack<Integer>();
        es.push(5);
        es.push(6);
        //can also use the addAll method... weird
        // dangerous, who knows what order things go in: es.addAll();
    }
} 