package Recursion;
/* 
public class BIinaryStringProblem {
    public static void printBinString(int n , int lastplace , String s){
        if (n==0) {
            System.out.println(s);
            return ;
        }
        printBinString(n-1,0,s+"0");
        if (lastplace==0) {
            printBinString(n-1,1,s+"1");
        }

    }
    public static void main(String[] args) {
        printBinString(3,0," ");
    }
}
*/


//  adjacent zero not allowed

public class BIinaryStringProblem {
    public static void printBinString(int n , int lastplace , String s){
        if (n==0) {
            System.out.println(s);
            return ;
        }
        printBinString(n-1,1,s+"1");
        if (lastplace==1) {
            printBinString(n-1,0,s+"0");
        }

    }
    public static void main(String[] args) {
        printBinString(3,1," ");
    }
}