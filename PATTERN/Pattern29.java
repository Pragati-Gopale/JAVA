package Pattren;
/*
12345
2345
345
45
5
 */

public class Pattern29 {
    public static void main(String[] args) {
        int x=1;
        int end=5;
        for(int i=1; i<=5; i++){
            int x1=x;
            for(int j=1; j<=end; j++){
                System.out.print(x1);
                x1++;
            }
            System.out.println();
            end--;
            x++;
        }
    }
    
}
