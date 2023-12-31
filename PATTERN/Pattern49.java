package Pattren;
/*
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
 */
public class Pattern49 {
    public static void main(String[] args) {
        int FirstTriEndPoint = 1;
        int SecondTriStartPoint = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (FirstTriEndPoint >= j || SecondTriStartPoint <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<5){
                FirstTriEndPoint++;
                SecondTriStartPoint--;
            }
            else{
                FirstTriEndPoint--;
                SecondTriStartPoint++;
            }

        }
    }

}
