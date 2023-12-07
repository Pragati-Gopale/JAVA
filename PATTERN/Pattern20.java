package Pattren;

/*

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********

 */

public class Pattern20 {
    public static void main(String[] args) {
        int FirstTriEndPoint = 5;
        int SecondTriStartPoint = 6;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= FirstTriEndPoint || j >= SecondTriStartPoint)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if (i < 5) {
                FirstTriEndPoint--;
                SecondTriStartPoint++;
            } else {
                FirstTriEndPoint++;
                SecondTriStartPoint--;
            }
        }
    }

}
