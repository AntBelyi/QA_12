public class Task1 {
    public static void main(String[] args) {
        // Початковий рядок
        String string1 = "This line that i want to cut, cause it is too long";

        // Обрізаний рядок
        String string2 = string1.substring(0, string1.indexOf("it is") - 1);
        // Заміна "i" на "don't" у string2, додавання решти фрази
        String string3 = string2.replace("i", "don't") + " it is perfect";

        // Вивід кожного рядка з його довжиною
        System.out.println("string1 = " + string1);
        System.out.println("Length: " + string1.length());

        System.out.println("string2 = " + string2);
        System.out.println("Length: " + string2.length());

        System.out.println("string3 = " + string3);
        System.out.println("Length: " + string3.length());
    }
}
