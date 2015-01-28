/** Class for printing args in sorted order.
 *
 *  The exercise in this file is to finish the print() and main() methods.
 *  Given that JUnit doesn't give us any way to test print statements,
 *  you do not need to write any tests.
 *
 *  @author Josh Hug
 */

public class Sort {
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
        swap(a, start, mindex);

        // selection sort the rest
        sort(a, start + 1);
    }

    /** Swaps items in position ix and iy such that the
      * actual data in the array is changed. */
    public static void swap(String[] a, int ix, int iy) {
        /* YOUR CODE HERE */
        String temp = a[ix];
        a[ix] = a[iy];
        a[iy] = temp;
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