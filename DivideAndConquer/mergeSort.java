package DivideAndConquer;

public class mergeSort {
    public static void printArr(int arr[]){
        for(int i= 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[], int start , int end ){

        // base
        if (start>=end) {
            return ;
        }
        int mid = start + (end -start)/2 ;
        sort(arr, start, mid);  // left part
        sort(arr, mid+1, end);  // right part
        sortedArray(arr,start,mid,end);
        
    }
    public static void sortedArray(int arr[],int start,int mid ,int end){
        int temp[] =  new int[end-start+1] ;
        int i = start ;         // iterator for left part
        int j = mid +1 ;        // iterator for right part
        int k = 0;              // iterator for temp arr
        // right part
        while (i<= mid && j<= end) {
            if (arr[i]<arr[j]) {
                temp[k]= arr[i];
                i++ ;
            }else{
                temp[k]=arr[j];
                j++ ;
            }
            k++;
        }
        // left part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        // right part
        while (j<=end) {
            temp[k++]= arr[j++];
        
        }
        //copy temp to original array
        for(k=0 , i = start; k<temp.length;k++,i++){
            arr[i]= temp[k];

        }
    }
    public static void main(String[] args) {
        int arr[]= { 6,3,9,5,2,8};
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array:");
        printArr(arr);
        
    }
}
