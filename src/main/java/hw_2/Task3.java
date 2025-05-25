public class Task3 {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        // Приводимо текст до нижнього регістру
        String lowerText = text.toLowerCase();

        // Розбиваємо рядок по символу 'a'
        String[] parts = lowerText.split("a");

        // Кількість входжень = кількість частин - 1
        int count = parts.length - 1;

        System.out.println("The character 'a' occurs " + count + " times.");
    }
}
