/** 
 *  @author Josh Hug
 */

public class ChattyTripler extends Tripler {
    @Override
    public int triple(int x, int n) {
        int r = x;
        for (int i = 0; i < n; i += 1) {
            r = triple(r);
            System.out.println(r);
        }
        return r;
    }    

    public static void main(String[] args) {
        ChattyTripler ct = new ChattyTripler();
        ct.triple(5, 2);
    }
} 