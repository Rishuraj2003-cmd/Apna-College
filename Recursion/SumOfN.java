package Recursion;

public class SumOfN {
    public static int sum(int n) {
        if (n==0) {
            return 0 ;
        }
        int sNm1 = sum(n - 1);
        int sN = n + sNm1;
        return sN;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
