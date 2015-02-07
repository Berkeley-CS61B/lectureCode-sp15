    /** 
     *  @author Josh Hug
     */

    public class MaxSList extends SList {

        private int max;

        public MaxSList() {
            super();
            max = Integer.MIN_VALUE;
        }

        public MaxSList(int x) {
            super(x);
            max = x;
        }

        public int max() {
            return max;
        }

        @Override
        public void insertBack(int x) {
            if (x > max) {
                max = x;
            }
            super.insertBack(x);
        }

        @Override
        public void insertFront(int x) {
            if (x > max) {
                max = x;
            }        
            super.insertFront(x);
        }

        public boolean maxInFront() {
            return (super.sentinel.next.item == max);
        }
    }