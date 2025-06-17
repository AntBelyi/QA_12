package hw_6_2;

public class Application {

    public static void main(String[] args) {
        String originalText = " Good evening we are from Ukraine 1991 ";

        System.out.println("Original text: \"" + originalText + "\"\n");

        TextProcessor upperCase = new UpperCaseProcessor();
        System.out.println("UpperCase: " + upperCase.process(originalText));
        System.out.println("UpperCase removeDigits: " + upperCase.removeDigits(upperCase.process(originalText)));
        System.out.println("----------------------------------");

        TextProcessor reverse = new ReverseProcessor();
        System.out.println("Reverse: " + reverse.process(originalText));
        System.out.println("Reverse removeDigits: " + reverse.removeDigits(reverse.process(originalText)));
        System.out.println("-----------------------------------");

        TextProcessor trim = new TrimProcessor();
        System.out.println("Trim: \"" + trim.process(originalText) + "\"");
        System.out.println("Trim removeDigits: " + trim.removeDigits(trim.process(originalText)));
    }
}