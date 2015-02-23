/** 
 *  @author Josh Hug
 */

public class OldSchoolVessel {
    Object occupant;

    public void put(Object x) {
        occupant = x;
    }

    public Object peek() {
        return occupant;
    }
} 