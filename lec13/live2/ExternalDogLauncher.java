import ug.joshh.animal.Dog;
import jerry.Dog;

/** 
 *  @author Josh Hug
 */

public class ExternalDogLauncher {

    public static void main(String[] args) {
        Dog d = 
           new Dog("Fido", "Marmot Cocker Spaniel Mix (Abomination)", 8.2);
        System.out.println(d.toString());
    }
} 