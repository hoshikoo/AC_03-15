package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
import java.util.Scanner;
public class reverseString2 {

    public static void reverseString2(String text) {

        int length = text.length();
        for(int i=length-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String userInput = input.nextLine();
        reverseString2(userInput);
    }


}
