package hw_2;

public class Task_3 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        int b = string.length();
        String[] arrayOfString = string.split("");
        int number = 0;
        for (String val : arrayOfString) {
            for (int i = 0; i < val.length(); i++) {
                char a = val.charAt(i);
                if (a == 'a' || a == 'A') {
                    number++;
                }
            }
        }
        System.out.println(number);
    }
}
