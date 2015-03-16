package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class SwapHalves {

    public static void main(String[] args) {
        System.out.println(swapHalves("Hello, world!"));
    }

    public static String swapHalves(String text){

        int halfLength=text.length()/2;

        return text.substring(halfLength)+text.substring(0, halfLength);
    }
}
