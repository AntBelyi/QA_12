package hw_3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter programs (Idea, Git, Java ) :");
        String programmes = scanner.nextLine();
        System.out.println(" Enter OS (Linux, MacOS, Window ) :");
        String operatingSystem = scanner.nextLine();
       switch (programmes ) {
           case "Idea":
               switch (operatingSystem) {
                   case "Linux":
                       System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=linux");
                       break;
                   case "MacOS":
                       System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=mac");
                       break;
                   case "Window":
                       System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                       break;
               }
               break;
           case "Git":
               switch (operatingSystem){
                   case "Linux":
                       System.out.println("https://git-scm.com/downloads/linux");
                       break;
                   case "MacOS":
                       System.out.println("https://git-scm.com/downloads/mac");
                       break;
                   case "Window":
                       System.out.println("https://git-scm.com/downloads/win");
                       break;
               }
           break;
           case "Java":
               switch (operatingSystem){
                   case "Linux":
                       System.out.println("https://www.java.com/ru/download/help/linux_install.html#rpm");
                       break;
                   case "MacOS":
                       System.out.println("https://www.java.com/ru/download/help/mac_install.html");
                       break;
                   case "Window":
                       System.out.println("https://www.java.com/ru/download/help/windows_manual_download.html");
                       break;
               }
           break;
           default:
               System.out.println(" Not");
       }

    }

}
