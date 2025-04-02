package pattern;

/*
public class numberTriangle {
    public static void main(String[] args) {
       
        for(int i = 0 ; i<=6 ; i++){
            for(int j = 0 ; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
 ---------    output

0
01
012
0123
01234
012345
0123456





 
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 



public class numberTriangle {
    public static void main(String[] args) {
       
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 0 ; j<= 4; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

11111
22222
33333
44444



public class numberTriangle {
    public static void main(String[] args) {
       
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 0 ; j<= 4; j++){
                System.out.print(j);        //  replacing j with i 
            }
            System.out.println();
        }
    }
    
}

01234
01234
01234
01234



public class numberTriangle {
    public static void printPattern(int n) {
       
        for(int i = n ; i>=1 ; i--){
            for(int j = 1 ; j<= i; j++){
                System.out.print(" X ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 3;
        printPattern(n);
    }
}

X  X  X 
X  X 
X 



public class numberTriangle {

    public static void printPattern(int n){
        for(int i = n ; i>= 1 ; i--)
        {
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}


1 2 3 4 
1 2 3 
1 2 
1 




public class numberTriangle {

    public static void printPattern(int n){
        int number = 1 ;
        for(int i = 0 ; i<= n ; i++)
        {
            for(int j = 1 ; j<= i; j++){
                System.out.print(number+ " ");
                number++ ;
                
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}

1 
2 3 
4 5 6 
7 8 9 10 


1 
0 1 
1 0 1 
0 1 0 1 



public class numberTriangle {

    public static void printPattern(int n){
        
        for(int i = 0 ; i<= n ; i++)
        {
            for(int j = 1 ; j<= i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
               
                
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}





public class numberTriangle{

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
     *
    **
   ***
  ****
 *****
******


*/