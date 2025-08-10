package Recursion;

public class powOfTwo {
        public static boolean isPowerOfTwo(int n) {
            // base cases
            if (n <= 0) 
                return false;   // 0 and negative numbers are not power of 2
            if (n == 1) 
                return true;    // 2^0 = 1
    
            // if n is not divisible by 2, it's not a power of 2
            if (n % 2 != 0) return false;
    
            // recursive step
            return isPowerOfTwo(n / 2);
        }
    
        public static void main(String[] args) {
            int num = 14;
            System.out.println(num + " is power of 2 ? " + isPowerOfTwo(num));
        }
    }
    