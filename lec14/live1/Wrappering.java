/** 
 *  @author Josh Hug
 */

public class Wrappering {
    public static void main(String[] args) {
        Integer x = new Integer(5);
        System.out.println(x);
        x = x + 1;
        // equivalent
        // int xPrimitive = x.intValue();   unboxing
        // xPrimitive = xPrimitive + 1;     addition
        // x = new Integer(xPrimitive);     autoboxing

        System.out.println(x);

        int z = 5;
        z = z + 1; // does what it says. operates on primitives, no classes involves.
    }
} 