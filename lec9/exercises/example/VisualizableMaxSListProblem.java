/** 
 *  @author Josh Hug
 */

public class VisualizableMaxSListProblem {
/** 
 *  @author Josh Hug
 */

    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

    }
    public static class SList {
        protected IntNode sentinel;
        /* Do not change anything below this line. */

        protected int size;

        public SList() {
            size = 0;
            sentinel = new IntNode(999, null);
        }

        public SList(int x) {
            sentinel = new IntNode(x, null);
            size = 1;
        }

        public void insertBack(int x) {
            IntNode p = sentinel;
            while (p.next != null) {
                p = p.next;
            }

            // p is the LAST node at this point
            p.next = new IntNode(x, null);
            size = size + 1;
        }

        public void insertFront(int x) {
            IntNode oldFront = sentinel.next;
            sentinel.next = new IntNode(x, oldFront);
            size = size + 1;
        }

        public int getFront() {
            return sentinel.next.item;
        }

        public int getBack() {
            IntNode p = sentinel;
            while (p.next != null) {
                p = p.next;
            }

            // p is the LAST node at this point
            return p.item;
        }

        public int size() {
            return size;
        }

    } 

    public static class MaxSList extends SList {
        private int max;

        public MaxSList() {
            super(); /* call my superclass's constructor */
            max = 0;
        }

        public MaxSList(int x) {
            super(x); /* call my superclass's one parameter constructor */
            max = x;
        }

        @Override
        public void insertFront(int x) {
            if (x > max) {
                max = x;
            }
            super.insertFront(x);
        }

        @Override
        public void insertBack(int x) {
            if (x > max) {
                max = x;
            }
            super.insertBack(x);
        }

        public int max() {
            return max;
        }
    }

    public static void main(String[] args) {
        MaxSList msl = new MaxSList(0);
        msl.insertBack(50);
        SList sl = msl;
        msl.insertFront(1000);
        System.out.println(msl.max());
    }        
} 