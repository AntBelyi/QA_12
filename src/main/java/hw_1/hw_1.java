    package hw_1;

    public class hw_1 {
    public static void main(String[] args){

        int a = 7;
        int b = 9;

        System.out.println("Before changing");
        System.out.println(a);
        System.out.println(b);


        int fuu = a;
        a = b;
        b = fuu;
        System.out.println("After changing");
        System.out.println(a);
        System.out.println(b);

    }

}
