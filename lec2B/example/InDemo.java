/** Demonstrates the power of the In class
 *  @author Josh Hug
 */

public class InDemo {
    /** Prints the length of the file provided as a command
     *  line argument.
     */

    public static void main(String[] args) {
        In in = new In("http://www.math.sjsu.edu/~hsu/courses/126/first-500-primes.txt");
        int sum = 0;
        while (!in.isEmpty()) {
            int x = in.readInt();
            sum = sum + x;
        }
        System.out.println(sum);

    }
} 

//http://www.math.sjsu.edu/~hsu/courses/126/first-500-primes.txt