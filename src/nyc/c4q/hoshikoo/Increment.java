package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class Increment {
    public static void main(String[] args) {
        int i = 17;
        System.out.println(i);

        int x = i++;  // postincrement
        System.out.println(i);
        System.out.println("x = " + x);

        int y = ++i;  // preincrement
        System.out.println(i);
        System.out.println("y = " + y);
    }
}
