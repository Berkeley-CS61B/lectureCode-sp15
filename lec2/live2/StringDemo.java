/** Demonstrates strings.
 *  @author Josh Hug
 */

public class StringDemo {
    public static void main(String[] args) {
        String s = new String();

        /* Strings are one of the few thigns in Java
         * that can be created without the word new.
         * in particular, use "" */

        System.out.println(s);
        String s2 = "ramseynumber";
        s2 = s2.toUpperCase();
        System.out.println(s2);
        /* Let's print s2 in upper case! */

        

    }
} 