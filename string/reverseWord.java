package string;


public class reverseWord {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("rishu");
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }

}

/* 
public void reverseString(char[] s) {
    int front = 0;
    int back = s.length - 1;

    while (front < back) {
        // Swap characters
        char temp = s[front];
        s[front] = s[back];
        s[back] = temp;

        front++;
        back--;
    }
}
*/

