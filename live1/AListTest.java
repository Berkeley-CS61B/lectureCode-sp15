import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the AList class.
 *  @author Josh Hug
 */

public class AListTest {
    @Test
    public void testEmptySize() {
        AList L = new AList();
        assertEquals(0, L.size());
    }

    @Test
    public void testInsertAndSize() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(99);
        assertEquals(2, L.size());
    }

    @Test
    public void testInsertAndGet() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(99);
        assertEquals(99, L.getBack());

        L.insertBack(30);
        assertEquals(30, L.getBack());
        assertEquals(30, L.get(2));
        assertEquals(99, L.get(0));                
    }

    /* [abandoned because we made the other
        test too complicated]
    @Test
    public void testGet() {
    }*/

    @Test
    public void testDelete() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(15);

        L.deleteBack();
        assertEquals(99, L.getBack());

        L.deleteBack();
        assertEquals(0, L.size());

        L.insertBack(85);
        assertEquals(85, L.get(0));    
    }

    /** Tests insertion of a large number of items.*/
    @Test
    public void testMegaInsert() {
        AList L = new AList();
        int N = 1000000;
        for (int i = 0; i < N; i += 1) {
            L.insertBack(i);
        }

        assertEquals(N, L.size());
        for (int i = 0; i < N; i += 1) {
            assertEquals(i, L.get(i));
        }
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(AListTest.class);
    }
} 