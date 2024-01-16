public class CheckMinEleIndex {
    public static void main(String[] args) {
        int[] a = { 11, 33, 2, 6, 44, 77, 88 };
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }

        }
        System.out.println("min index in whole arra: " + min);

        int min1 = 3;
        for (int i = 4; i < a.length; i++) {
            if (a[i] < a[min1]) {
                min1 = i;
            }
        }
        System.out.println("min index from half array: " + min1);

        int min2 = a[3];
        for (int i = 4; i < a.length; i++) {
            if (a[i] < min2) {
                min2 = a[i];
            }

        }
        System.out.println("min element from half array : " + min2);
    }

}
