/** 
 *  @author Josh Hug
 */
import java.util.List;
//Use this to add things: add(int index, E element) 
//                        remove(int index)

public class AdaptationStack<Zerp> {
    List<Zerp> secretList;

    public AdaptationStack(List<Zerp> providedList) {
        secretList = providedList;
    }

    public void push(Zerp x) {
        secretList.add(0, x);
    }

    public Zerp pop() {
        return secretList.remove(0);
    }
} 