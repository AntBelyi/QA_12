package hw_3;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter programs (Idea, Git, Java ) :");
        String str1 = scanner.nextLine();

        System.out.println(" Enter OS (Linux, MacOS, Window ) :");
        String str2 = scanner.nextLine();

        String string = allTogether(str1,str1);
        System.out.println(string);

        scanner.close();

    }
    public static String oSystemJava(String str2){
        switch (str2) {
            case "Linux" -> {
                return "https://www.java.com/ru/download/help/linux_install.html#rpm";
            }
            case "MacOS" -> {
                return " https://www.java.com/ru/download/help/mac_install.html";
            }
            case "Window" -> {
                return "https://www.java.com/ru/download/help/windows_manual_download.html";
            }
            default -> {
                return null;
            }
        }

    }
    public static String oSystemGit(String str2){
        switch (str2) {
            case "Linux" -> {
                return "https://git-scm.com/downloads/linux";
            }
            case "MacOS" -> {

                return "https://git-scm.com/downloads/mac";
            }
            case "Window" -> {
                System.out.println("https://git-scm.com/downloads/win");
                return "https://git-scm.com/downloads/win";
            }
            default -> {
                return null;
            }
        }
    }
    public static String oSystemIdea(String str2) {
        switch (str2) {
            case "Linux" -> {
                System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=linux");
                return "https://www.jetbrains.com/ru-ru/idea/download/?section=linux";
            }
            case "MacOS" -> {
                System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=mac");
                return "https://www.jetbrains.com/ru-ru/idea/download/?section=mac";
            }
            case "Window" -> {
                System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                return "https://www.jetbrains.com/ru-ru/idea/download/?section=windows";
            }
            default -> {
                return null;
            }
        }
    }

   public static String allTogether(String str1, String str2){

       switch (str1) {
           case "Git" -> {
               return oSystemGit(str2);
           }
           case "Java" -> {
               return oSystemJava(str2);
           }
           case "Idea" -> {
               return oSystemIdea(str2);
           }
           default -> {
               System.out.println("not");
               return null;
           }
       }


    }
}
