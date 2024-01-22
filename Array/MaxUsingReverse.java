public class MaxUsingReverse {
    public static void main(String[] args) 
    {

        int[] a = { 88, 44, 55, 22, 77, 66, 33 };
        int max = a[a.length - 1];
        System.out.println(max);
        for (int i = a.length - 1; i >= 0; i--) 
        {
            if (a[i] > max) 
            {
                System.out.println(a[i]);
                max = a[i];
            }
        }

    }
}
