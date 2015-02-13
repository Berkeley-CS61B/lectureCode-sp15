/** sums integer arrays
 *  @author Josh Hug
 */

public class Sum {
    /** 
     */
    public static int whileSum(int[] a) {
        int i = 0; // initialize 
        int sum = 0;
        while (i < a.length) {  //check 
            sum += a[i];
            i += 1; //iterate
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

    public static void main(String[] args) {
       int[] ints = new int[]{1, 2, 3, 4};
       System.out.println(whileSum(ints));
       System.out.println(sum(ints)); 
    }
} 