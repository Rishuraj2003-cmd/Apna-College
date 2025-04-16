package string;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder(" ");
        // for(char ch = 'a'; ch<='z';ch++){
        //     // System.out.print(" "+ch+ " ");
        //     sb.append(ch+ " ");
        // }
        // System.out.println(sb); //  a b c d e f g h i j k l m n o p q r s t u v w x y z 
        // System.out.println(sb.length());    //53

        // --------------- upper case 
        StringBuilder sb = new StringBuilder("mahadev is love . ");
        System.out.println(sb);
        
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLetter(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
                // break;
            }
            
        }

        System.out.println("After: " + sb);
    

//-----------



        // sb.setCharAt(4,'u');
        // sb.insert(3,"j");
        // System.out.println(sb);
        // System.out.println(sb.length());
        // sb.delete(3,4);

        // System.out.println(sb);
        // System.out.println(sb.length());

    
    }
}
