package Pattren;

public class Pattern13 {
    public static void main(String[] args) {
        int spacecoun = 4;
        //int end = 5;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= spacecoun) {
                    System.out.print(" ");
                } else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
            if (i < 5) {
                spacecoun--;
                //end--;
            } else {
                spacecoun++;
                //end++;
            }
        }
    }

}
