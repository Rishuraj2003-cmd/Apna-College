public class countPrime {
        public static int countPrimes(int n) {
            if (n <= 2) return 0;
    
            boolean[] isPrime = new boolean[n];
            for (int i = 2; i < n; i++) {
                isPrime[i] = true;
            }
    
            for (int i = 2; i * i < n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
    
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) count++;
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int n = 30;
            System.out.println("Number of primes less than " + n + " is: " + countPrimes(n));
        }
    }
    
