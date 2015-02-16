/** Demo class for Comparators
 *  @author Josh Hug
 */
import java.util.Arrays;

public class Point2DLauncher {
    public static void main(String[] args) {
        Point2D x = new Point2D(-5, 20);
        Point2D y = new Point2D(15, -5);
        Point2D z = new Point2D(30, 0);

        Point2D[] points = new Point2D[]{x, y, z};

        /* Your single line of code here */
        XComparator xComparator = new XComparator();
        Arrays.sort(points, xComparator);
        System.out.println("Sorted by x coordinate:");
        System.out.println(Arrays.toString(points));

        /* Your single line of code here */
        //Arrays.sort(points, yComparator);
        //System.out.println("Sorted by y coordinate:");
        //System.out.println(Arrays.toString(points));
    }
} 