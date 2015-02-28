/** Your job: Convert this into a generic Vessel so that TestGoalOne works.
 *  @author Josh Hug
 */

public class Vessel {
    Integer occupant;

    public void put(Integer x) {
        occupant = x;
    }

    public Integer peek() {
        return occupant;
    }
} 