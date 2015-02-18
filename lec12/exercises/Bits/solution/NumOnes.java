/** 
 *  @author Josh Hug
 */

public class NumOnes {
    /** Returns the number of ones in the binary representation of x. */
    public static int numOnes(int x) {
        int totalOnes = 0;
        for (int i = 0; i < 32; i += 1) {
            int bottomBit = x & 1;
            totalOnes += bottomBit;
            x = x >> 1;
        }
        return totalOnes;
    }
} 