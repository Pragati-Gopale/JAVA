public class MaxEle {
    public static void main(String[] args) {

        int[] a = { 11, 22, 44, 66, 55, 88 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println(max);
    }

}
