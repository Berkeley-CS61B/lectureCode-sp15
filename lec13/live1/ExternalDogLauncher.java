import ug.joshh.animal.Dog;

/** 
 *  @author Josh Hug
 */

public class ExternalDogLauncher {
    public static void main(String[] args) {
        /*ug.joshh.animal.Dog d = new 
              ug.joshh.animal.Dog("Fido", "German Shephard Dire Wolf Hybrid With Corgi Influences", 22);*/
        Dog d = new Dog("Fido", "German Shephard Dire Wolf Hybrid With Corgi Influences", 22);
        System.out.println(d.toString());
    }
} 