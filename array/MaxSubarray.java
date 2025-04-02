package array;
// brute force 

public class MaxSubarray {
    /*
     * public static void maxSubArraySum(int num[]) {
     * int currSum = 0;
     * int maxSum = Integer.MIN_VALUE;
     * for (int i = 0; i < num.length; i++) {
     * int start = i;
     * for (int j = i; j < num.length; j++) {
     * int end = j;
     * currSum = 0;
     * for (int k = start; k <= end; k++) {
     * // subarray sum
     * currSum += num[k];
     * }
     * if (maxSum < currSum) {
     * maxSum = currSum;
     * 
     * }
     * }
     * }
     * System.out.println(num.length);
     * System.out.println("Maximum sum : " + maxSum);
     * }
    


     // prefix method  


     public static void maxSubArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        // Calculate prefix sum array
        prefix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // Compute maximum subarray sum
        for (int i = 0; i < num.length; i++) {
            int start = i ;
            for (int j = i; j < num.length; j++) {
                // Calculate subarray sum using prefix sum
                int end = j ;
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                // Update maxSum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print result
        System.out.println("Maximum sum: " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
        maxSubArraySum(num);
    }

     */

    // kadance algorithm
    public static void kadance(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0 ; i<num.length; i++){
            currSum = currSum + num[i];
            if (currSum<0) {
                currSum = 0 ;
                
            }
            maxSum = Math.max(maxSum, currSum);

        }
        System.out.println("max Sum Subarray is : "+maxSum);
    }
     public static void main(String[] args) {
        int num[]={1,-1,3,2,-1};
        kadance(num);
     }

     
}