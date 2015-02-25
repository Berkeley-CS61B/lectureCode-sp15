/** 
 *  @author Josh Hug
 */

public interface XList {
    public void insertBack(int x);
    public int getBack();
    /** Returns the ith item in the list. */
    public int get(int i);
    public int size();
} 