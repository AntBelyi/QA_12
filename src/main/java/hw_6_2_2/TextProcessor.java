package hw_6_2_2;

public interface TextProcessor {
    String process(String text);

    default String removeDigits(String text) {
        return text.replaceAll("\\d", "");
    }
}