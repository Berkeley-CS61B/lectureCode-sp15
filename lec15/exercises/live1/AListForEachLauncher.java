/** AListForEachLauncher
 *  @author Josh Hug
 */

public class AListForEachLauncher {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(50);
        L.insertBack(51);
        L.insertBack(52);    
        for (int x : L) {
            System.out.println(x);
        }

    }
} 