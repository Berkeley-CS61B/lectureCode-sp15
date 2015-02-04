/** Demonstrates the power and elegance of the SList.
 *  @author Josh Hug
 */

public class SListLauncher {
    public static void main(String[] args) {
        SList x = new SList(100);
        System.out.println(x.front.item);
        
        // x: [100]
        x.insertBack(5);

        // x: [100] -> [5]
        System.out.println(x.front.next.item);

        SList y = x;
        // y: [100] -> [5]

        x.insertFront(99);
        // x: [99] -> [100] -> [5]
        // y: [99] -> [100] -> [5]

        System.out.println(x.front.item);
        System.out.println(y.front.item);


        //x = new SList();
        //System.out.println(x.size());        
    }
} 