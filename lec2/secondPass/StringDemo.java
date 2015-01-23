/** This class demonstrates how strings work.
 *  @author Josh Hug
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);
        s = "hamburge";
        System.out.println(s);
        s = s + "r";
        System.out.println(s);

        /* Goal: Turn s into upper case? */
        /* Note: Strings are immutable. */
        s = s.toUpperCase();
        System.out.println(s);

    }
} 