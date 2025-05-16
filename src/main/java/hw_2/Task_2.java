package hw_2;

public class Task_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] words = string.split(" ");
        String firstWord = words[0].replace(",", "");
        System.out.println(firstWord);
        boolean result = true;
        for (String val : words) {
            System.out.println(val + " length " + val.length());
        }
        for (int i = 1; i < words.length; i++) {
            if (firstWord.length() < words[i].length()) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
