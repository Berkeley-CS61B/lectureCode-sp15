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
    public void testSize() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(99);
        assertEquals(2, L.size());
    }

    @Test
    public void testInsertAndGet() {
        AList L = new AList();
        L.insertBack(85);
        assertEquals(85, L.getBack());

        L.insertBack(8);
        assertEquals(8, L.getBack());
    }


    @Test
    public void testGet() {
        AList L = new AList();
        L.insertBack(99);

        assertEquals(99, L.get(0));

        L.insertBack(8);
        assertEquals(8, L.get(1));
        assertEquals(99, L.get(0));
    }

    @Test
    public void testDelete() {
        AList L = new AList();
        L.insertBack(50);
        L.insertBack(99);
        
        int deleted = L.deleteBack();
        assertEquals(99, deleted);
        assertEquals(1, L.size());
    }

    /*@Test
    public void testMegaInsert() {
        int N = 100000;
        AList L = new AList();
        for (int i = 0; i < N; i += 1) {
            L.insertBack(i);
        }
        assertEquals(N - 1, L.getBack());
    }*/

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(AListTest.class);
    }
} 