package Array;

public class PairsInArray {
    public static void pairInArray(int numbers[]) {
        int totalpair = 0;
        for(int i=0; i<numbers.length; i++){
            int currsum = numbers[i]; //2, 4, 6, 8, 10

            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + currsum + "," + numbers[j] + ")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total Number Of pairs : "+totalpair);

        
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairInArray(numbers);
    }
    
}
