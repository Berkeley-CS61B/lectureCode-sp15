/** 
 *  @author Josh Hug
 */

public class Point2D {
    private int x;
    private int y;

    public String toString() {
        return ("Point2D: " + x + ", " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point2D(int xC, int yC) {
        x = xC;
        y = yC;
    }
} 