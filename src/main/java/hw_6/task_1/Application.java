package hw_6.task_1;

public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.eat();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        Fish fish = new Fish();
        fish.swim();
        fish.eat();

    }
}
