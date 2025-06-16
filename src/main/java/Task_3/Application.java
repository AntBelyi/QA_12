package hw_9.Task_3;

public class Application {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        Animal cat = factory.createAnimal("cat");
        Animal bird = factory.createAnimal("bird");

        dog.speak();
        cat.speak();
        bird.speak();
    }
}