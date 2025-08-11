package forLOOP;

public class BinaryNumber {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int n1 = a.length() - 1;    // Pointer for string a
        int n2 = b.length() - 1;    // Pointer for string b
        int carry = 0;              // Carry for addition
        // int base = 2 ;
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int bit1 = 0;
            if (n1 >= 0) {
                bit1 = a.charAt(n1) - '0';
                n1--;
            }
            int bit2 = 0;
            if (n2 >= 0) {
                bit2 = b.charAt(n2) - '0';
                n2--;
            }
            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }

    // Main 
    public static void main(String[] args) {
        String a = "111"; // 11 
        String b = "101"; // 13 

        String sum = addBinary(a, b);
        System.out.println("Sum of " + a + " + " + b + " = " + sum); // Output: 11000
    }

}