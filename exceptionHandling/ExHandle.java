package exceptionHandling ;

import java.util.Scanner;

public class ExHandle {

/*
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt(); 
        int divisor = sc.nextInt();
        try{
            int result = dividend/divisor;
            System.out.println("result is : "+result);
        }catch(ArithmeticException e){
            System.out.println("Divisior can't be zero");
        }
        
        sc.close();
    }


    try 
    catch 
    finally
    throw
    throws
    
 
 */

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []arr = new int[5];

    try{
        arr[6] = 10/0 ;
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException p){
        System.out.println(p.getMessage());
    }
   
 }
    
}