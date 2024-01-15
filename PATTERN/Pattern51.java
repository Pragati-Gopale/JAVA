package Pattren;
/*
FEDCBA
EDCBA
DCBA
CBA
BA
A
A
BA
CBA
DCBA
EDCBA
FEDCBA
 */
public class Pattern51 {
    public static void main(String[] args) {
        int end = 6;
        char ch = 'F';
        for (int i = 1; i <= 12; i++) {
            char ch1 = ch;
            for (int j = 1; j <= end; j++) {
                System.out.print(ch1);
                if (i < 6) {
                    ch1--;
                }
            }
            System.out.println();
            if (i < 6) {
                ch--;
                end--;
            }
            if (i > 6) {
                end++;
                ch++;
            }
        }
    }

}
