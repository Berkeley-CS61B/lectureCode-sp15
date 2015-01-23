/** Demonstrated command line arguments.
 *  @author Josh Hug
 */

public class ArgsDemo {

    public static void main(String[] args) {
        int index = 0;
        while (index < args.length) {
            System.out.println(args[index]);
            index = index + 1;
        }
    }
} 