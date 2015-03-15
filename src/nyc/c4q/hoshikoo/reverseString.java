package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class reverseString {
    public static void reverseString(String text) {

        int length = text.length();
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));

        }
    }

    public static void main(String[] args) {
        reverseString("Hello, world!");
        }
}

