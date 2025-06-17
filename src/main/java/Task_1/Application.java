package Task_1;

public class Application {
    public static void main(String[] args) {

        Bird bird = new Bird();
        System.out.println("Bird behavior:");
        bird.eat();
        bird.sleep();
        bird.fly();

        Fish fish = new Fish();
        System.out.println("Fish behavior:");
        fish.eat();
        fish.sleep();
        fish.swim();

        Dog dog = new Dog();
        System.out.println("Dog behavior:");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}