package condition;

// import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 4;
        int c = 3;
        
        System.out.println("A= "+a+ ",B="+b+ ",C="+c);

        if(a>=b)
        {
            if(a>=c)
                System.out.println("A is larger");
            else{
                System.out.println("C is larger");
            }
        }
        else{
            if (b>=c) {
                System.out.println("B is larger");
                
            }
            else{
                System.out.println("C is larger");
            }
        }
      

    }
}
