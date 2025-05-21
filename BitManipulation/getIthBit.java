package BitManipulation;

public class getIthBit {
    public static void main(String[] args) {
       System.out.println(GetIthBit(11, 3));
    }
    public static int GetIthBit(int n ,int i){
        int bit = 1<<i ;
        if ((n& bit)==0){
            return 0 ;
        }else{
            return 1;
        }
    }
}
