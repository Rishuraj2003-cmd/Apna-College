package array;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4};
        int target = 4;

        int[] result = TwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
    public static int[] TwoSum(int[] nums, int target){

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
        }
    }
    