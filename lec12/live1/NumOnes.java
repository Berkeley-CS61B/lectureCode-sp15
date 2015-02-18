/** 
 *  @author Josh Hug
 */

public class NumOnes implements Comparator<Integer>{

    /* Counts all 1s in x. Example: -1 would return 32. */
    public static int numOnes(int x) {
        // 5:  000101
        // 11: 001011
        // 
        // 11: 001011
        // total (decimal): 1 
        //     ---> 00101
        int total = 0;
        for (int i = 0; i < 32; i += 1) {
            /* I am adding the right most bit, and then destroying it. */
            int rightMostBit = x & 1;  
            total += rightMostBit;
            x = x >>> 1;
        }

        public int compare(Integer a, Integer b) {
            return numOnes(a) - numOnes(b);
        }

    }

    public static void main(String[] args) {
        
    }
} 