package string;

public class upperCase {
    public static void main(String[] args) {
        String str = "hey, i am rishu ";
        toUppercase(str);
    }

    public static void toUppercase(String str) {
        StringBuilder sb = new StringBuilder();

        // Handle first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && Character.isLetter(str.charAt(i))) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
