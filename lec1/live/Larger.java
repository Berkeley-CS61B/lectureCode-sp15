
public class Larger {
    /* The equivalent of python's def() is:
     * public static (well for today at least)
     *
     * Just like variables, functions have
     * a declared return type, and parameters
     * have declared types.
     */

    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5, 10));
    }
} 