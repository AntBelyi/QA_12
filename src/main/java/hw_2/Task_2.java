package hw_2;

public class Task_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job".replace(",", "");
        String[] words = string.split(" ");
        String FirstWord = words[0];
        System.out.println(FirstWord);
        boolean result = true;
        for (String val : words) {
            System.out.println(val + " length " + val.length());
        }
        for (int i = 1; i < words.length; i++) {
            if (FirstWord.length() < words[i].length()) {
                result = false;
                System.out.println(result);
                break;
            }
        }
    }
}
