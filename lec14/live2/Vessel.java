/** 
 *  @author Josh Hug
 */
/* New hotness (post-2004, well after men in black)...
   a movie made when you were babies or roughly so */

/* Blolbla: Formal type parameter. */

public class Vessel<Blolbla> {
    Blolbla occupant;

    public void put(Blolbla x) {
        occupant = x;
    }

    public Blolbla peek() {
        return occupant;
    }
} 