package hw2;

public class task_2 {
    public static void main(String[] args) {
        String sentence = "Testing, is my favourite job".replace(",","");

        String[] words = sentence.split(" ");
        boolean isFirstLonger = true;
        int firstWordLength = words[0].length();

        for (int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();
            if (firstWordLength < wordLength) { isFirstLonger = false;}

            System.out.println("Слово" + (i + 1) + " = (" + words[i] + "), Довжина цього слова = (" + wordLength + "), " + isFirstLonger);
        }
    }
}