package string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal ,  Panama";
        CheckPalindrome(str);
    }
    public static boolean CheckPalindrome(String str){

        for(int i = 0 ; i<str.length()/2 ; i++){
            int n = str.length();
            if((str.charAt(i)!= str.charAt(n-1-i)))
            {

                System.out.println("Not palindrome");
                return false ;

            }
        }
        System.out.println(" palindrome");
        return true ;
       
    }
}
