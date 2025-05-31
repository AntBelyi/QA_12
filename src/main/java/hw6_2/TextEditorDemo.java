// Інтерфейс TextProcessor
interface TextProcessor {
    String process(String text);

    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}

// Клас UpperCaseProcessor
class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}

// Клас ReverseProcessor
class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

// Клас TrimProcessor
class TrimProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.trim();
    }
}

// Головний клас
public class TextEditorDemo {
    public static void main(String[] args) {
        String sampleText = "  Hello World.123. ";

        TextProcessor upper = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();

        System.out.println("--- UpperCaseProcessor ---");
        System.out.println("Processed: " + upper.process(sampleText));
        System.out.println("Without dots: " + upper.removeDigits(sampleText));

        System.out.println("\n--- ReverseProcessor ---");
        System.out.println("Processed: " + reverse.process(sampleText));
        System.out.println("Without dots: " + reverse.removeDigits(sampleText));

        System.out.println("\n--- TrimProcessor ---");
        System.out.println("Processed: " + trim.process(sampleText));
        System.out.println("Without dots: " + trim.removeDigits(sampleText));
    }
}
