import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитуємо програму
        System.out.print("Яку програму ви хочете завантажити (IntelliJ IDEA, Git, Java)? ");
        String program = scanner.nextLine();

        // Запитуємо ОС
        System.out.print("Яку ОС ви використовуєте (Linux, MacOS, Windows)? ");
        String os = scanner.nextLine();

        String link = "";

        switch (program.toLowerCase()) {
            case "intellij idea":
                switch (os.toLowerCase()) {
                    case "windows":
                        link = "https://www.jetbrains.com/idea/download/#section=windows";
                        break;
                    case "linux":
                        link = "https://www.jetbrains.com/idea/download/#section=linux";
                        break;
                    case "macos":
                        link = "https://www.jetbrains.com/idea/download/#section=mac";
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                        return;
                }
                break;

            case "git":
                switch (os.toLowerCase()) {
                    case "windows":
                        link = "https://git-scm.com/download/win";
                        break;
                    case "linux":
                        link = "https://git-scm.com/download/linux";
                        break;
                    case "macos":
                        link = "https://git-scm.com/download/mac";
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                        return;
                }
                break;

            case "java":
                switch (os.toLowerCase()) {
                    case "windows":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    case "linux":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    case "macos":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                        return;
                }
                break;

            default:
                System.out.println("Такої програми не існує.");
                return;
        }

        System.out.println("Посилання для завантаження: " + link);
    }
}
