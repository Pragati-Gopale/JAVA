package Pattren;
/*

1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */

public class Pattern23 {
    public static void main(String[] args) {
        int end=1;
        for(int i=1; i<=9; i++){
            int x=1;
            for(int j=1; j<=end; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
            if(i<5)
            end++;
            else
            end--;
        }
    }
    
}
