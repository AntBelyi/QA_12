package hw_2;

public class task_2 {
    public static void main(String[] args) {

        String string = "Testing, is my favourite job";
        System.out.println(string);

        String[] words = string.replace(",", "").split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Слово" + (i + 1) + " = " + words[i] + ", Довжина цього слова = " + words[i].length());

            boolean firstwordlonger = true;
            for (int a = 1; a < words.length;a++) {
                if (words[0].length() <= words[a].length()) {
                    firstwordlonger = false;
                    break;

                }
            }
            System.out.println(firstwordlonger);
        }
    }
}

