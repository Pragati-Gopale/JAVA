public class MinEle {
    public static void main(String[] args) {
        int[] a = { 11, 22, 44, 66, 55, 88 };
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

}
