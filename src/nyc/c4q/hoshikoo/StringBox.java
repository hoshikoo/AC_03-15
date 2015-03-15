package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/15/15.
 */
public class StringBox {

        public static void main(String[] args){
            stringBox("Hello, world!");
        }

        public static void stringBox(String text){
            String startEnd = "+";
            System.out.print(startEnd);

            for(int i=0; i<text.length()+2;i++){
                System.out.print("-");
            }

            System.out.print(startEnd);
            System.out.println();

            System.out.println("| "+text+" |");

            System.out.print(startEnd);

            for(int i=0; i<text.length()+2;i++){
                System.out.print("-");
            }
            System.out.print(startEnd);
        }
}
