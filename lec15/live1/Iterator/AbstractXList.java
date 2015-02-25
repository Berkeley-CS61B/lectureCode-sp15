/** Provides a default implementation for some XList methods.
 *  @author Josh Hug
 */

    public abstract class AbstractXList implements XList {
        @Override
        public int getBack() {
            return get(size());
        }
    } 