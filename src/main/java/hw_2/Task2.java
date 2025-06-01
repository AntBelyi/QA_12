public class Task2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        // Розбиваємо рядок на слова, очищаючи від ком
        String[] words = string.replace(",", "").split(" ");

        // Виводимо кожне слово та його довжину
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word" + (i + 1) + " = " + words[i] +
                    ", Length of this word = " + words[i].length());
        }

        // Перевірка: чи перше слово довше за інші
        boolean isFirstLongest = true;
        int firstLength = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstLength) {
                isFirstLongest = false;
                break;
            }
        }

        System.out.println("Is the first word the longest? " + isFirstLongest);
    }
}
