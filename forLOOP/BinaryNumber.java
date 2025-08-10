package forLOOP;

public class BinaryNumber {
    

        // Function to add two binary strings
        public static String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
    
            int i = a.length() - 1;  // Pointer for string a
            int j = b.length() - 1;  // Pointer for string b
            int carry = 0;           // Carry for addition
    
            // Loop until both strings are processed or carry is left
            while (i >= 0 || j >= 0 || carry == 1) {
                int sum = carry;
    
                if (i >= 0) {
                    sum += a.charAt(i) - '0'; // Convert char to int
                    i--;
                }
    
                if (j >= 0) {
                    sum += b.charAt(j) - '0'; // Convert char to int
                    j--;
                }
    
                result.append(sum % 2);   // Add current bit
                carry = sum / 2;          // Update carry
            }
    
            // Reverse and return the final binary string
            return result.reverse().toString();
        }
    
        // Main method to test
        public static void main(String[] args) {
            String a = "111";  // 11 in decimal
            String b = "111";  // 13 in decimal
    
            String sum = addBinary(a, b);
            System.out.println("Sum of " + a + " + " + b + " = " + sum);  // Output: 11000
        }
    
}