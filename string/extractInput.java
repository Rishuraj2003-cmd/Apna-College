package string;

import java.util.Scanner;

public class extractInput {

    // input -> anfb2n5nj3    -> output 253 (Extract the Digits from a Calculator Input String

    public static void main(String[] args) {
        // String str = new String("Enter string including number :") ;
        System.out.println("Enter string including number :");
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( ExtractDigit(str) );
    }
    public static  String ExtractDigit(String str){
        String result = "" ;
        char ch ;
        for(int i = 0 ; i<str.length(); i++){
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result = result + ch; 
                
            }
        }
        return result ;


    }
}
