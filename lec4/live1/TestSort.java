/** Tests the sort class.
 *  @author Josh Hug
 */
import org.junit.Test;
import static org.junit.Assert.*;

/** Annoyances at the moment: 
 * 1. Output is too verbose!
 * 2. Have to manually comment out tests we don't really care about.
 * 3. Have to manually invoke tests. */

/* To fix these (black magic!):
 1. Annotate each test with @org.junit.Test
 2. Make out methods non-static.
 3. jh61b.junit.textui.runClasses */

/** More annoyances:
 * Typing out org.junit.Test and org.junit.Assert is annoying.
*/

/* To address:
 * start our Java files with:
 * import org.junit.Test
 * import static org.junit.Assert.* */

public class TestSort {

    /** Tests the Sort.sort method. */
    @Test
    public void testSort() {
        String[] input = {"a", "huge", "tiny", "scorpion"};
        Sort.sort(input);
        String[] expected = {"a", "huge", "scorpion", "tiny"};
        assertArrayEquals(expected, input);        
    }

    /** Tests the indexOfSmallest method. */
    @Test
    public void testIndexOfSmallest() {
        String[] input = {"a", "huge", "tiny", "scorpion"};
        int actual = Sort.indexOfSmallest(input, 0);
        int expected = 0;

        assertEquals(expected, actual);

        actual = Sort.indexOfSmallest(input, 2);
        expected = 3; 

        assertEquals(expected, actual);
    }

    @Test
    public void testSwap() {
        String[] input = {"a", "huge", "tiny", "scorpion"};
        Sort.swap(input, 0, 2);
        String[] actual = {"tiny", "huge", "a", "scorpion"};
        assertArrayEquals(input, actual);
    }

    /** Tests the Sort class's methods.
     */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestSort.class);
    }
} 

/* Terrible repository of bad stuff:
        // Test to see if input is the same thing as expected.
        // If not, print something useful to the programmer.
        if (input.length != expected.length) {
            System.out.println("testSort() FAILURE!!");
            System.out.println("Lengths did not match.");
            System.out.println("input length: " + input.length);
            System.out.println("expected length: " + expected.length);
        }

        int i = 0;
        while (i < input.length) {
            if (input[i] != ...)
        }
        */