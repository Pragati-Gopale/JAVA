package Pattren;
/*
    1
   121
  12321
 1234321
123454321
 */

public class pattern33 {
    public static void main(String[] args) {
        int end = 5;
        int spacecount = 4;
        // int x=1;
        for (int i = 1; i <= 5; i++) {
            int x = 1;
            for (int j = 1; j <= end; j++) {
                if (j <= spacecount) 
                {
                    System.out.print(" ");
                } 
                else 
                {
                    System.out.print(x);
                    if (j < 5) 
                    {
                        x++;
                    } 
                    else 
                    {
                        x--;
                    }
                }
            }
            System.out.println();
            end = end + 1;
            spacecount--;
        }
    }

}
