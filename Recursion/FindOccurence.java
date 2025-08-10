package Recursion;
/* 
Input:
arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}
key = 2

Output:
1 5 7 8

*/
public class FindOccurence {
    public static void findOccurence(int arr[], int index , int key){
        if(index == arr.length){
            return ;
        }
        if (arr[index]==key) {
            System.out.println(index + " ");
        }
        findOccurence(arr, index+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        findOccurence(arr, 0, key);
    }
}
