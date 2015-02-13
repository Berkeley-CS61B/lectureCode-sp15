/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Invariants:
      * 1. The next item to be inserted goes into
      *    position size. 
      * 2. The last item in the list is in
      *    position size - 1.
      * 3. There are size items in the list.
      * 4. The ith item is in position i.
      */
    private int[] items;
    private int size;

    /** Resize items to be capacity C.
      * Does the copying for you. */
    private void resize(int c) {
        int[] newItems = new int[c];
        for (int i = 0; i < items.length; i += 1) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
        if (size == items.length) {
            resize((int) (items.length * 1.01));
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getBack() {
        return items[size - 1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        /*if (i > size)
            throw new IllegalArgumentException("bkajweiufawef");*/
        return items[i];
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int deleteBack() {
        int oldBack = getBack();
        size = size - 1;
        return oldBack;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }
} 









