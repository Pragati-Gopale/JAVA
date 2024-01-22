public class Print2DArr {
    public static void main(String[] args) {
        int[][] a = {
            //    0  1  2  3
                { 1, 2 },      // 0
                { 3, 4, 5 },   // 1
                { 6, 7, 8, 9 } // 2
        };

        for (int i = 0; i < a.length; i++) { //row

            for (int j = 0; j < a[i].length; j++) { //column

                System.out.print(a[i][j] + " ");  //a[row][column]
            }
            System.out.println();
        }
    }

}
