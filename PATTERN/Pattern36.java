package Pattren;
public class Pattern36 {
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
    public static void main(String[] args) {
        int spacecount=4;
        int x=1;
        for(int i=1; i<=9; i++){
            int x1=x;
            for(int j=1; j<=5; j++){
                if(j<=spacecount){
                    System.out.print(" ");
                }else{
                System.out.print(x1);
                x1--;
                }

            }
            System.out.println();
            if(i<5){
                spacecount--;
                x++;
            }
            else{
                spacecount++;
                x--;
            }
        }
    }
    
}
