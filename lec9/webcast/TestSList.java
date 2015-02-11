import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the SList class.
 *  @author Josh Hug
 */

public class TestSList {
    /** This Unit tests is fairly complicated.
      * It assumes that the constructor, isnertFront
      * and getFront all work. */
    @Test
    public void testInserts() {
        SList L = new SList(10);
        L.insertFront(50);
        assertEquals(50, L.getFront());

        L.insertBack(99);
        assertEquals(50, L.getFront());
        assertEquals(99, L.getBack());
    }

    @Test
    public void testSize() {
        SList L = new SList(10);
        L.insertFront(50);
        L.insertBack(99);
        assertEquals(3, L.size());
    }

    @Test
    public void testEmptySize() {
        SList L = new SList();
        L.insertBack(99);
        L.insertFront(50);
        assertEquals(2, L.size());
        assertEquals(50, L.getFront());
    }


    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestSList.class);        
    }
} 