package Pattren;
/* 
    1
   121
  12321
 1234321
123454321

*/

public class Pattern25 {
    public static void main(String[] args) {
        int spacecount = 4;
        int end = 5;
        for (int i = 1; i <= 5; i++) {
            int x = 1;
            for (int j = 1; j <= end; j++) {
                if (j <= spacecount) {
                    System.out.print(" ");

                } else if (j < 5) {
                    System.out.print(x);
                    x++;
                } else {

                    System.out.print(x);
                    x--;

                }

            }
            System.out.println();
            end++;
            spacecount--;
        }
    }

}
