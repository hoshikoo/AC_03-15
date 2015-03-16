package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class TriangleBack {

    public static void main(String[] args){
        printTrianglesBack("Hello!");
    }



    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }


    public static void printTrianglesBack(String text) {
        String triangle = "";
        int len = text.length();
        for (int i = 0; i <=text.length() ; i++) {
            String substr = text.substring(i);
            //System.out.println(substr);
            String paddedSubstr = repeat(' ', i)+substr;
            System.out.println(paddedSubstr);

        }
    }
}
