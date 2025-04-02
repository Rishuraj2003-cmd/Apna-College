package forLOOP;


public class palindrome {
    public static void main(String[] args) {

        paliNum(121);
    }

    public static void paliNum(int n) {
        int rev = 0;
        int original = n; 
        while (n > 0) {
            int rem = 0;
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        if (rev == original) {
            System.out.println(original+" is palindrome num");
        }

        else {
            System.out.println(original+ "is not palindrome nummber");
        }
    }
}
