import java.util.Arrays;

public class EvenOddArr {
    public static void main(String[] args) {

        int[] a = { 11, 33, 44, 55, 66, 77, 88, 99 };

        int evencnt = 0;
        int oddcnt = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] % 2 == 0) 
            {
                evencnt++;
            } 
            else 
            {
                oddcnt++;
            }

        }

        int[] evenArr = new int[evencnt];
        int[] oddArr = new int[oddcnt];

        int evenindex = 0;
        int oddindex = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] % 2 == 0) 
            {
                evenArr[evenindex] = a[i];
                evenindex++;

            } 
            else 
            {
                oddArr[oddindex] = a[i];
                oddindex++;

            }

        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }

}
