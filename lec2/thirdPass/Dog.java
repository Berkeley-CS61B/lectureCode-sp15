/* Goal: Make our dog instantiatable, where 
 * each Dog has its own attributes! */

public class Dog {
    int size;

    /* If no return type is provided, we have
     * a constructor! Gives a blueprint
     * for constructing Dogs. */
    public Dog(int startSize) {
        size = startSize;
    }

    /* Why did we remove static? 
     * All will become clear... */
    public void makeNoise() {
        if (size < 10) {
            System.out.println("yip!! yip!!");
        } else if (size < 40) {
            System.out.println("bark.");
        } else {
            System.out.println("woof. woof.");
        }
    }

    /** Returns the larger of the D1 and D2. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.size > d2.size) {
            return d1;
        }
        return d2;
    }
}

/* Equivalent in Python for our constructor:
 * def __init__(self, startSize): */