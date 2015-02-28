
/** AListForEachLauncher
 *  @author Josh Hug
 */
import java.util.Iterator;

public class AListForEachLauncher {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(50);
        L.insertBack(51);
        L.insertBack(52);    
        Iterator<Integer> ii = L.iterator();

        for (int x : L) {
            for (int y : L) {
                System.out.println(x + " " + y);
            }
        }

    }
} 