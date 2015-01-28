/** Provide the ability to print args in sorted order.
 *  @author Josh Hug
 */

public class Sort {
    /** Puts A in sorted order. */
    public static void sort(String[] a) {
        sort(a, 0);
    }

    /** Returns the index of the smallest thing in A,
      * starting from START. */
    public static int indexOfSmallest(String[] a, int start) {
        int minDex = start;
        int i = start;
        while (i < a.length) {
            int compareResult = a[i].compareTo(a[minDex]);

            if (compareResult < 0) {
                minDex = i;
            }
            i = i + 1;
        }
        return minDex;
    }

    /** Sort A starting from position START. */
    private static void sort(String[] a, int start) {
        if (start == a.length)
            return;

        // Find the smallest thing.
        int mindex = indexOfSmallest(a, start);

        // Swap it to the front.
        swap(a, mindex, start);

        // Recursively sort the rest.
        sort(a, start + 1);
    }

    /** Swap items in position IX and IY in A. */
    public static void swap(String[] a, int ix, int iy) {
        String temp = a[iy];
        a[iy] = a[ix];
        a[ix] = temp;
    }

    /** Prints A. */
    public static void print(String[] a) {
        //
    }

    /** Prints ARGS in sorted order. */
    public static void main(String[] args) {
        
    }
} 