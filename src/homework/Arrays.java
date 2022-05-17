package homework;

public class Arrays {
    public static void main(String[] args) {
        // masivi amenamec element@
        int max = 0;
        int[] numbers = {10, 20, 15, 58, 33, 14, 65, 25, 36, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
//           System.out.print( numbers[i]+ " ");
        }
        System.out.println(max);
        System.out.println();

        //masivi amenapoqr elementner@
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println();


        System.out.println("masivi zuyg elementner");
        int zuygLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                zuygLength++;
            }
        }
        System.out.println("zuygeri qanak");
        System.out.println(zuygLength++);
        System.out.println();

        System.out.println("masivi kent elementner");
        int kentLength = 0;
        for (int i =0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
              kentLength++;
            }
        }
        System.out.println("kenteri qanak@");
        System.out.println(kentLength++);


        System.out.println("mijin tvabanakan");
        int gumar = 0;
        for (int i = 0; i < numbers.length; i++) {
            gumar = gumar+numbers[i];

        }
        System.out.println("elementneri gumar");
        System.out.println(gumar);
        System.out.println("mijin tvabanakan");
        int mijin = gumar/ numbers.length;
        System.out.println(mijin);



    }
}

