package BitManipulation;

public class UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1));
    }
    public static int SetIthBit(int n , int i ){
        int bit = 1<<i ;
        return n|bit;
    }
    public static int clearIthBit(int n , int i ){
        int bit = ~(1<<i);
        return n & bit ;
    }
    public static int updateIthBit(int n , int i, int newBit){
        if (newBit==0) {
            return clearIthBit(n, i);
        }else{
            return SetIthBit(n, i);
        }
    }
}
