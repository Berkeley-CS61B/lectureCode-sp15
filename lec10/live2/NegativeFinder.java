/** 
 *  @author Josh Hug
 */

public class NegativeFinder {
    /** Return true if the list has a negative number. */
    public static boolean hasNegative(XList L) {
        for (int i = 0; i < L.size(); i += 1) {
            if (L.get(i) < 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
} 