/** Tests the methods in the Sort class.
 *  @author Josh Hug
 */
import org.junit.Test;
import static org.junit.Assert.*;

/** current annoyances:
 * 1. We have to manually invoke all of our tests in main.
 * 2. We have to comment things out that we don't actaully want to run.
 * 2b (alternate statement). Test failure causes entire thing to stop.
 * 3. Output is hard to read.
 
  To fix these:
  1. Prepend each test with @org.junit.Test
  2. Let's make all tests non-static (!!??)
  3. Replace manual invocations with jh61b.junit.textui.runClasses
 
Remaining annoyances:
1. It is annoying to write org.junit all over the place
2. org.junit.Assert is also annoying.

To fix these, use MORE MAGIC:
import org.junit.Test; <-- means you can just type @Test
import static org.junit.Assert.*; <-- you can omit org.junit.Assert
 */

public class TestSort {
    /** Tests the sort method of the Sort class. */
    @Test
    public void testSort() {
        String[] input = {"a", "clever", "happy", "dog"};
        String[] expected = {"a", "clever", "dog", "happy"};
        Sort.sort(input);

        // Check that input is equal to expected.
        // If it is not, then print out a useful message for
        // the programmer (to be used for fixing code).
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIndexOfSmallest() {
        String[] input = {"a", "clever", "happy", "dog"};
        int actual = Sort.indexOfSmallest(input, 0);
        int expected = 0;

        assertEquals(expected, actual);
        actual = Sort.indexOfSmallest(input, 2);
        expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    public void testSwap() {
        String[] input = {"a", "clever", "happy", "dog"};        
        Sort.swap(input, 0, 2);
        String[] expected = {"happy", "clever", "a", "dog"};        
        assertArrayEquals(input, expected);
    }

    /** Run tests.
     */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestSort.class);
    }
} 

/** Graveyard of forgotten dreams and sadness.
        // Check that input is equal to expected.
        // If it is not, then print out a useful message for
        // the programmer (to be used for fixing code).
        if (input.length != expected.length) {
            System.out.println("testSort(): Lengths did not match!");
            System.out.println("input length: " + input.length);            
            System.out.println("expected length: " + expected.length);        
        }

        int i = 0;
        while (i < input.length) {
            if (input[i] != expected[i]) {
                ...
                
            }
        } */