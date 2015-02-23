/** 
 *  @author Josh Hug
 */

public class MysteriousError {

    public static void doStuff(double x, double y) {
        return;
    }

    public static void doStuff(Object x, Object y) {
        return;
    }

    public static void doStuff(int x, int y) {
        return;
    }

    public static void main(String[] args) {
        int x = 5;
        doStuff(new Integer(5), x);
        Vessel<Integer> v = new Vessel<Integer>();
        v.put(10);
        doStuff(v.peek(), 5);
    }
} 