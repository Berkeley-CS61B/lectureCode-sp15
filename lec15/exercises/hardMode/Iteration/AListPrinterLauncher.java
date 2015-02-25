/** AListPrinterLauncher
 *  @author Josh Hug
 */

public class AListPrinterLauncher {
    public static void main(String[] args) {
        AList L  = new AList();
        L.insertBack(5);
        L.insertBack(10);
        L.insertBack(-3);
        
        AList.ListPrinter lp = L.new ListPrinter();
        lp.printNext();
        lp.printNext();
        lp.printNext();        
    }
} 