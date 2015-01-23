/* Goal for this exercise:
    1. Modify the Dog class so that it uses
       the provided sound files in this directory
       in some way that you choose.
*/

public class Dog {
    public static int size;

    public Dog(int startSize) {
        size = startSize;
    }


    public void makeNoise() {
        if (size < 10) {
            System.out.println("horrific yapping");
        } else if (size < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof woofity woof!");
        }
    } 

    /** Returns larger dog. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (size > d2.size)
            return d1;
        return d2;
    }
}