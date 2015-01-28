/** Tests the Sort class.
 * 
 *  There is no exercise in this file. 
 * 
 *  @author Josh Hug
 */

public class TestSort {

    /** Tests the Sort.sort method. */
    public static void testSort() {
        String[] input = {"a" , "pig", "dreamt", "nothing"};
        String[] expected = {"a", "dreamt", "nothing", "pig"};
        Sort.sort(input);

        // Goal: Compare input and expected.
        // If they do not match, then let the user know
        // with a printed message.

        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void testSwap() {
        String[] input = {"a" , "pig", "dreamt", "nothing"};
        String[] expected = {"a" , "nothing", "dreamt", "pig"};
        Sort.swap(input, 1, 3);

        org.junit.Assert.assertArrayEquals(expected, input);

    }

    /** Tests the Sort.indexOfSmallest method */
    public static void testIndexOfSmallest() {
        String[] input = {"a" , "pig", "dreamt", "nothing"};
        int actual = Sort.indexOfSmallest(input, 0);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);

        actual = Sort.indexOfSmallest(input, 1);
        expected = 2;

        org.junit.Assert.assertEquals(expected, actual);
    }

    /** Runs tests.
     */

    public static void main(String[] args) {
        testIndexOfSmallest();
        testSwap();
        testSort();
    }
}  

/* Pain graveyard of bad ideas:
        if (input.length != expected.length) {
            System.out.println("testSort(): Lengths did not match.");
            System.out.println("input length: " + input.length);
            System.out.println("expected length: " + expected.length);            
        }

        //same length, so now test actual elements
        int i = 0;
        while (i < input.length) {
            if (input[i] != expected[i]) ...
        } */