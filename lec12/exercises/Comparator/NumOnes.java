/** 
 *  @author Josh Hug
 */

/* Your job here is to convert NumOnes into a Comparator as described in the
 * google slides linked from the readme.md folder in the same directory as this 
 * file. */

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