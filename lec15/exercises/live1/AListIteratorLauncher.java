/** AListPrinterLauncher
 *  @author Josh Hug
 */

public class AListIteratorLauncher {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(5);
        L.insertBack(10);
        L.insertBack(-3);
        AList.AListIterator ali =
            L.new AListIterator();
        System.out.println(ali.next());
        System.out.println(ali.next());
        System.out.println(ali.next());        
        System.out.println(ali.next());        
        }
    }