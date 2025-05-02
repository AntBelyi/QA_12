package hw1;

public class Programme {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        System.out.println("Before changing");
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After changing");
        System.out.println(+a);
        System.out.println(+b);
    }
}
