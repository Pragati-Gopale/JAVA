package Pattren;
/*
1
22
333
4444
55555
 */

public class Pattern27 {
    public static void main(String[] args) {
        int x=1;
        int end=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=end; j++){
                System.out.print(x);
            }
            System.out.println();
            end++;
            x++;
        }
    }
    
}
