/** 
 *  @author Josh Hug
 */

/* extends means 'is-a' */
/*   -- MaxSList automatically has ALL methods and fields of SList. 
 *      does not include constructors. */
public class MaxSList extends SList {
    /** Max value in list. */
    private int max = -Integer.MIN_VALUE;


    /* EVERY CONSTRUCTOR MUST START WITH A CALL TO A SUPERCLASS CONSTRUCTOR. */

    /* If there are NO constructors at all, then the no-argument
     * constructor will by default call the super class's
     * no argument constructor. */
    public MaxSList() {
        super();
    }

    public MaxSList(int x) {
        /** Makes a call to the super class's constructor
          * that takes an int. */

        /* Since MaxSList is-an SList, SList is the 'super' class of MaxSList. */
        super(x);
        max = x;
    }

    /** Returns max item in list. */
    public int max() {
        return max;
    }

    @Override
    /** Inserts into the front (using super class method), and updates 
      * max if necessary. */
    public void insertFront(int x) {
        System.out.println("maxSList's insert front was called.");
        if (x > max) {
            max = x;
        }
        super.insertFront(x);

    }

    @Override
    /** Inserts into the back (using super class method), and updates 
      * max if necessary. */    
    public void insertBack(int x) {
        super.insertBack(x);
        if (x > max) {
            max = x;
        }        
    }

}