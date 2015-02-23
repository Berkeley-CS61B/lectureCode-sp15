/** 
 *  @author Josh Hug
 */

public class BoxingDemo {
    public static void main(String[] args) {
        Integer x = new Integer(10);
        x = x + 1;
        /* Code above is secretly three steps:
         * 1. int primitiveX = x.intValue();
         * 2. primitiveX = primitiveX + 1;
         * 3. x = new Integer(primitiveX);
         */

        System.out.println(x);
    }
} 