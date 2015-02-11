import java.util.List;
import java.io.IOException;
import java.lang.reflect.Method;
/** 
 *  @author Josh Hug
 */

public class PrintListMethods {
    /** Prints out all methods of the List interface.
     */

    public static void main(String args[]) throws IOException {
        Method[] methods = List.class.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }        
    }
} 