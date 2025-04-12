package array;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // int n = matrix.length ;
        // int m = matrix[0].length ;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 78) ;
        sc.close();
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {

            //  matrix[0].length = 0th row k column k length
            
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("Element found at i =" +i +"and j = " + j);
                    return true;
                }

            }
        }
        System.out.println("Element not found ! ");

        return false;
    }

}
