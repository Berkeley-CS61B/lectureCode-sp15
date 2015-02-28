/** AListPrinterLauncher
 *  @author Josh Hug
 */

public class AListIteratorLauncher2 {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(50);
        L.insertBack(51);
        L.insertBack(52);    
        AList.AListIterator ali2 =
            L.new AListIterator();
        while (ali2.hasNext()) {
            System.out.println(ali2.next());
        }

    }
} 