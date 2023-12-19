package Pattren;
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

public class Pattern41 {
    public static void main(String[] args) {

        int end = 1;
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= end; j++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
            end++;
        }
    }

}


 
 
