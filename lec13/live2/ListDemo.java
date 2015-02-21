import java.util.List;
import java.util.ArrayList;

/** 
 *  @author Josh Hug
 */

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<Integer>();
    
        L.add(5);
        L.add(10);
        L.add(15);
        System.out.println(L.contains(5));
    }
} 