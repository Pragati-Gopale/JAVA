package Pattren;
/*

 ** ** 
* **  *
 *   *
  * *
   *
   
 */

public class Pattern45 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=7; j++) {
                if(j+i==9 || j+i==3 || (j-1==2 && i<=2) || (j+i==6 && i<=2) || j-i==5 || j-i==-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
               
            }
             System.out.println();
            
        }
    }
    
}
