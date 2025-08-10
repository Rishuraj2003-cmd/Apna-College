package Recursion;
// google microsoft
// import String.StringBuilder;

public class RemoveDuplicateString {
    public static void removeDupicates(String str , int idx , StringBuilder newStr , boolean map[]){
        // base case 
        if (idx == str.length()) {
            System.out.println(newStr);
            return ;
        }
        // kaam
        char currChar = str.charAt(idx);

        if (map[currChar-'a']== true) {
            // duplicate
            removeDupicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true ;
            removeDupicates(str, idx+1, newStr, map);
        }
    }
    public static void main(String[] args) {
        String str = "apppnaaaclllgg" ;
        removeDupicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}
