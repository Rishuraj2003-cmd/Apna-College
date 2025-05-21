package BitManipulation;

public class bitMan {
    public static void main(String[] args) {
        
        oddEven(3);
        oddEven(6);
    }
    public static void oddEven(int n){
        int bit = 1;
        if((n&bit) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
