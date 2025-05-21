package BitManipulation;

public class clearIthBIt {
    public static void main(String[] args) {
        System.out.println(ClearIntBIt(10, 1));
    }
    public static int ClearIntBIt(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask ;
    }
}
