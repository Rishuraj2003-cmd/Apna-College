package array;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        /*
         * int[] arr = new int[4];
         * arr[0] = 9 ;
         * arr[2] = 3 ;
         * arr[3] = 2 ;
         * arr[1] = 5 ;
         * System.out.println(arr[0]);
         * System.out.println(arr[2]);
         * 
         * 
         * 
         * int[] array = {6,2,3,4};
         * for(int i = 0 ; i<3 ; i++)
         * {
         * System.out.println(array[i]);
         * }
         * 
         * 
         * 
         * System.out.print("Enter total number of element : ");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * 
         * int array[] = new int[n];
         * for(int i = 0 ; i<n ; i++){
         * array[i]=sc.nextInt();
         * }
         * for (int i = 0; i < n; i++) {
         * 
         * System.out.println(i+" index element is : " +array[i]);
         * }
         * 
         * // --------------------------------------
         * 
         */
        System.out.print("Enter total number of element : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            Marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Marks obtained " + Marks[i]);
        }
        System.out.println("Array size :" + Marks.length);

        // searching

        int ReqNumber;
        System.out.print("Enter the number to search: ");
        ReqNumber = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (ReqNumber == Marks[i]) {
                System.out.println("Element Found at index "+i);
            } 
        }
        sc.close();
    }

}
