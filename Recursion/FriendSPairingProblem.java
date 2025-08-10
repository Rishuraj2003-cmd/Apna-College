package Recursion;

public class FriendSPairingProblem {
    public static int friendPair(int n){
        // base case
        if (n==1 || n==2) {
            return n ;
            
        }
        // choice
            // sigle choice
        int fnm1 = friendPair(n-1);

        // pair choice
        int fnm2= friendPair(n-2);
        int pairways = (n-1) * fnm2;

        // totalways

        int totalways = fnm1 + pairways ;
        
        return totalways ;

    }
    public static void main(String[] args) {
        System.out.println(friendPair(3));
        
    }
}
