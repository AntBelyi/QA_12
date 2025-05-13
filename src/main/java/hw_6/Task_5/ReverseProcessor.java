package hw_6.Task_5;

public class ReverseProcessor implements TextProcessor {
    private String sentence;

    public ReverseProcessor(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String process(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return reversed;
    }

    @Override
    public String removeDigits(String text) {
        return TextProcessor.super.removeDigits(text);
    }
}
