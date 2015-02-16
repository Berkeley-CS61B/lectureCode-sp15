/** 
 *  @author Josh Hug
 */

public class Twicer {
    private static int doTwice(IntUnaryFunction iuf , int x) {
        return iuf.apply(iuf.apply(x));
    }

    public static void main(String[] args) {
        System.out.println(doTwice(new TenX(), 2));
    }
} 