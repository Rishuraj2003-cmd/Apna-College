package BitManipulation ;
public class reverseBit {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1;               // Get the last bit of n
            result = (result << 1) | lastBit;  // Shift result left and add the bit
            n >>>= 1;                          // Unsigned right shift to move to next bit
        }

        return result;
    }

    public static void main(String[] args) {
        reverseBit rev = new reverseBit();

        int input = 7;  
        int output = rev.reverseBits(input);
        System.out.println("Reversed bits of " + input + " = " + output);
        System.out.println("Binary: " + Integer.toBinaryString(output));
    }
}
