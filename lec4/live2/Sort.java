/** We will provide methods for printing out args in sorted order.
 *  @author Josh Hug
 */

public class Sort {
    /** Puts A into sorted order. */
    public static void sort(String[] a) {
        sort(a, 0);
    }

    /** Sorts the array A starting from START. */
    private static void sort(String[] a, int start) {
        if (start == a.length)
            return;

        // Find the smallest thing (location).
        int mindex = indexOfSmallest(a, start);

        // Swap it to the front.
        swap(a, start, mindex);

        // Selection sort the remaining N-1 things. [done]
        sort(a, start + 1);        
    }

    /** Swaps the items in IX and IY of A. */
    public static void swap(String[] a, int ix, int iy) {
        String temp = a[ix];
        a[ix] = a[iy];
        a[iy] = temp;
    }

    /** Returns the smallest item in A's position, starting from
      * position START. */
    public static int indexOfSmallest(String[] a, int start) {
        int mindex = start;
        int i = start;
        while (i < a.length) {
            int compareNumber = a[i].compareTo(a[mindex]);

            if (compareNumber < 0) {
                mindex = i;
            }
            i = i + 1;
        }
        return mindex;
    }

    /** Prints out A. */
    public static void print(String[] a) {

    }

    /**  Prints ARGS in sorted order.
     */
    public static void main(String[] args) {
        
    }
} 