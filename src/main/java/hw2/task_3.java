package hw2;

public class task_3 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        String[] arrayOfWords = string.split("");
        int size = arrayOfWords.length;

        String[] arrayOfSmallA = string.split("a");
        int countSmallA = arrayOfSmallA.length - 1;

        String[] arrayOfCapitalA = string.split("A");
        int countCapitalA = arrayOfCapitalA.length - 1;

        System.out.println("загальна к-сть символів у рядку:" + string.length());
        System.out.println("к-сть символів(a):" + countSmallA);
        System.out.println("к-сть символів(A):" + countCapitalA);
    }
}