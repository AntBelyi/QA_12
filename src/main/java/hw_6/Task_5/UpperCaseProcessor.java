package hw_6.Task_5;

public class UpperCaseProcessor implements TextProcessor {
    private String sentence;

    public UpperCaseProcessor(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }

    @Override
    public String removeDigits(String text) {
        return TextProcessor.super.removeDigits(text);
    }
}
