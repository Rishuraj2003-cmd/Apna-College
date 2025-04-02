package array;

public class ReverseArray {
    public static void reverse(int num[]){
        int first = 0 , last = num.length-1;
        while (first<last) {
            int temp = num[last] ;
            num[last] = num[first] ;
            num[first] = temp ;

            first++;
            last--;
            
        }
        
    }
    public static void main(String[] args) {
        int num[]={2,3,4,1,6,7,8};
        reverse(num);
        for(int i=0 ;i< num.length ; i++){
            System.out.print(num[i]  + "  ");
        }
        System.out.println();
    }
}
