/** 
 *  @author Josh Hug
 */

/* TODO: Modify Dog so that this file and DogLauncher compile and run. */

public class Dog {
    private String name;
    private String breed;
    private double size;

    public Dog(String n, String b, double s) {
        name = n;
        breed = b;
        size = s;
        vih = new VoiceInHead();
    }

    public String toString() {
        return name + " is a " + breed + " weighing " + size + " lbs.";
    }

} 