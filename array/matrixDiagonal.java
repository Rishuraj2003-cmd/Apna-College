package array;

// import java.util.Scanner;

public class matrixDiagonal {
    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];

        // int n = matrix.length ;
        // int m = matrix[0].length ;
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        int matrix[][] ={{1 , 2,3},{4,5,6},{7,8,9}};
        // output

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println( diagonalSum(matrix));
        search(matrix, 9) ;
        // sc.close();
    }

    public static int diagonalSum(int matrix[][]) {
     int sum = 0 ;
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0 ; j< matrix.length;j++){
                if (i==j) {                             // primary diagonal
                    sum = sum + matrix[i][j];
                }
                else if(i+j == matrix.length-1)         // secondary diagonal
                {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum ;
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
