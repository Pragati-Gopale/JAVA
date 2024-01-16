//import java.util.ArrayList;
public class CopyArrays {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            
         // 1. System.out.println(Arrays.toString(b));

         // 2.👇
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
