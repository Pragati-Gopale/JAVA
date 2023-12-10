package Pattren;
/*
1
21
321
4321
54321
4321
321
21
1
 */

public class Pattern31 {
    public static void main(String[] args) {
        int x = 1;
        int end = 1;
        for (int i = 1; i <= 9; i++) 
        {
            int x1 = x;
            for (int j = 1; j <= end; j++) 
            {
                System.out.print(x1);
                x1--;
            }
                System.out.println();
                    if (i < 5) 
                    {
                        end++;
                        x++;
                    } 
                    else 
                    {
                        end--;
                        x--;
                    }
        }
    }

}
