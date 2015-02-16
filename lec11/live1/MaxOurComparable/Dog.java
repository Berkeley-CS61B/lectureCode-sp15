/** Implements Dog
 *  @author Josh Hug
 */

public class Dog {
    /** Compares, assuming obj is a Dog. */
    public int compareTo(Object obj) {
    	Dog daUddaDog = (Dog) obj;
    	return this.size - daUddaDog.size;
    }

	private String name;
	private int size; 

	/** shared by all isntances and the class itself */
	public static String binomen = "Canis familiaris";

	/** returns max of two dogs D1 and D2 */
	/* Even though size field is public, this method is part
	   of the Dog class, so things will be fine */
	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.size >= d2.size)
			return d1;
		return d2;
	}

	/** Returns the max dog in a dog array */
	public static Dog maxDog(Dog[] dogs) {
		/* assumes dogs is not null or empty */
		Dog maxDog = dogs[0];
		for (Dog d : dogs) {
			if (d.size > maxDog.size) {
				maxDog = d;
			}
		}
		return maxDog;
	}
	
	/** bark */
	public void bark() {
		System.out.println(name + " says: bark. bark.... bark.");
	}

	/** constructor */
	public Dog(String n, int s) {
		name = n;
        size = s;
	}
}

