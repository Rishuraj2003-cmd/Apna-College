package pattern;
public class Number_triangle_Pattern {
    public static void pattern(int n ){
        for(int i = 0 ; i<=n ; i++)
        {
            for(int j = 0 ; j<= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n = 6 ;
        pattern(n);
    }
}



/* 
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6  

*/