package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class StringBox {

        public static void main(String[] args){
            stringBox("Hello, world!");
        }

        public static void stringBox(String text){

            System.out.println("+" + repeat('-', text.length() + 2) + "+");
            System.out.println("| " + text + " |");
            System.out.println("+" +repeat('-',text.length()+2)+"+");

        }


        public static String repeat(char c, int count) {
            String result = "";
            for (int i = 0; i < count; ++i) {
                result += c;
            }
            return result;
        }

}
