package string;

public class LofLastWord {
    public static void main(String[] args) {
        String str = " a ";
        System.out.println(wordLength(str));
    }
    public static int wordLength(String s){
        String str = s.trim();
        int count = 0;
        for(int i = str.length()-1 ; i>0 ; i--){
           if (str.charAt(i)!=' ') {
            count++ ;
           }
           else{
            break ;
           }
        }
        return count ;
    }
}
