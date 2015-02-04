/** Demo of IntList Ops
 *  @author Josh Hug
 */

public class IntListLauncher {
    public static void main(String[] args) {
        IntList x = new IntList(100, null);
        x.tail = new IntList(5, null);

        // x: 100 -> 5
        IntList y = x;

        // y: 100 -> 5

        // how do we add to the front of x?
        x = new IntList(99, x);

        // x: 99 -> 100 -> 5
        // y: 100 -> 5

        x = null;
        System.out.println(x.size());

    }
} 