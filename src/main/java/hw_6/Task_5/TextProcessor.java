package hw_6.Task_5;

public interface TextProcessor {

    String process(String text);

    default String removeDigits(String text) {
        //return text.replace("[0-9]","");
        return text.replaceAll("\\d", "");
    }


}
