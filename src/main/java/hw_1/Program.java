package hw_1;

public class Program {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println("befoure a " + a);
        System.out.println("befoure b " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After a " + a);
        System.out.println("After b " + b);
    }

}
