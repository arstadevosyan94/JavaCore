package homework;

public class StarClass3 {
    public static void main(String[] args) {
        /**  *
            **
           ***
          ****
         *****
         **/

        for (int i = 0; i < 5; i++) {
            for (int j =5; j > i; j--)
                System.out.print(' ');
            for (int x = 0; x <= i; x++)
                System.out.print("*");
                System.out.println();

            }
        }
    }






