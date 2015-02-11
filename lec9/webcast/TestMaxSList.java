import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the MaxSList class.
 *  @author Josh Hug
 */

public class TestMaxSList {
    /** This Unit tests is fairly complicated.
      * It assumes that the constructor, isnertFront
      * and getFront all work. */
    @Test
    public void testInserts() {
        MaxSList L = new MaxSList(10);
        L.insertFront(50);
        assertEquals(50, L.getFront());

        L.insertBack(99);
        assertEquals(50, L.getFront());
        assertEquals(99, L.getBack());
    }

    @Test
    public void testSize() {
        MaxSList L = new MaxSList(10);
        L.insertFront(50);
        L.insertBack(99);
        assertEquals(3, L.size());
    }

    @Test
    public void testEmptySize() {
        MaxSList L = new MaxSList();
        L.insertBack(99);
        L.insertFront(50);
        assertEquals(2, L.size());
        assertEquals(50, L.getFront());
    }

    @Test
    public void testMax() {
        MaxSList L = new MaxSList();
        L.insertBack(50);
        assertEquals(50, L.max());

        L.insertBack(33);
        assertEquals(50, L.max());

        L.insertFront(-9);
        assertEquals(50, L.max());

        L.insertBack(99);
        assertEquals(99, L.max());
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestMaxSList.class);        
    }
} 