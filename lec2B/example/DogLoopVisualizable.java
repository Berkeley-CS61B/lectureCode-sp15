/** Visualizable version of the lecture 2 puzzle.
 *  @author Josh Hug
 */

public class DogLoopVisualizable {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = hugeDog;
        manyDogs[2] = new Dog(130);

        int i = 0;
        while (i < manyDogs.length) {
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
            i = i + 1;
        }
    }


    /* Making the Dog class static is some voodoo magic 
     * that I am using to cram two class
     * files into one file for the purpose of using
     * the Visualizer. Do not do this (yet). */
    public static class Dog {
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
} 

