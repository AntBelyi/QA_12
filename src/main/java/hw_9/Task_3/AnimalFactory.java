package hw_9.Task_3;

public class AnimalFactory {

    public static Animal createAnimal(String odjType) {
        switch (odjType) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Bird":
                return new Bird();
            default:
                System.out.println("There isn't any such animals");
                return null;
        }
    }
}
