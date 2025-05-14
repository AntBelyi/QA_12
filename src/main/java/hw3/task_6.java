package hw3;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Яка програма вас цікавить (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine().toLowerCase();

        System.out.print("Яку ОС ви використовуєте (Linux, MacOS, Windows): ");
        String os = scanner.nextLine().toLowerCase();

        String link;
        switch (program) {
            case "intellij idea":
                switch (os) {
                    case "windows":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=windows";
                        break;
                    case "macos":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=mac";
                        break;
                    case "linux":
                        link = "https://www.jetbrains.com/ru-ru/idea/download/?section=linux";
                        break;
                    default:
                        link = "Такої ОС немає.";
                }
                break;

            case "git":
                switch (os) {
                    case "windows":
                        link = "https://git-scm.com/downloads/win";
                        break;
                    case "macos":
                        link = "https://git-scm.com/downloads/mac";
                        break;
                    case "linux":
                        link = "https://git-scm.com/downloads/linux";
                        break;
                    default:
                        link = "Такої ОС немає.";
                }
                break;

            case "java":
                switch (os) {
                    case "windows":
                        link = "https://www.oracle.com/ua/java/technologies/downloads/#jdk24-windows";
                        break;
                    case "macos":
                        link = "https://www.oracle.com/ua/java/technologies/downloads/#jdk24-mac";
                        break;
                    case "linux":
                        link = "https://www.oracle.com/ua/java/technologies/downloads/#jdk24-linux";
                        break;
                    default:
                        link = "Такої ОС немає.";
                }
                break;

            default:
                link = "Такої програми не існує.";
        }
        System.out.println(link);
        scanner.close();
    }
}