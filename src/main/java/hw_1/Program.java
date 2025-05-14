package hw_1;

public class Program {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        // Міняємо значення місцями за допомогою арифметичних дій
        a = a + b; // a = 16
        b = a - b; // b = 7
        a = a - b; // a = 9

        // Вивід у консоль
        System.out.println("Після обміну:");
        System.out.println("a = " + a); // a = 9
        System.out.println("b = " + b); // b = 7
    }
}
