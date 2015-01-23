public class Dog {
    public int size;

    /* If we don't give a return type,
     * we get a constructor. 
     * Constructor tells us how to
     * construct dogs. 
     *
     * equivalent of:
     * __init__(self, startingSize) */
    public Dog(int startingSize) {
        size = startingSize;
    }

    /* Why did static go away? 
       Patience... */
    public void makeNoise() {
        if (size < 10) {
            System.out.println("awful yipping");
        } else if (size < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("aroooooo");
        }
    }

    /** Returns the larger dog. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.size > d2.size)  {
            return d1;
        }
        return d2;
    }

    /** Laws of dogtown violated. */
    public Dog maxDog(Dog uddaDog) {
        if (size > uddaDog.size)  {
            return this;
        }
        return uddaDog;
    }
}