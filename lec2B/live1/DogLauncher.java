/** Just as in HFJ, we will create test drive
  * classes that show off the features of our
  * new class. */
public class DogLauncher {
    public static void main(String[] args) {
        /* Creates a dog using the 'new' keyword. */
        Dog maya = new Dog(100);

        // NON-static call
        maya.makeNoise();

        //Static call
        //Dog.makeNoise();

        Dog yapster = new Dog(9);
        Dog larger = Dog.maxDog(maya, yapster);
        larger.makeNoise();

        Dog largerDogAsJudgedByYapster =
           yapster.maxDogNotStatic(maya, yapster);
        largerDogAsJudgedByYapster.makeNoise();
    
        System.out.println(Dog.binomen);
    }
} 