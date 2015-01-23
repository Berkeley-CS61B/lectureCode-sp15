/* In Head First Java, we often write a class
 * that test drives our classes of interest.
 */
public class DogLauncher {
    public static void main(String[] args) {
        /* Use new to make an instance of a class */
        Dog maya = new Dog(100);
        maya.makeNoise(); /* non static! */
        Dog yapster = new Dog(5);
        Dog.maxDog(maya, yapster).makeNoise();
        maya.maxDog(yapster).makeNoise();
    }
}

