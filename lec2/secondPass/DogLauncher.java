/* In HFJ, it is common to define a Test Drive
 * class that will take our new class out for
 * a spin. */
public class DogLauncher {
    public static void main(String[] args) {
        /* The new keyword tells Java to create
         * a new Dog, using the Dog class's
         * constructor. */
        Dog maya = new Dog(100);
        Dog yapster = new Dog(5);
        maya.makeNoise();
        yapster.makeNoise();

        //Dog.makeNoise();
    }
} 