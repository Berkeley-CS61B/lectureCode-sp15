/** 
 *  @author Josh Hug
 */

/* Blarg is our formal type parameter for this class. */

/* The first time <####> appears, #### is forever a formal parameter
 * for the class. */
public class Vessel<Blarg> {
    Blarg occupant;

    public void put(Blarg x) {
        occupant = x;
    }

    public Blarg peek() {
        return occupant;
    }
} 