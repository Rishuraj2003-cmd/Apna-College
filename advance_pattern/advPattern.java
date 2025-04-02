package advance_pattern;

/* 
public class advPattern {
    public static void printPattern(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" X ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" X ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}


X 
X  X 
X  X  X 
X  X  X  X 
X  X  X  X  X 
X  X  X  X 
X  X  X 
X  X 
X 

    

public class advPattern{

    public static void printPattern(int n ){
        for(int i = n ; i>= 0; i--){
            for(int j = 0; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=n-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4 ;
        printPattern(n);
    }
}
     ******
    ******
   ******
  ******
 ******
******

     *
    **
   ***
  ****
 *****
******



public class advPattern{

    public static void printPattern(int n ){
        for(int i = n ; i>= 1; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4 ;
        printPattern(n);
    }
}


****
***
**
*
**
***
****

public class advPattern {
    public static void printPattern(int n) {

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" X ");
            }
            System.out.println();
        }
    

    for(int i = 1;i<=n;i++)
    {
        for (int j = 0; j <= i; j++) {
            System.out.print(" X ");
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
public class advPattern {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println(); // Move to next line
        }
    
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}

*                    * 
*  *              *  * 
*  *  *        *  *  * 
*  *  *  *  *  *  *  * 



public class advPattern {
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            System.out.println(); // Move to next line
        }
        // LOWER HALF
        for (int i = n; i >= 1; i--) {

            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        int n = 3;
        printPattern(n);
    }
}

X    X
XX  XX
XXXXXX
XXXXXX
XX  XX
X    X


public class advPattern{

    public static void printPattern(int n ){
        for(int i = 0 ; i<=n ; i++)
        {
            // print space
            for(int j = 0 ; j<= n-i ; j++){
                System.out.print(" ");
            }
            
            for(int j = 0 ; j<=n ;j++)
            {
                System.out.print("x");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n = 5 ;
        printPattern(n);
    }
}

              *  *  *  *  * 
           *  *  *  *  * 
         *  *  *  *  * 
       *  *  *  *  * 
     *  *  *  *  * 
   *  *  *  *  * 


public class advPattern {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}

    * 
   * * 
  * * * 
 * * * * 
* * * * * 


public class advPattern {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 


public class advPattern {

    public static void printPattern(int n) {
        for (int i = 0; i <=n; i++) {
          // print space
          for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}

    1
   212
  32123
 4321234
543212345


*/