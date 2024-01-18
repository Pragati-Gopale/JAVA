public class FindIndexNoOfEle {
    public static void main(String[] args) {
        int[] a = { 11, 22, 33, 44, 55, 33, 77 };
        int data = 33;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == data)
                System.out.println(i);
            count++;
        }
        if (count == 0) {
            System.out.println("not found");
        }

    }
}
