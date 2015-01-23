public class Dog {
    public static int size;

    /* This is a constructor. It explains
     * how to construct dogs.
     * In this case, each dog must be
     * created with an integer, and it is
     * used as the size 
     *
     * def __init__(self, startSize):
     */
    public Dog(int startSize) {
        size = startSize;
    }

    /* why did static go away?
       be patient. */

    public void makeNoise() {
        if (size < 10) {
            System.out.println("horrific yapping");
        } else if (size < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woof woofity woof!");
        }
    } 

    /* Returns larger dog. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (size > d2.size)
            return d1;
        return d2;
    }
}