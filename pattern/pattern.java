package pattern;
public class pattern {
    public static void main(String args[]) {
        int n = 9;
        printpattern(n);
    }

    public static void printpattern(int n) {

        for (int r = 0; r <= n; r++) {
            for (int c = 0; c < (n - r); c++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= r; c++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
   
}
/*
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
 */