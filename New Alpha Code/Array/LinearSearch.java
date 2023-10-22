package Array;

public class LinearSearch {

    public static int valueSearch(int numbers[], int key) {
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int numbers[]={1, 3, 5, 8, 10, 15};
        int key = 20;

        int index =valueSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index : "+index);
        }
}
    
}
