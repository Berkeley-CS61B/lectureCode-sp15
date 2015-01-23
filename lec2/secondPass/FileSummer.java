/** Another demonstration of the utility of In.
 *  @author Josh Hug
 */

public class FileSummer {
    /** Reads in the file given by command line args and 
     *  prints the sum of the numbers in the file. */

    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        int sum = 0;
        while (!in.isEmpty()) {
            int nextNumber = in.readInt();
            sum = sum + nextNumber;
        }
        System.out.println(sum);
    }
} 