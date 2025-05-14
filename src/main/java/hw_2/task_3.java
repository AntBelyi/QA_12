package hw_2;

public class task_3 {
    public static void main(String[] args) {

        String string = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        System.out.println(string);

        String[] cuts_a = string.split("a");
        String[] cuts_A = string.split("A");
        int a = cuts_a.length - 1;
        int A = cuts_A.length - 1;

        System.out.println(a);
        System.out.println(A);


        int result = A + a;
        System.out.println(result);
    }
}
