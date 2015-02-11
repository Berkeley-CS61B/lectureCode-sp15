/** This abstract class captures the redundancies between
 *  getback and get, saving the author of the concrete
 *  class some work (if they want).
 *  @author Josh Hug
 */

public abstract class AbstractXList implements XList {
    public int getBack() {
        return get(size());
    }

}