package Pattren;
/*

1
12
123
1234
12345

 */

public class Pattern21 {
    public static void main(String[] args) {
        int end=1;
        for(int i=1; i<=5; i++){
            int x=1;
            for(int j=1; j<=end; j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
            end++;
        }
    }
    
}
