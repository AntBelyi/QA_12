// TextProcessor interface
interface TextProcessor {
    String process(String text);

    // Default method to remove all dots (крапок)
    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}

// UpperCaseProcessor class
class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}

// ReverseProcessor class
class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

// TrimProcessor class
class TrimProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.trim();
    }
}

// Main class for demonstration
public class TextEditorMain {
    public static void main(String[] args) {
        System.out.println("--- Text Editor Operations ---");

        // Create instances of text processors
        UpperCaseProcessor upperCaseProcessor = new UpperCaseProcessor();
        ReverseProcessor reverseProcessor = new ReverseProcessor();
        TrimProcessor trimProcessor = new TrimProcessor(); // Corrected instantiation

        String originalText1 = "hello world. this is a test.";
        String originalText2 = "       Java Programming.      ";
        String originalText3 = "Another example. for. processing.";

        // --- Demonstrate process() method ---
        System.out.println("\n--- Demonstrating process() method ---");

        System.out.println("Original Text 1: \"" + originalText1 + "\"");
        String processedUpperCase = upperCaseProcessor.process(originalText1);
        System.out.println("UpperCaseProcessor result: \"" + processedUpperCase + "\"");

        System.out.println("\nOriginal Text 2: \"" + originalText2 + "\"");
        String processedTrim = trimProcessor.process(originalText2);
        System.out.println("TrimProcessor result: \"" + processedTrim + "\"");

        System.out.println("\nOriginal Text 3: \"" + originalText3 + "\"");
        String processedReverse = reverseProcessor.process(originalText3);
        System.out.println("ReverseProcessor result: \"" + processedReverse + "\"");


        // --- Demonstrate default removeDigits() method ---
        System.out.println("\n--- Demonstrating default removeDigits() method (removing dots) ---");

        System.out.println("Original Text 1: \"" + originalText1 + "\"");
        String noDotsUpperCase = upperCaseProcessor.removeDigits(originalText1);
        System.out.println("After removeDigits (UpperCaseProcessor instance): \"" + noDotsUpperCase + "\"");

        System.out.println("\nOriginal Text 2: \"" + originalText2 + "\"");
        String noDotsTrim = trimProcessor.removeDigits(originalText2);
        System.out.println("After removeDigits (TrimProcessor instance): \"" + noDotsTrim + "\"");

        System.out.println("\nOriginal Text 3: \"" + originalText3 + "\"");
        String noDotsReverse = reverseProcessor.removeDigits(originalText3);
        System.out.println("After removeDigits (ReverseProcessor instance): \"" + noDotsReverse + "\"");

        System.out.println("\n--- End of Text Editor Operations ---");
    }
}