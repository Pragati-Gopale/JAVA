package Pattren;
/*
    *****
   *****
  *****
 *****
*****

 */

public class Pattern19 {
    public static void main(String[] args) {
        int end=9;
        int spacecount=4;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=end; j++){

                if(j<=spacecount)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
            end--;
            spacecount--;
        }
    }
    
}
