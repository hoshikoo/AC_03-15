package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class LeftOrRight {


    public static void main(String[] args) {
        System.out.print(pad("abc", 10, '*', false));
    }

    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }

    public static String pad(String text, int length, char padChar, boolean rightorLeft) {

        int difference = length - text.length();
        String padChars= repeat(padChar, length-text.length());

        if (rightorLeft) {
            return padChars+text;
        }else {
            return text+padChars;
        }

    }
}
