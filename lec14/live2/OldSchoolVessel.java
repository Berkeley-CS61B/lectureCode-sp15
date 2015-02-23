/** 
 *  @author Josh Hug
 */
/* This is how Java looked before 2004. */

public class OldSchoolVessel {
    Object occupant;

    public void put(Object x) {
        occupant = x;
    }

    public Object peek() {
        return occupant;
    }
} 