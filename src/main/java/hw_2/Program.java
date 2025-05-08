package hw_2;

public class Program {
    public static void main(String[] args) {

        // ----------- Task 1 -----------
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, string1.indexOf(" it")); // cut up to "cause"
        String string3 = string2.replace("i want", "don't want") + " it is perfect";

        System.out.println("string1 = " + string1);
        System.out.println("Length: " + string1.length());

        System.out.println("string2 = " + string2);
        System.out.println("Length: " + string2.length());

        System.out.println("string3 = " + string3);
        System.out.println("Length: " + string3.length());


        // ----------- Task 2 -----------
        System.out.println("\n--- Task 2 ---");
        String string = "Testing, is my favourite job";
        String[] words = string.replace(",", "").split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println("Word" + (i + 1) + " = " + words[i] + ", Length = " + words[i].length());
        }

        boolean firstIsLongest = true;
        for (int i = 1; i < words.length; i++) {
            if (words[0].length() <= words[i].length()) {
                firstIsLongest = false;
                break;
            }
        }
        System.out.println("Is the first word the longest? " + firstIsLongest);


        // ----------- Task 3 -----------
        System.out.println("\n--- Task 3 ---");
        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

        // split by character 'a', then count = number of parts - 1
        String[] parts = text.split("a");
        int count = parts.length - 1;

        System.out.println("Number of times 'a' appears: " + count);
    }
}
