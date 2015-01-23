/** Demonstrate how strings work
 *  @author Josh Hug
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = new String();
        /* Strings are one of the very few things
         * that can be made without 'new' .
         */
        s = "ketchup brains";
        System.out.println(s);

        /* Let's make s uppercase. */
        s = s.toUpperCase();
        System.out.println(s);

    }
} 