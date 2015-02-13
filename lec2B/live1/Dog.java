public class Dog {
    public int weight;
    public static String binomen = "Canis familiaris";

    /** Constructor:
      * Tells us how to construct dogs.
      * For those coming from Python:
      *
      * This is like __init__(self, w)
      * but we don't need self. 
      * In Java, this is equivalent to self,
      * but is not explicitly in the list of
      * parameters for constructors. */
    public Dog(int w) {
        this.weight = w;
    }

    /* Where did static go? wait and all shall
     * be revealed. */
    public void makeNoise() {
        if (weight < 10) {
            System.out.println("yipyipaiypa.");
        } else if (weight < 30) {
            System.out.println("bark");
        } else {
            System.out.println("woof. woof.");
        }
    }

    /** Returns the larger of D1 and D2. */
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weight < d2.weight) {
            return d1;
        }
        return d2;
    }

    public Dog maxDogNotStatic(Dog d1, Dog d2) {
        if (d1.weight < d2.weight) {
            return d1;
        }
        return d2;
    }
}