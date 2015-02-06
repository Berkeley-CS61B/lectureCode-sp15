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

    /*
    @Test
    public void testInsertAndGet() {
    }*/

    /*
    @Test
    public void testGet() {
    }*/

    /*@Test
    public void testDelete() {
    }*/

    /** Tests insertion of a large number of items.*/
    /*@Test
    public void testMegaInsert() {
    }*/

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(AListTest.class);
    }
} 