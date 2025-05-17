package hw_9.Task_3;

public class Application {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        Animal cat = AnimalFactory.createAnimal("Cat");
        Animal bird = AnimalFactory.createAnimal("bird");
        dog.speak();
        cat.speak();
        bird.speak();

    }
}
