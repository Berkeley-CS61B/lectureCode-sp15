/** 
 *  @author Josh Hug
 */

public class NumOnes implements Comparator<Integer>{
    public int compare(Integer x, Integer y) {
        return numOnes(x) - numOnes(y);
    }

    /** */
    public static int numOnes(int x) {
        /* 5:  000101
           11: 001011  ----> 00101 
        */
        int total = 0;
        
        while (x != 0) {
            int rightmostBit = x & 1;
            total += rightmostBit;

            // destroys rightmost bit, putting zero up top
            x = x >>> 1;
        }

        return total;
    }

    public static void main(String[] args) {
        Comparator<Integer> numComparer = new NumOnes();
        int cmp = ????.compare(-1, 5);

    }
} 