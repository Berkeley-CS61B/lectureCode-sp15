/** 
 *  @author Josh Hug
 */

public class IntListLauncher {

    public static void main(String[] args) {
        IntList x = new IntList(5, null);
        x.tail = new IntList(10, null);

        // x: 5 --> 10
        IntList y = x;

        // y: 5 --> 10

        x = new IntList(9, x);
        // goal: x: 9 --> 5 --> 10
        // y: 5 --> 10

        IntList empty = null;
        System.out.println(empty.size());
    }
} 