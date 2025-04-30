package hw_2;

public class Task_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        int a = string.indexOf(' ');
        System.out.println(a);
        String[] words = string.split(" ");
        for (String val : words) {
            System.out.println(val + " length " + val.length());
        }
        for (int i = 1; i < words.length; i++) {
            if (a < words[i].length()) {
                System.out.println(" true ");
            }
            System.out.println(" false");
            break;
        }
    }
}
