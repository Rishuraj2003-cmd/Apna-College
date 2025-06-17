//  print numbers from n to 1 (decreasing order)

package Recursion;

public class Pro1 {
    
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println((n+" "));
        PrintDec(n-1);
       
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");

    }
    public static void main(String args[]){
        int n=10;
        PrintDec(n);
        printInc(n);
      }
}
