package Pattren;
/*
A
BG
CHM
DINS
EJOTY
FKPUZ_

 */

public class Pattern39 {
    public static void main(String[] args) {
        int end=1; 
        int x=1;
        for(int i=1; i<=6; i++){
            int x1=x;
            for(int j=1; j<=end; j++){
                System.out.print((char)(x1+64));
                x1=x1+5;
                
            }
            System.out.println();
            x++;
            end++;
        }
    }
    
}
