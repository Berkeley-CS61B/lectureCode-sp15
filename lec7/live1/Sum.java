/** 
 *  @author Josh Hug
 */

public class Sum {
    /** sums the usual way */
    public static int whileSum(int[] a) {
        int sum = 0;
        int i = 0; // initialization
        while (i < a.length) { // inspection or a check
            sum += a[i];
            i += 1; // iteration
        }
        return sum;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i += 1) {
            sum += a[i];
        }
        return sum;
    }



    /** Demos summing integers.
     */

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(whileSum(nums));
        System.out.println(sum(nums));

    }
} 