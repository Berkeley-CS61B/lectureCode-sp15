/* In Head First Java, it is common to create
 * a separate 'Test Drive' class to try out
 * new classes that you create. */
public class DogLauncher {
    public static void main(String[] args) {
        Dog hugeDog = new Dog(100);
        Dog tinyDog = new Dog(1);
        hugeDog.makeNoise();
        tinyDog.makeNoise();
        Dog x = Dog.maxDog(hugeDog, tinyDog);
        x.makeNoise();
    }
} 