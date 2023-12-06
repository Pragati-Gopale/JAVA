package Pattren;
/*
    * 
   * *
  * * *
 * * * *
* * * * *

 */

public class Pattern11 {
    public static void main(String[] args) {
        int spacecnt = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= spacecnt) {
                    System.out.print(" ");
                } else {
                    System.out.print("*"+" ");
                }

            }

            System.out.println();
            spacecnt--;
        }
    }
}
