package homework;

public class FigureClass2
        /*  *
         *      * *
         * * *
         * * * *
         * * *
         * *
         *
         */ {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {

            for (int j = 3; j >= i; j--)
                System.out.print(' ');


            for (int a = 0; a <= i; a++)
                System.out.print(" *");
                System.out.println();


                    for (int x = 0; x <= 3; x++)
                        for (int z = 0; z <= x; z++)
                            System.out.print(' ');


                    for (int k = 3; k > i; k--)
                        System.out.print("* ");
                }
                System.out.println();
            }
        }
























