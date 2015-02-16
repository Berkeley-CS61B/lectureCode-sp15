/** 
 *  @author Josh Hug
 */

    public abstract class AbstractXList implements XList {
        public int getBack() {
            return get(size());
        }
        public abstract int party();
    } 