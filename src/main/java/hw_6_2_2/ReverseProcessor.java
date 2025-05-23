package hw_6_2_2;

public class ReverseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        String result = new StringBuilder(text).reverse().toString();
        return result;
    }
    @Override
    public String removeDigits(String originalText){
        return TextProcessor.super.removeDigits(originalText);
    }
}