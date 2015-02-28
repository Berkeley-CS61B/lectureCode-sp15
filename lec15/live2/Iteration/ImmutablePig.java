/** 
 *  @author Josh Hug
 */

public class ImmutablePig {
    private String favoriteSound;

    public ImmutablePig(String fs) {
        favoriteSound = fs;
    }

    public void makeNoise() {
        System.out.println(favoriteSound);
    }
} 