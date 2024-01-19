import java.util.Arrays;

public class LeaderInArr {
    public static void main(String[] args) {
        int[] a = { 88, 44, 55, 22, 77, 66, 33 };

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i])
                    count++;
            }
            if (count == 0) {
                System.out.println(a[i]);
            }
        }
    }

}
