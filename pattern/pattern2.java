/*
 *  hollow rectangle

     *  *   *   *   *
     *              *
     *              *
     *  *   *   *   *
 */

package pattern ;
public class pattern2 {
    public static void main(String[] args) {
        int rows = 4, cols = 5;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j<cols ; j++)
            {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print(" * ");                   
                }
                else {
                    System.out.print("   "); // Print space for hollow part
                }                
            }
            System.out.println();   // Move to the next line
        }
    }
}