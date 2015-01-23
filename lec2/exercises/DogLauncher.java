/* Similar to what we see in Head first Java,
 * we will often create a test drive class.
 */

public class DogLauncher {
    public static void main(String[] args) {
        Dog maya = new Dog(100);
        Dog yapster = new Dog(5);
        maya.makeNoise();
        Dog.maxDog(maya, yapster).makeNoise();
    } 
}