package array;

public class largestNum {
    public static int maxNum(int[] num) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];

            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] num = { 2, 5, 3, 7, 1 };
        System.out.println("Largest number is : " + maxNum(num));

    }
}
