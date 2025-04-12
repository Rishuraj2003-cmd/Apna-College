package Sorting;
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int prev= i-1 ;
            for(prev = i-1 ; prev>=0;prev--){
                if (arr[prev]>key) {
                    arr[prev+1]=arr[prev];
                }
                else{
                    break ;
                }
             
            }
            arr[prev + 1] = key;
            
        }

    }

    public static void PrintSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5,1, 6, 0 };
        // insertionSort(arr);
        Arrays.sort(arr);
        PrintSortedArray(arr);

    }
}
