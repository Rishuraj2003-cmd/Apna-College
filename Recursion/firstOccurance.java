package Recursion;
                                // 8 3 6 9 5 10 2 5 3
public class firstOccurance {
    public  static void main(String arg[]){
        int arr[]={8 ,3 ,6 ,9 ,5 ,10 ,2 ,5 ,3};
        System.out.println(FirstOccurance(arr, 5, 0));
    }

    public static int FirstOccurance(int arr[], int key , int i){
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]==key)
            return i ;
        return FirstOccurance(arr, key, i+1);
    }
    
}
