package Pattren;
/*
* * * * * 
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

 */

public class Pattern12 {
    public static void main(String[] args) 
    {   
        int spacecnt=0;
        for(int i=1; i<=9; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=spacecnt)
                {
                    System.out.print(" ");
                }
                else
                {
                System.out.print("*"+" ");
                }
            }
            System.out.println();
            if(i<5)
            {
                spacecnt++;
            }
            else
            {
                spacecnt--;
            }
        }
    }
    
}
