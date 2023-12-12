package Pattren;

public class Pattern35 {
    public static void main(String[] args) {
        int firsttristartpoint=1;
        int secondtriendpoint=10;
        for(int i=1; i<=5; i++){
            int x=1;
            for(int j=1; j<=10; j++){
                if(firsttristartpoint <= j || secondtriendpoint >= j){
                    System.out.print(x);
                    x++;
                }else{
                    x--;
                }
            }
            System.out.println();
        }
    }
    
}
