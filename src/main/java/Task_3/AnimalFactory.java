package Task_3;

public class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("bird")) {
            return new Bird();
        } else {
            System.out.println("❌ Unknown animal type: " + type);
            return null;
        }
    }
}
