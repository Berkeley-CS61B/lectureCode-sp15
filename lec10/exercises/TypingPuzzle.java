/** 
 *  @author Josh Hug
 */

public class TypingPuzzle {
    public static void main(String[] args) {
        Object o2 = new ShowDog("Mortimer");

        ShowDog sdx = ((ShowDog) o2);
        sdx.bark();

        Dog dx = ((Dog) o2);
        dx.bark();

        ((Dog) o2).bark();

        Object o3 = (Dog) o2;
        //o3.bark();

    }

    /* Ignore the word static in the class definition, we
     * haven't learned what a class-inside-a-class means if
     * it is not static. Coming after the midterm */
    public static class Dog {
        String name;
        int x;

        public void bark() {
            System.out.println(name + " barks hello.");
        }

        public int myInteger() {
            return 5;
        }

        public Dog(String n) {
            name = n;
        }
    }

    public static class ShowDog extends Dog {
        public ShowDog(String n) {
            super(n);
        }

        @Override
        public void bark() {
            System.out.println(name + " daintily barks hello.");
        }
    }
} 