package BitManipulation;

public class NtoB {
  
        public static String toBinary(int n) {
            // Step 1: Handle special case
            if (n == 0) return "0";
    
            // Step 2: Create StringBuilder to build binary string
            StringBuilder binary = new StringBuilder();
    
            // Step 3: Repeat until n becomes 0
            while (n > 0) {
                int remainder = n % 2;         // Get last binary digit (0 or 1)
                binary.append(remainder);      // Add it to the result (in reverse order)
                n = n / 2;                     // Divide n by 2 to shift right
            }
    
            // Step 4: Reverse the string since we collected digits from LSB to MSB
            return binary.reverse().toString();
        }
    
        public static void main(String[] args) {
            int number =7;
            String binaryResult = toBinary(number);
            System.out.println("Binary of " + number + " is: " + binaryResult);
        }
    }
    
