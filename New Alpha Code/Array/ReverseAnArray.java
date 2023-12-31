package Array;

public class ReverseAnArray {

    public static void reverseAnArray(int numbers[]) {
        int first = 0; 
        int last = numbers.length - 1;

        while(first < last){
            //Swapping method
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        //Print array
        reverseAnArray(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
