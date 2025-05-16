package hw_2;

public class Task_1 {
    public static void main(String[] args) {
        String string1 = " This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 36);
        String string = " it is perfect";
        String string3 = string2.concat(string);
        System.out.println(string1 + " (length " + string1.length() + ")");
        System.out.println(string2 + " (Length " + string2.length() + ")");
        System.out.println(string3 + " (Length " + string3.length() + ")");
    }
}
