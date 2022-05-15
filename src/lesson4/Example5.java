package lesson4;

public class Example5 {


    public static void main(String[] args) {

        int x = 10;
        int y = 88;
        {
            System.out.println("x>y");
            System.out.println("lava");
        }{
        x = 70;
        y = 90;
        if (x == y) {
            System.out.println("lava");
        }
    }}
}
