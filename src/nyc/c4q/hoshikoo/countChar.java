package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
import java.util.Scanner;
public class countChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String someStr;
        String someChar;
        System.out.println("Enter a string: ");
        someStr = input.nextLine();
        System.out.println("Enter a character: ");
        someChar = input.nextLine();
        char charVar = someChar.charAt(0);
        charCount(someStr, charVar);
    }

    public static void charCount(String text, char letter) {

        int wordCount = 0;

        for (int i = 0; i < text.length(); i++ ) {
            if (text.charAt(i) == letter) {
                wordCount++;
            } else
                continue;
        }

        System.out.println(wordCount);

    }

}
