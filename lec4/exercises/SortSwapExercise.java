/** Class for printing args in sorted order.
 *  Exercise for slide 13:  http://goo.gl/MqfmmR
 *  Your goal is to write swap and include the appropriate call
 *  inside the sort method (ctrl-F for 'YOUR CODE HERE')
 *
 *  You can test your solution with TestSortSwapExercise.java
 *  @author Josh Hug
 */

public class SortSwapExercise {
    /** Sorts the array. */
    public static void sort(String[] a) {
        sort(a, 0);
    }

    /** Sorts A starting from position START. */
    private static void sort(String[] a, int start) {
        if (start == a.length)
            return;
        // find the smallest item
        int mindex = indexOfSmallest(a, start);

        // move it to the front (by swapping)
        /* YOUR CODE HERE */

        // selection sort the rest
        sort(a, start + 1);
    }

    /** Swaps items in position ix and iy such that the
      * actual data in the array is changed. */
    public static void swap(String[] a, int ix, int iy) {
        /* YOUR CODE HERE */
    }

    /** Find the smallest item in A starting from START. */
    public static int indexOfSmallest(String[] a, int start) {
        // start by assuming smallest thing is in position start
        int mindex = start;
        int i = start;
        while (i < a.length) {
            int cmp = a[i].compareTo(a[mindex]);
            if (cmp < 0) {
                mindex = i;
            }
            i += 1;
        }
        return mindex;
    }

    /** Prints A. */
    public static void print(String[] a) {

    }

    /** Prints args in sorted order.
     */

    public static void main(String[] args) {
        
    }
} 