package string;

import java.util.Scanner;

public class concept {
    public static void main(String[] args) {
        char arr[]={'A','B','C','D'};
        String str = "Rishu";
        System.out.println(str);
        // System.out.println(arr);

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println("MY NAME IS : " +name);
        // System.out.println("String length : " +name.length());
        // System.out.println(name.charAt(3));
        printChar(str);
    }
    public static void printChar(String str){
        for(int i = 0 ; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
