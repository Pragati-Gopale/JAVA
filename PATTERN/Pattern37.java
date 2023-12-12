package Pattren;
/*
A
AB
ABC
ABCD
ABCDE
*/

public class Pattern37 {
    public static void main(String[] args) {
        int end=1;
        for(int i=1; i<=5; i++){
            int x=1;
            for(int j=1; j<=end; j++){
                System.out.print((char)(x+64));
                x++;
            }
            System.out.println();
            end++;
        }
    }
    
}
