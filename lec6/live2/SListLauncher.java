/** 
 *  @author Josh Hug
 */

public class SListLauncher {

    public static void main(String[] args) {
        SList x = new SList(5);
        // x: 5

        x.insertBack(10);        
        // x: [5] --> [10]

        SList y = x;

        // y: 5 --> 10

        x.insertFront(9);
        // goal: x: 9 --> 5 --> 10
        // y: 9 --> 5 --> 10

        
        SList empty = new SList();
        System.out.println(empty.size());
    }
} 