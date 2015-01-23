/* We want to make our Dog class into something
 * that can be usefully instantiated. 
 * Each Dog will have its own attributes. */
public class Dog {
    public int size;

    /* This is a CONSTRUCTOR */
    public Dog(int currentSize) {
        size = currentSize;
    }

    /* We take away static, because it is a
     * particular dog that is making noise.
     * Be patient! */
    public void makeNoise() {
        if (size < 10) {
            System.out.println("yipyipyip.");
        } else if (size < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("woof. woof.");
        }
    }
} 

// public Dog thing is equivalent to
// __init__(self, currentSize)