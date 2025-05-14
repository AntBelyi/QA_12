package hw;

public class hw_1 {

    public static void main(String[] args) {


        int a = 7;
        int b = 9;

        System.out.println("Before changing");
        System.out.println(a);
        System.out.println(b);

        System.out.println("After changing");


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println(a);
        System.out.println(b);


    }
}
