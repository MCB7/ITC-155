import java.util.*;

public class Stutter {

    public static int[] stutter(int[] a) {
        int[] result = new int[a.length * 2];
        
        for (int i = 0; i < a.length; i++) {
            result[2 * i] = a[i];
            result[2 * i + 1] = a[i];
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] a2 = stutter(a);
        System.out.println(Arrays.toString(a2)); 
    }
}