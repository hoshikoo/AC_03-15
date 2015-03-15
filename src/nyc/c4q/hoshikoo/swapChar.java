package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class swapChar {
    public static void main(String[] args) {

        String text = "Hello, World!";


        for (int i = 1; i < text.length(); i = i + 2) {
            if (text.length() % 2 == 1) {
                text = text + " ";
            }

            System.out.print(text.charAt(i));
            System.out.print(text.charAt(i - 1));


        }


    }
}
