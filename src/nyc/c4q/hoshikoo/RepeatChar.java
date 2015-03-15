package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */

public class RepeatChar {
    public static void main(String[] args){
        repeat("abc",3);
    }
    public static void repeat(String abc, int count){
        for (int i = 0; i<count; i++){
            System.out.println(abc);
        }
    }
}
