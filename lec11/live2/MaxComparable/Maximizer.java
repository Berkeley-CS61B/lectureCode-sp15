/** 
 *  @author Josh Hug
 */

public class Maximizer {
    public static Comparable max(CompFarable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            int cmp = items[i].compareTo(items[maxDex]);
            /* if cmp > 0, then this item is bigger than biggest known */
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];        
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9),
                         new Dog("Artemesios", 15)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
} 

