/** 
 *  @author Josh Hug
 */
import java.util.ArrayList;


public class ArraysVsArrayLists {
    public static int sum(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i += 1) {
            sum += a.get(i);
        }
        return sum;
    }   

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i += 1) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 50000000;
        ArrayList<Integer> alist = new ArrayList<Integer>(N);
        int[] array = new int[N];
        for (int i = 0; i < N; i += 1) {
            alist.add(i);
            array[i] = i;
        }
        Stopwatch w = new Stopwatch();
        sum(alist);
        System.out.printf("Time to sum %d alist items: %.2f seconds.\n", N, w.elapsedTime());
        w = new Stopwatch();
        sum(array);
        System.out.printf("Time to sum %d array items: %.2f seconds.\n", N, w.elapsedTime());        
    }


} 