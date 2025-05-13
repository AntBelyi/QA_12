package hw_6.Task_5;

public class TrimProcessor implements TextProcessor {
    private String sentence;

    public TrimProcessor(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String process(String text) {
        return text.trim();
    }

    @Override
    public String removeDigits(String text) {
        return TextProcessor.super.removeDigits(text);
    }
}
