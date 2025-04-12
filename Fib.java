import java.util.Scanner;

public class Fib {
    // 0,1,1,2,3,5,8
    public static void main(String[] args) {
    int num ;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    System.out.println("Num : " + num);
    int num1 = 0, num2 = 1, nxtTerm;

    for (int i = 0; i < num; i++) {
        System.out.print(num1 + " ");
        nxtTerm = num1 + num2;
        num1 = num2;
        num2 = nxtTerm;
    }
       
        sc.close();
    }
}
