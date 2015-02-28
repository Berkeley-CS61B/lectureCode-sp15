/** AListPrinterLauncher
 *  @author Josh Hug
 */

import java.util.Iterator;

public class AListIteratorLauncher2 {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(5);
        L.insertBack(10);
        L.insertBack(-3);    
        ` ali2 =
            L.new AListIterator();

        while (ali2.hasNext()) {
            System.out.println(ali2.next());
        }

        ali2.next(); // bad thing to do

    }
} 