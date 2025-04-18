package string;

public class reverseSentence {

    // " i am rishu " -> "rishu am i"
    public static void main(String[] args) {
        // String s =;
        System.out.println(PrintReversedSentence( " i am rishu "));
    }

    public static String PrintReversedSentence(String str) {
        String[] words = str.trim().split("\\s+"); 
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString().trim(); 
    }
}
