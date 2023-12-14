package Pattren;
/*
A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A
 */

public class Pattern38 {
    public static void main(String[] args) {
        char ch='A';
        int end=1;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                System.out.print(ch);
            }
            System.out.println();
            if(i<5){
                end++;
                ch++;
            }
            else{
                end--;
                ch--;
            }
        }
    }
    
}
