import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the SentinelSList class.
 *  @author Josh Hug
 */

public class SentinelSListTest {
    /** This Unit tests is fairly complicated.
      * It assumes that the constructor, isnertFront
      * and getFront all work. */
    @Test
    public void testInserts() {
        SentinelSList L = new SentinelSList(10);
        L.insertFront(50);
        assertEquals(50, L.getFront());

        L.insertBack(99);
        // 50 -> 10 -> [99]
        assertEquals(50, L.getFront());
        assertEquals(99, L.getBack());
    }

    @Test
    public void simpleInsertTest() {
        SentinelSList L = new SentinelSList(10);
        L.insertBack(30);
        assertEquals(30, L.getFront());
    }

    @Test
    public void testSize() {
        SentinelSList L = new SentinelSList(10);
        L.insertFront(50);
        L.insertBack(99);
        assertEquals(3, L.size());
    }

   @Test
    public void testEmptySize() {
        SentinelSList L = new SentinelSList();
        L.insertBack(99);
        L.insertFront(50);
        assertEquals(2, L.size());
        assertEquals(50, L.getFront());
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(SentinelSListTest.class);        
    }
} 