/** Demonstrates use of the In file for reading text files.
 *  @author Josh Hug
 */

public class FileLength {
    /** Reads in the file given by command line args and 
     *  prints the number of characters in the file.
     */

    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        String fileContents = in.readAll();
        System.out.println(fileContents.length());
    }
} 