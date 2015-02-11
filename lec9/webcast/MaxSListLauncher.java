/** 
 *  @author Josh Hug
 */

/* MaxSList launcher that you can experiment with. */
public class MaxSListLauncher { 
    public static void printFront(SList L) {
        System.out.println("Printing front of SList");
        System.out.println(L.getFront());
    }

    public static void printFront(MaxSList L) {
        System.out.println("Printing front of MaxSList");
        System.out.println(L.getFront());
    }


    public static void main(String[] args) {
        MaxSList msl = new MaxSList(0);
        msl.insertBack(50);
        SList sl = msl;
        msl.insertFront(1000);
        System.out.println(msl.max());

        MaxSList msl = new MaxSList(0);
        SList sl = msl;        
        printFront(msl);
        printFront(sl);

    }
} 