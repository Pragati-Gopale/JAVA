package Array;

public class BinarySearch {
    public static int binarySearch (int numbers[], int key) {
        int start = 0;
        int end = numbers.length -1; 

        while(start <= end){
            int mid = (start + end)/2;{

            
            if(key == numbers[mid]){ //mid
                return mid;
            }
            if(numbers[mid]< key){ // right side
              start = mid +1;
            }
            if(numbers[mid]>key){ // left side
               start = mid -1;
            }

            }
        }
        return -1;
            
        
        
    }
    public static void main(String[] args) {
        int numbers[] = {2, 5, 10, 13, 8, 20, 6 };
        int key = 8;
        System.out.println("The key is :"+binarySearch(numbers, key));
    }
    
}
