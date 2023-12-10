package Pattren;
/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */

public class Pattern32 {
    public static void main(String[] args) {
        int end = 1;
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            int diff = 4;
            int x1 = x;
            for (int j = 1; j <= end; j++) {

                System.out.print(x1 + " ");
                x1 = x1 + diff;
                diff--;

            }
            System.out.println();
            end = end + 1;
            x++;
        }
    }

}
