package Pattren;
/*

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

 */

public class Pattern10 {
    public static void main(String[] args) {
        
    
    int spacecount=0;
    for(int i = 1;i<=9;i++)
    {
        for (int j = 1; j <= 5; j++) {
            if (j <= spacecount) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        if (i < 5) {
            spacecount++;
        } else {
            spacecount--;
        }

    }

}
}

