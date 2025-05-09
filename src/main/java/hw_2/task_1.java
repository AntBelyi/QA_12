package hw_2;

public class task_1 {

    public static void main(String[] args) {

        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        int length = string1.length();
        System.out.println("Number of symbols: " + length);


        String cut = "This line that i want to cut, cause";
        System.out.println(cut);
        int length1 = cut.length();
        System.out.println("Number of symbols: " + length1);

        System.out.println("After");

        String string2 = string1.substring(0, 35);
        System.out.println(string2);

        String string3 = (string2 + " " + "it is perfect");
        System.out.println(string3);
        int length3 = string3.length();
        System.out.println("Number of symbols: " + length3);

    }
}
