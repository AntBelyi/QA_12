package hw_6_2;

public class UpperCaseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
    @Override
    public String removeDigits(String text){
        return TextProcessor.super.removeDigits(text);
    }
}