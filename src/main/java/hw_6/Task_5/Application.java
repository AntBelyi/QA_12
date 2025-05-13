package hw_6.Task_5;

public class Application {
    public static void main(String[] args) {
        String sentence = "    Hello. How are you. My phone 75.35.65     ";
        UpperCaseProcessor upperCaseProcessor = new UpperCaseProcessor(sentence);

        System.out.println(upperCaseProcessor.process(sentence));
        System.out.println(upperCaseProcessor.removeDigits(sentence));

        ReverseProcessor reverseProcessor = new ReverseProcessor(sentence);

        System.out.println(reverseProcessor.process(sentence));
        System.out.println(reverseProcessor.removeDigits(sentence));

        TrimProcessor trimProcessor = new TrimProcessor(sentence);

        System.out.println(trimProcessor.process(sentence));
        System.out.println(trimProcessor.removeDigits(sentence));


    }
}
