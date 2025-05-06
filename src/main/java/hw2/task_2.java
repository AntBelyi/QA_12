package hw2;

public class task_2 {
    public static void main(String[] args) {
        String sentence = "Testing, is my favourite job".replace(",","");

        String[] words = sentence.split(" ");

        int firstWord= words[0].length();

        for (int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();
            boolean isFirstLonger;

            if (i == 0) {
                isFirstLonger = true;
            } else {
                isFirstLonger = firstWord > wordLength;
            }

            System.out.println("Слово" + (i + 1) + " = (" + words[i] + "), Довжина цього слова = (" + wordLength + "), " + isFirstLonger);
        }
    }
}

